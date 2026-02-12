package com.creysvpn.app;

import static android.content.pm.ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;

public class PcapVpnService extends VpnService {

    private static final String TAG = "VPN";
    private static final String CHANNEL_ID = "vpn_channel";

    private ParcelFileDescriptor vpnInterface;
    private volatile boolean isRunning = false;
    private Thread nativeThread;

    private static volatile String currentIP = "";
    private static volatile int currentPort = 0;

    // Native C++ methods
    private native void startNativePcap(int fd);
    private native void stopNativePcap();
    private native String getNativeIP();
    private native int getNativePort();

    static {
        System.loadLibrary("pcap");
    }

    public static String getCurrentIP() {
        return currentIP;
    }

    public static int getCurrentPort() {
        return currentPort;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (!isRunning) {
            isRunning = true;
            createNotification();
            startVPN();
        }
        return START_STICKY;
    }

    @SuppressLint("ForegroundServiceType")
    private void createNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID, "VPN Service", NotificationManager.IMPORTANCE_LOW);
            NotificationManager manager = getSystemService(NotificationManager.class);
            if (manager != null) {
                manager.createNotificationChannel(channel);
            }
        }

        Notification.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            builder = new Notification.Builder(this, CHANNEL_ID);
        } else {
            builder = new Notification.Builder(this);
        }

        Notification notification = builder
                .setContentTitle("CreysVPN")
                .setContentText("Active")
                .setSmallIcon(android.R.drawable.ic_menu_info_details)
                .build();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            startForeground(1, notification, FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
        } else {
            startForeground(1, notification);
        }
    }

    private void startVPN() {
        try {
            vpnInterface = new Builder()
                    .setSession("CreysVPN")
                    .addAddress("10.0.0.2", 32)
                    .addRoute("0.0.0.0", 0)
                    .setMtu(1500)
                    .establish();

            if (vpnInterface == null) {
                Log.e(TAG, "Failed to establish VPN");
                stopSelf();
                return;
            }

            final int fd = vpnInterface.getFd();
            Log.i(TAG, "✅ VPN FD: " + fd);

            // Запускаем C++ PCAP
            nativeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    startNativePcap(fd);
                }
            });
            nativeThread.setPriority(Thread.MAX_PRIORITY);
            nativeThread.start();

            // Синхронизация IP каждые 100ms
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    if (isRunning) {
                        currentIP = getNativeIP();
                        currentPort = getNativePort();
                        new Handler(Looper.getMainLooper()).postDelayed(this, 100);
                    }
                }
            });

        } catch (Exception e) {
            Log.e(TAG, "Error", e);
            stopSelf();
        }
    }

    @Override
    public void onDestroy() {
        isRunning = false;
        stopNativePcap();

        if (nativeThread != null) {
            nativeThread.interrupt();
        }

        if (vpnInterface != null) {
            try { vpnInterface.close(); } catch (Exception e) {}
        }

        super.onDestroy();
    }
}
