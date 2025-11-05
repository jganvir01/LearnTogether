package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class opposites extends AppCompatActivity {
    ImageView i;
    MediaPlayer mp4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opposites);
    }
    public void opposite_to_home(View view)
    {
        Intent i=new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }
    public void opposite_to_english(View view)
    {
        Intent i=new Intent(getApplicationContext(),English.class);
        startActivity(i);
    }
    public void changeImage(View view)
    {
        int id = view.getId();
        if(id== R.id.huge)
        {
            i=(ImageView) findViewById(R.id.huge);
            i.setImageResource(R.drawable.tiny);
            mp4 = MediaPlayer.create(this, R.raw.a_huge_and_tiny);
            mp4.start();
        }
        else if(id== R.id.old)
        {
            i=(ImageView) findViewById(R.id.old);
            i.setImageResource(R.drawable.young);
            mp4 = MediaPlayer.create(this, R.raw.a_old_and_young);
            mp4.start();
        }
        else if(id== R.id.fast)
        {
            i=(ImageView) findViewById(R.id.fast);
            i.setImageResource(R.drawable.slow);
            mp4 = MediaPlayer.create(this, R.raw.a_fast_and_slow);
            mp4.start();
        }
        else if(id== R.id.tall)
        {
            i=(ImageView) findViewById(R.id.tall);
            i.setImageResource(R.drawable.shortt);
            mp4 = MediaPlayer.create(this, R.raw.a_tall_and_short);
            mp4.start();
        }
     }
}