package com.nextu.camc.libreria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.nextu.camc.milibreria.clsCalculdor;

public class actPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lytprincipal);
        double varPromedio = clsCalculdor.funFormula(9.5, 8.6, 8.4);
        Log.i("Promedio", ((Double)varPromedio).toString());
    }
}
