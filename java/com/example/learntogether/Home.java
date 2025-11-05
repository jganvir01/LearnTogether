package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import android.media.MediaPlayer;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {
    ViewPager2 vp;
    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;
    MediaPlayer mp5;
    MediaPlayer mp6;
    homeFragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        vp=findViewById(R.id.viewp);

        FragmentManager fm= getSupportFragmentManager();
        adapter =new homeFragmentAdapter(fm,getLifecycle());
        vp.setAdapter(adapter);
        mp1 = MediaPlayer.create(this,R.raw.livingroom);
        mp2 = MediaPlayer.create(this,R.raw.kitchen);
        mp3 = MediaPlayer.create(this,R.raw.diningroom);
        mp4 = MediaPlayer.create(this,R.raw.bedroom);
        mp5 = MediaPlayer.create(this,R.raw.bathroom);
        mp6 = MediaPlayer.create(this,R.raw.laundryroom);
    }

    public void evs(View view) {
        Intent i=new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }

    public void aboutme(View view) {
        Intent i=new Intent(getApplicationContext(),AboutMe.class);
        startActivity(i);
    }

    public void playliving(View view) {mp1.start();
    }
    public void playkitchen(View view) {mp2.start();
    }
    public void playdining(View view) {mp3.start();
    }
    public void playbedroom(View view) {mp4.start();
    }
    public void playbath(View view) {mp5.start();
    }
    public void playlaundry(View view) {mp6.start();
    }
}