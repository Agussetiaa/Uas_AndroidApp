package com.example.project_gabungan;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.StyledPlayerView;

public class MyVidio extends AppCompatActivity {

    private ExoPlayer player;
    private int videoRawResourceId = R.raw.cuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myvidio);

        StyledPlayerView playerView = findViewById(R.id.playerView);
        player = new ExoPlayer.Builder(this).build();
        playerView.setPlayer(player);

        // Buat URI dari resource ID video
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + videoRawResourceId);
        MediaItem mediaItem = MediaItem.fromUri(videoUri);

        // Set sumber video ke ExoPlayer
        player.setMediaItem(mediaItem);
        player.prepare();
        player.setPlayWhenReady(true);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (player != null) {
            player.setPlayWhenReady(false);
            player.release();
            player = null;
        }
    }
}
