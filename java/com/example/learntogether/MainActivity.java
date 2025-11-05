package com.example.learntogether;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_one);

        MediaPlayer mp = MediaPlayer.create(this, R.raw.audio_start_music);
        mp.start();
    }
    public void LetsGetStarted(View view)
    {
        Intent i = new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }
}