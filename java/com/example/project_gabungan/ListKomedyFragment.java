package com.example.project_gabungan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ListKomedyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_komedy, container, false);

        // Temukan ImageView di XML layout
        ImageView gambar = view.findViewById(R.id.gambar);
        ImageView gambar1 = view.findViewById(R.id.gambar1);

        // Tambahkan pendengar klik pada gambar pertama
        gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke ActionFragment saat gambar pertama diklik
                Fragment komediFragment = new KomediFragment();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.container, komediFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        // Tambahkan pendengar klik pada gambar kedua
        gambar1.setOnClickListener(v -> {
            // Pindah ke Action1Fragment saat gambar kedua diklik
            Fragment komedi1Fragment = new Komedi1Fragment();
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.container, komedi1Fragment)
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}
