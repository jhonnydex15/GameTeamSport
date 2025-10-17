package com.devst.app;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


public class PhotoActivity extends AppCompatActivity{

    private final ActivityResultLauncher<String> requestPermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), isGranted -> {
        if (isGranted) {
            abrirCamara();
        } else {

            Toast.makeText(this, "Permiso de cámara denegado", Toast.LENGTH_SHORT).show();
        }
    });

    private ImageView imageView;

    private final ActivityResultLauncher<String> galleryLauncher = registerForActivityResult(new ActivityResultContracts.GetContent(), uri -> {
        if (uri != null) {
            imageView.setImageURI(uri);
        } else {
            Toast.makeText(this, "No se seleccionó ninguna imagen", Toast.LENGTH_SHORT).show();
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        Button btnTomarFoto = findViewById(R.id.btnTomarFoto);
        btnTomarFoto.setOnClickListener(v -> {
            permisosCamara();
        });

        Button btnSeleccionarFoto = findViewById(R.id.btnSeleccionarFoto);
        btnSeleccionarFoto.setOnClickListener(v -> {
            abrirGaleria();
        });

        imageView = findViewById(R.id.imagenSeleccionada);
    }

    private void permisosCamara() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
            abrirCamara();
        } else {
            requestPermissionLauncher.launch(Manifest.permission.CAMERA);
        }
    }

    private void abrirCamara() {
        try {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "Error al abrir la cámara", Toast.LENGTH_SHORT).show();
        }
    }

    private void abrirGaleria() {
        try {
            galleryLauncher.launch("image/*");
        } catch (Exception e) {
            Toast.makeText(this, "Error al abrir la galería", Toast.LENGTH_SHORT).show();
        }
    }

}
