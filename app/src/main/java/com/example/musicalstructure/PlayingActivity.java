package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.musicalstructure.databinding.ActivityPlayingBinding;

public class PlayingActivity extends AppCompatActivity {
    private ActivityPlayingBinding binding;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlayingBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        binding.playSongTitle.setText(intent.getStringExtra("song title"));
        binding.playSingerName.setText(intent.getStringExtra("singer name"));

        mMediaPlayer = MediaPlayer.create(PlayingActivity.this, intent.getIntExtra("song resource Id", 1));
        clickPlay();
        clickPause();
    }

    private void clickPlay() {
        binding.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer.start();
            }
        });
    }

    private void clickPause() {
        binding.pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaPlayer.pause();
            }
        });
    }
}