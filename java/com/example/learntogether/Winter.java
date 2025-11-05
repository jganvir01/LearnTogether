package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Winter extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winter);
        mp = MediaPlayer.create(this,R.raw.winterseason);
        mp.start();
    }

    public void playwinter(View view) {mp.start();

    }

    public void evs(View view) {
        Intent i = new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }

    public void rainy(View view) {
        Intent i = new Intent(getApplicationContext(),Rainy.class);
        startActivity(i);
    }

    public void summer(View view) {
        Intent i = new Intent(getApplicationContext(),Summer.class);
        startActivity(i);
    }
}