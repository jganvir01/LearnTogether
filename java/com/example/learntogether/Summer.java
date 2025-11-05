package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Summer extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summer);
        setContentView(R.layout.activity_summer);
        mp = MediaPlayer.create(this,R.raw.summerseason);
        mp.start();
    }

    public void playsummer(View view) {mp.start();
    }

    public void evs(View view) {
        Intent i = new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }

    public void winter(View view) {
        Intent i = new Intent(getApplicationContext(),Winter.class);
        startActivity(i);
    }
}