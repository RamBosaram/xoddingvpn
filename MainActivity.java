package com.creysvpn.app;

import android.app.Activity;
import android.content.Intent;
import android.net.VpnService;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final int VPN_REQUEST = 100;
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startVpnFlow();
            }
        });
    }

    private void startVpnFlow() {
        Intent intent = VpnService.prepare(this);
        if (intent != null) {
            startActivityForResult(intent, VPN_REQUEST);
        } else {
            startVpnService();
        }
    }

    @Override
    protected void onActivityResult(int request, int result, Intent data) {
        super.onActivityResult(request, result, data);

        if (request == VPN_REQUEST && result == RESULT_OK) {
            startVpnService();
        } else {
            Toast.makeText(this, "VPN permission denied", Toast.LENGTH_SHORT).show();
        }
    }

    private void startVpnService() {
        Intent serviceIntent = new Intent(this, PcapVpnService.class);
        startService(serviceIntent);

        Intent overlayIntent = new Intent(this, OverlayService.class);
        startService(overlayIntent);

        Toast.makeText(this, "VPN Started!", Toast.LENGTH_SHORT).show();

        Intent vpnIntent = new Intent(this, VpnActivity.class);
        startActivity(vpnIntent);
    }
}
