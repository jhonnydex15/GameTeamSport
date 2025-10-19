package com.devst.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AyudaActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);

        Button btnCorreo = findViewById(R.id.btnCorreo);
        btnCorreo.setOnClickListener(v -> enviarCorreo());

    }

    private void enviarCorreo(){
        try {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:"));
            emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"gameteamsport@gmail.com"});
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Consulta sobre Game Team Sport");
            startActivity(Intent.createChooser(emailIntent, "Enviar correo..."));
        } catch (Exception e) {
            Toast.makeText(this, "Error al abrir correo del cliente", Toast.LENGTH_SHORT).show();
        }
    }
}
