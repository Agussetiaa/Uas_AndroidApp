package com.example.project_gabungan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Komedi1Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_komedi1, container, false);

        // Temukan ImageView di XML layout
        ImageView imageKomedi = view.findViewById(R.id.imageKomedi1);

        // Tambahkan pendengar klik pada gambar
        imageKomedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika gambar diklik, buka video
                openVideo();
            }
        });

        return view;
    }

    // Fungsi untuk membuka video
    private void openVideo() {
        // Ganti "https://www.example.com/komedi_video.mp4" dengan URL video yang sesuai
        String videoUrl = "https://www.youtube.com/watch?v=olXfjgN1WWo";

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(videoUrl));
        startActivity(intent);
    }
}
