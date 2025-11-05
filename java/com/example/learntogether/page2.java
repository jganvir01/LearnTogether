package com.example.learntogether;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page2 extends AppCompatActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.audio_start_music);
        mp1.start();

           }
    public void english(View view)
    {
        i = new Intent(getApplicationContext(),English.class);
        startActivity(i);
    }
    public void Maths(View view)
    {
        i = new Intent(getApplicationContext(),Math.class);
        startActivity(i);
    }
    public void EVS(View view)
    {
        i = new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }
    public void Etiquettes(View view)
    {
        i = new Intent(getApplicationContext(),Etiquettes.class);
        startActivity(i);
    }
    public void RhymesAndStories(View view)
    {
        i = new Intent(getApplicationContext(),RhymesAndStories.class);
        startActivity(i);
    }
}