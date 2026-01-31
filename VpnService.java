package com.creysvpn.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class VpnActivity extends Activity {

    private Button btnVpn;
    private TextView tvStatus;
    private TextView tvPing;
    private TextView tvServer;

    private Handler handler;
    private Runnable updater;
    private boolean isVpnActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vpn);

        btnVpn = findViewById(R.id.btnVpn);
        tvStatus = findViewById(R.id.tvStatus);
        tvPing = findViewById(R.id.tvPing);
        tvServer = findViewById(R.id.tvServer);

        btnVpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVpn();
            }
        });

        updateVpnUI();
        startUpdater();
    }

    private void toggleVpn() {
        if (isVpnActive) {
            stopVpn();
        } else {
            startVpn();
        }
    }

    private void startVpn() {
        Intent serviceIntent = new Intent(this, PcapVpnService.class);
        startService(serviceIntent);

        Intent overlayIntent = new Intent(this, OverlayService.class);
        startService(overlayIntent);

        isVpnActive = true;
        updateVpnUI();
        startUpdater();

        Toast.makeText(this, "VPN Started", Toast.LENGTH_SHORT).show();
    }

    private void stopVpn() {
        Intent serviceIntent = new Intent(this, PcapVpnService.class);
        stopService(serviceIntent);

        Intent overlayIntent = new Intent(this, OverlayService.class);
        stopService(overlayIntent);

        isVpnActive = false;
        updateVpnUI();

        if (handler != null && updater != null) {
            handler.removeCallbacks(updater);
        }

        Toast.makeText(this, "VPN Stopped", Toast.LENGTH_SHORT).show();
    }

    private void updateVpnUI() {
        if (isVpnActive) {
            btnVpn.setText("■");
            btnVpn.setBackgroundResource(R.drawable.button_vpn_on);
            tvStatus.setText("ПОДКЛЮЧЕНО");
            tvStatus.setTextColor(0xFF00FF00);
        } else {
            btnVpn.setText("▶");
            btnVpn.setBackgroundResource(R.drawable.button_vpn_off);
            tvStatus.setText("ОТКЛЮЧЕНО");
            tvStatus.setTextColor(0xFF888888);
            tvPing.setText("Пинг: -- ms");
            tvServer.setText("Сервер: --");
        }
    }

    private void startUpdater() {
        handler = new Handler();
        updater = new Runnable() {
            @Override
            public void run() {
                if (isVpnActive) {
                    String ip = PcapVpnService.getCurrentIP();
                    int port = PcapVpnService.getCurrentPort();

                    if (!ip.isEmpty() && port != 0) {
                        tvServer.setText("Сервер: " + ip + ":" + port);
                        tvPing.setText("Пинг: ~50 ms");
                    } else {
                        tvServer.setText("Сервер: Ожидание...");
                        tvPing.setText("Пинг: -- ms");
                    }

                    handler.postDelayed(this, 500);
                }
            }
        };
        handler.post(updater);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler != null && updater != null) {
            handler.removeCallbacks(updater);
        }
    }
}
