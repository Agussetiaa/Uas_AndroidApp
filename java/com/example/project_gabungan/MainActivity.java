package com.example.project_gabungan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.MediaStore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private CardView buttonFirst;
    private CardView buttonSecond;
    private CardView buttonHallo;
    private CardView buttonFibo;
    private CardView buttonScroll;
    private CardView buttonAlarm;
    private CardView buttonTelpon;
    private CardView buttonMaps;
    private CardView buttonKalender;
    private CardView buttonkamera;
    private CardView buttonMovie_Agus;
    private CardView buttonMyVidio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSecond = findViewById(R.id.twoactivity);
        buttonFirst = findViewById(R.id.twoactivity);
        buttonHallo = findViewById(R.id.hallo);
        buttonFibo = findViewById(R.id.fibo);
        buttonScroll = findViewById(R.id.scroll);
        buttonAlarm = findViewById(R.id.SetAlarm);
        buttonTelpon = findViewById(R.id.Telpon);
        buttonMaps = findViewById(R.id.maps);
        buttonKalender = findViewById(R.id.kalender);
        buttonkamera = findViewById(R.id.kamera);
        buttonMovie_Agus = findViewById(R.id.movie_agus);
        buttonMyVidio = findViewById(R.id.My_vidio);

        setToolbar();
        setIntent();
    }

    private void setToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("AGUS SETIAWAN");
            getSupportActionBar().setSubtitle(getResources().getString(R.string.app_name));
        }
    }

    private void setIntent() {
        buttonSecond.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
            finish();
        });

        buttonFirst.setOnClickListener(v -> {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        });

        buttonHallo.setOnClickListener(v -> {
            Intent intent = new Intent(this, HalloActivity.class);
            startActivity(intent);
        });

        buttonFibo.setOnClickListener(v -> {
            Intent intent = new Intent(this, Fibonancci.class);
            startActivity(intent);
        });

        buttonScroll.setOnClickListener(view -> {
            Intent intent = new Intent(this, ScrollSianida.class);
            startActivity(intent);
        });

        buttonAlarm.setOnClickListener(view -> {
            Intent intent = new Intent(AlarmClock.ACTION_SHOW_ALARMS);
            startActivity(intent);
        });

        buttonTelpon.setOnClickListener(view -> {
            String numberDeveloper = "083841542026";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + numberDeveloper));
            startActivity(intent);
        });

        buttonMaps.setOnClickListener(view -> {
            // Ganti geoLocation dengan lokasi yang sesuai
            Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/UNIVERSITAS+PELITA+BANGSA/@-6.2863948,106.8353142,10z/data=!4m10!1m2!2m1!1slokasi+pelita+bangsa!3m6!1s0x2e699b0c08ad8d01:0x2b18001d1b1371f9!8m2!3d-6.324617!4d107.169155!15sChRsb2thc2kgcGVsaXRhIGJhbmdzYZIBCnVuaXZlcnNpdHngAQA!16s%2Fg%2F1hm2jxhj1?entry=ttu");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });

        buttonkamera.setOnClickListener(view -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        });

        buttonKalender.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("content://com.android.calendar/time/"));
            startActivity(intent);
        });

        buttonMovie_Agus.setOnClickListener(view -> {
            Intent intent = new Intent(this, MovieAgusActivity.class);
            startActivity(intent);
        });
        buttonMyVidio.setOnClickListener(view -> {
            Intent intent = new Intent(this, MyVidio.class);
            startActivity(intent);
        });
    }
}
