package com.devst.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAyuda = findViewById(R.id.btnAyuda);
        btnAyuda.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AyudaActivity.class);
            startActivity(intent);
        });

        Button btnMapa = findViewById(R.id.btnMapa);
        btnMapa.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MapActivity.class);
            startActivity(intent);
        });

        Button btnFotos = findViewById(R.id.btnFotos);
        btnFotos.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PhotoActivity.class);
            startActivity(intent);
        });
    }

}