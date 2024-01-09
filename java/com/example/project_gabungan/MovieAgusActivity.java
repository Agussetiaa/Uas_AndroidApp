package com.example.project_gabungan;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MovieAgusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_agus);

        BottomNavigationView bottomNavView = findViewById(R.id.bottomNavView); // Sesuaikan dengan ID yang ada di activity.xml
        bottomNavView.setOnNavigationItemSelectedListener(this::onNavigationItemSelected);

        // Set default fragment to ListActionFragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new ListActionFragment()).commit();
    }

    private boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment = null;

        int itemId = item.getItemId();
        if (itemId == R.id.listActionItem) {
            selectedFragment = new ListActionFragment();
        } else if (itemId == R.id.listKomedyItem) {
            selectedFragment = new ListKomedyFragment();
        } else if (itemId == R.id.listRomanceItem) {
            selectedFragment = new ListRomaceFragment();
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, selectedFragment).commit();
        return true;
    }
}
