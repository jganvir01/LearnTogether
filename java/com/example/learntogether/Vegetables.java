package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
public class Vegetables extends AppCompatActivity {
    ViewPager2 vp;
    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;
    MediaPlayer mp5;
    MediaPlayer mp6;
    MediaPlayer mp7;
    MediaPlayer mp8;
    MediaPlayer mp9;
    vegetableFragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);
        vp=findViewById(R.id.viewp3);

        FragmentManager fm= getSupportFragmentManager();
        adapter =new vegetableFragmentAdapter(fm,getLifecycle());
        vp.setAdapter(adapter);
        mp1 = MediaPlayer.create(this,R.raw.tomato);
        mp2 = MediaPlayer.create(this,R.raw.okra);
        mp3 = MediaPlayer.create(this,R.raw.bellpepper);
        mp4 = MediaPlayer.create(this,R.raw.bottlegourd);
        mp5 = MediaPlayer.create(this,R.raw.carrot);
        mp6 = MediaPlayer.create(this,R.raw.eggplant);
        mp7 = MediaPlayer.create(this,R.raw.beetroot);
        mp8 = MediaPlayer.create(this,R.raw.onion);
        mp9 = MediaPlayer.create(this,R.raw.spinach);
    }
    public void evs(View view) {
        Intent i=new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }

    public void fruitsnveg(View view) {
        Intent i=new Intent(getApplicationContext(),FruitsandVeg.class);
        startActivity(i);
    }

    public void tomato(View view) {mp1.start();
    }
    public void okra(View view) {mp2.start();
    }
    public void bellpaper(View view) {mp3.start();
    }
    public void bottlegourd(View view) {mp4.start();
    }
    public void carrot(View view) {mp5.start();
    }
    public void eggplant(View view) {mp6.start();
    }
    public void beetroot(View view) {mp7.start();
    }
    public void onion(View view) {mp8.start();
    }
    public void spinach(View view) {mp9.start();
    }
}