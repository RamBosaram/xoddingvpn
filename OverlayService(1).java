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
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OverlayService extends Service {

    // VPS настройки
    private static final String VPS_URL = "http://hungrywifi.ru:1488";
    private static final int COOLDOWN_SECONDS = 180; // 3 минуты

    private WindowManager windowManager;
    private int layoutFlag;

    private View goButtonView;
    private View ipView;
    private View bannerView;
    private View notificationView;

    private LinearLayout overlayRoot;
    private TextView tvOverlayText;
    private TextView tvOverlayIP;
    private TextView tvNotification;

    private WindowManager.LayoutParams goParams;

    private Handler mainHandler;
    private Handler checkHandler;
    private Runnable checkRunnable;

    private int initialX, initialY;
    private float initialTouchX, initialTouchY;

    private static final int NOTIFICATION_ID = 1;
    private static final String CHANNEL_ID = "overlay_channel";

    private String currentServerIP = "";
    private int currentServerPort = 0;

    // Таймер
    private boolean onCooldown = false;
    private int cooldownRemaining = 0;

    private OkHttpClient httpClient;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        mainHandler = new Handler(Looper.getMainLooper());
        checkHandler = new Handler(Looper.getMainLooper());

        httpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();

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
        tvOverlayText = goButtonView.findViewById(R.id.tvOverlayText);

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
                        if (Math.abs(dx) > 10 || Math.abs(dy) > 10) {
                            moved = true;
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
        if (onCooldown) {
            showNotification("Подожди " + formatTime(cooldownRemaining), false);
            return;
        }

        if (currentServerIP.isEmpty() || currentServerPort == 0) {
            showNotification("IP не найден!", false);
            return;
        }

        sendToVPS(currentServerIP, currentServerPort);
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
                        // 🔥 ПОКАЗЫВАЕМ ТОЛЬКО ЕСЛИ ПОРТ 5-ЗНАЧНЫЙ
                        if (!ip.isEmpty() && port >= 10000 && port <= 99999) {
                            currentServerIP = ip;
                            currentServerPort = port;
                            tvOverlayIP.setText(ip + ":" + port);
                            ipView.setVisibility(View.VISIBLE);
                        } else {
                            tvOverlayIP.setText("Ожидание...");
                        }
                    }
                });

                checkHandler.postDelayed(this, 100); // Проверка каждые 100ms
            }
        };
        checkHandler.post(checkRunnable);
    }

    // ===== ОТПРАВКА НА VPS =====
    private void sendToVPS(final String ip, final int port) {
        try {
            JSONObject json = new JSONObject();
            json.put("ip", ip);
            json.put("port", port);
            json.put("action", "start");

            MediaType JSON_TYPE = MediaType.parse("application/json; charset=utf-8");
            RequestBody body = RequestBody.create(json.toString(), JSON_TYPE);

            Request request = new Request.Builder()
                    .url(VPS_URL)
                    .post(body)
                    .addHeader("Content-Type", "application/json")
                    .build();

            showNotification("send..", false);

            httpClient.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            showNotification("Ошибка VPS!", false);
                        }
                    });
                }

                @Override
                public void onResponse(Call call, Response response) {
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            if (response.isSuccessful()) {
                                showNotification("Успешно!", true);
                                overlayRoot.setBackgroundResource(R.drawable.overlay_button_active);
                                startCooldown();
                            } else {
                                showNotification("Ошибка: " + response.code(), false);
                            }
                        }
                    });
                    response.close();
                }
            });

        } catch (Exception e) {
            showNotification("Ошибка: " + e.getMessage(), false);
        }
    }

    // ===== ТАЙМЕР 3 МИНУТЫ =====
    private void startCooldown() {
        onCooldown = true;
        cooldownRemaining = COOLDOWN_SECONDS;

        tvOverlayText.setText(formatTime(cooldownRemaining));

        mainHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                cooldownRemaining--;

                if (cooldownRemaining > 0) {
                    tvOverlayText.setText(formatTime(cooldownRemaining));
                    mainHandler.postDelayed(this, 1000);
                } else {
                    onCooldown = false;
                    tvOverlayText.setText("GO");
                    overlayRoot.setBackgroundResource(R.drawable.overlay_button_background);
                }
            }
        }, 1000);
    }

    private String formatTime(int seconds) {
        int m = seconds / 60;
        int s = seconds % 60;
        return String.format("%d:%02d", m, s);
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
