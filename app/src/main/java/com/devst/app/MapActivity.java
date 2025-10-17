package com.devst.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MapActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button btnCoordenada = findViewById(R.id.btnCoordenada1);
        btnCoordenada.setOnClickListener(v -> abrirMapa());

        Button btnAgregarEvento = findViewById(R.id.btnAgregarEvento);
        btnAgregarEvento.setOnClickListener(v -> agregarEvento());
    }

    private void abrirMapa() {
        try {
            double latitud = 40.453054;
            double longitud = -3.688344;
            String label = "ubicación de evento";

            String uriSring = "geo:" + latitud + "," + longitud + "?q="+ Uri.encode(label);
            Uri uri = Uri.parse(uriSring);
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
        catch (Exception e) {
            Toast.makeText(this, "Error al abrir el mapa", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("QueryPermissionsNeeded")
    private void agregarEvento() {
        try {
            Calendar beginTime = Calendar.getInstance();
            beginTime.set(2025, Calendar.NOVEMBER, 1, 12, 0);
            Calendar endTime = Calendar.getInstance();
            endTime.set(2025, Calendar.NOVEMBER, 1, 15, 0);

            Intent intentEvento = new Intent(Intent.ACTION_INSERT)
                    .setData(CalendarContract.Events.CONTENT_URI)
                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                    .putExtra(CalendarContract.Events.TITLE, "Torneo CSGO")
                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "donde el billy")
                    .putExtra(CalendarContract.Events.AVAILABILITY, CalendarContract.Events.AVAILABILITY_BUSY);
            startActivity(intentEvento);
        }
        catch (Exception e) {
            Toast.makeText(this, "Error al agregar el evento", Toast.LENGTH_SHORT).show();
        }

    }
}
