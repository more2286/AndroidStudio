package com.nextu.camc.libreriasexternas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.*;
import android.bluetooth.*;
import android.net.wifi.*;

public class actPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lytprincipal);

        WifiManager objWifiManager;
        Sensor objSensor;
        BluetoothManager objBluetoothManager;
    }
}
