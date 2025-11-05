package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Spring extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring);
        mp = MediaPlayer.create(this,R.raw.springseason);
        mp.start();
    }

    public void playspring(View view) {mp.start();
    }

    public void evs(View view) {
        Intent i = new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }

    public void rainy(View view) {
        Intent i = new Intent(getApplicationContext(),Rainy.class);
        startActivity(i);
    }
}