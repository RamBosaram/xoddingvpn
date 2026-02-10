package com.creysvpn.app;

import static android.content.pm.ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class OverlayService extends Service {

    private WindowManager windowManager;
    private int layoutFlag;

    private View goButtonView;
    private View ipView;
    private View bannerView;
    private View notificationView;

    private LinearLayout overlayRoot;
    private TextView tvOverlayIP;
    private TextView tvNotification;

    private WindowManager.LayoutParams goParams;

    private Vibrator vibrator;
    private Handler mainHandler;
    private Handler checkHandler;
    private Runnable checkRunnable;

    private int initialX, initialY;
    private float initialTouchX, initialTouchY;

    private static final int NOTIFICATION_ID = 1;
    private static final String CHANNEL_ID = "overlay_channel";
    private static final String NTFY_TOPIC = "creysvpn_server_ip";

    private String currentServerIP = "";
    private int currentServerPort = 0;
    private String lastSentIP = "";
    private boolean hasSentThisMatch = false;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
       super.onCreate();

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        mainHandler = new Handler(Looper.getMainLooper());
        checkHandler = new Handler(Looper.getMainLooper());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            layoutFlag = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            layoutFlag = WindowManager.LayoutParams.TYPE_PHONE;
        }

        showNotificationBar();
        createAllOverlays();
        startIPChecking();
    }

    @SuppressLint("ForegroundServiceType")
    private void showNotificationBar() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel(
                        CHANNEL_ID,
                        "Overlay Service",
                        NotificationManager.IMPORTANCE_LOW
                );
                NotificationManager manager = getSystemService(NotificationManager.class);
                if (manager != null) {
                    manager.createNotificationChannel(channel);
                }
            }

            Intent intent = new Intent(this, VpnActivity.class);
            int flags = PendingIntent.FLAG_UPDATE_CURRENT;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                flags |= PendingIntent.FLAG_IMMUTABLE;
            }
            PendingIntent pending = PendingIntent.getActivity(this, 0, intent, flags);

            Notification.Builder builder;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                builder = new Notification.Builder(this, CHANNEL_ID);
            } else {
                builder = new Notification.Builder(this);
            }

            Notification notification = builder
                    .setContentTitle("CreysVPN")
                    .setContentText("Активен")
                    .setSmallIcon(android.R.drawable.ic_menu_info_details)
                    .setContentIntent(pending)
                    .setOngoing(true)
                    .build();

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                startForeground(NOTIFICATION_ID, notification, FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
            } else {
                startForeground(NOTIFICATION_ID, notification);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createAllOverlays() {
        LayoutInflater inflater = LayoutInflater.from(this);

        // Уведомление
        notificationView = inflater.inflate(R.layout.overlay_notification, null);
        tvNotification = notificationView.findViewById(R.id.tvNotification);
        WindowManager.LayoutParams notifParams = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                layoutFlag,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                PixelFormat.TRANSLUCENT
        );
        notifParams.gravity = Gravity.TOP | Gravity.CENTER_HORIZONTAL;
        notifParams.y = 80;
        notificationView.setVisibility(View.GONE);
        windowManager.addView(notificationView, notifParams);

        // Баннер
        bannerView = inflater.inflate(R.layout.overlay_banner, null);
        WindowManager.LayoutParams bannerParams = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                layoutFlag,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                PixelFormat.TRANSLUCENT
        );
        bannerParams.gravity = Gravity.TOP | Gravity.CENTER_HORIZONTAL;
        bannerParams.y = 30;
        windowManager.addView(bannerView, bannerParams);

        // IP текст
        ipView = inflater.inflate(R.layout.overlay_ip, null);
        tvOverlayIP = ipView.findViewById(R.id.tvOverlayIP);
        WindowManager.LayoutParams ipParams = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                layoutFlag,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                PixelFormat.TRANSLUCENT
        );
        ipParams.gravity = Gravity.TOP | Gravity.RIGHT;
        ipParams.x = 10;
        ipParams.y = 70;
        windowManager.addView(ipView, ipParams);

        // Кнопка GO
        goButtonView = inflater.inflate(R.layout.overlay_layout, null);
        overlayRoot = goButtonView.findViewById(R.id.overlayRoot);
        goParams = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                layoutFlag,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT
        );
        goParams.gravity = Gravity.TOP | Gravity.RIGHT;
        goParams.x = 20;
        goParams.y = 180;
        setupGoButtonTouch();
        windowManager.addView(goButtonView, goParams);
    }

    private void setupGoButtonTouch() {
        goButtonView.setOnTouchListener(new View.OnTouchListener() {
            private long touchStart;
            private boolean moved;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        touchStart = System.currentTimeMillis();
                        moved = false;
                        initialX = goParams.x;
                        initialY = goParams.y;
                        initialTouchX = event.getRawX();
                        initialTouchY = event.getRawY();
                        return true;

                    case MotionEvent.ACTION_MOVE:
                        float dx = initialTouchX - event.getRawX();
                        float dy = event.getRawY() - initialTouchY;
                        if (Math.abs(dx) > 10 || Math.abs(dy) > 10) {moved = true;
                            goParams.x = initialX + (int) dx;
                            goParams.y = initialY + (int) dy;
                            try {
                                windowManager.updateViewLayout(goButtonView, goParams);
                            } catch (Exception e) {}
                        }
                        return true;

                    case MotionEvent.ACTION_UP:
                        if (!moved && System.currentTimeMillis() - touchStart < 300) {
                            handleGoClick();
                        }
                        return true;
                }
                return false;
            }
        });
    }

    private void handleGoClick() {
//        if (vibrator != null) vibrator.vibrate(50);

        if (currentServerIP.isEmpty() || currentServerPort == 0) {
            showNotification("IP не найден!", false);
            return;
        }

        String serverAddr = currentServerIP + ":" + currentServerPort;

        if (hasSentThisMatch && serverAddr.equals(lastSentIP)) {
            showNotification("Уже отправлено!", false);
            return;
        }

        sendToCloud(serverAddr);
    }

    private void showNotification(final String text, final boolean success) {
        mainHandler.removeCallbacksAndMessages(null);

        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                tvNotification.setText(text);

                if (success) {
                    tvNotification.setBackgroundResource(R.drawable.notification_success);
                } else {
                    tvNotification.setBackgroundResource(R.drawable.notification_error);
                }

                notificationView.setVisibility(View.VISIBLE);
            }
        });

        mainHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                notificationView.setVisibility(View.GONE);
            }
        }, 2000);
    }

    private void startIPChecking() {
        checkRunnable = new Runnable() {
            @Override
            public void run() {
                final String ip = PcapVpnService.getCurrentIP();
                final int port = PcapVpnService.getCurrentPort();

                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (!ip.isEmpty() && port > 0) {
                            String newAddr = ip + ":" + port;
                            if (!newAddr.equals(lastSentIP)) {
                                hasSentThisMatch = false;
                                overlayRoot.setBackgroundResource(R.drawable.overlay_button_background);
                            }

                            currentServerIP = ip;
                            currentServerPort = port;
                            tvOverlayIP.setText(newAddr);
                            ipView.setVisibility(View.VISIBLE);
                        } else {
                            tvOverlayIP.setText("Ожидание...");
                        }
                    }
                });

                checkHandler.postDelayed(this, 500);
            }
        };
        checkHandler.post(checkRunnable);
    }

    private void sendToCloud(final String server) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://ntfy.sh/" + NTFY_TOPIC);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("POST");
                    conn.setRequestProperty("Title", "Server");
                    conn.setConnectTimeout(5000);
                    conn.setReadTimeout(5000);
                    conn.setDoOutput(true);OutputStream os = conn.getOutputStream();
                    os.write(server.getBytes());
                    os.flush();
                    os.close();

                    final int code = conn.getResponseCode();
                    conn.disconnect();

                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            if (code == 200) {
                                hasSentThisMatch = true;
                                lastSentIP = server;
                                overlayRoot.setBackgroundResource(R.drawable.overlay_button_active);
                                showNotification("Успешно!", true);
                            } else {
                                showNotification("Ошибка: " + code, false);
                            }
                        }
                    });

                } catch (Exception e) {
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            showNotification("Ошибка сети!", false);
                        }
                    });
                }
            }
        }).start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mainHandler.removeCallbacksAndMessages(null);
        if (checkHandler != null && checkRunnable != null) {
            checkHandler.removeCallbacks(checkRunnable);
        }

        try { windowManager.removeView(goButtonView); } catch (Exception e) {}
        try { windowManager.removeView(ipView); } catch (Exception e) {}
        try { windowManager.removeView(bannerView); } catch (Exception e) {}
        try { windowManager.removeView(notificationView); } catch (Exception e) {}
    }
}