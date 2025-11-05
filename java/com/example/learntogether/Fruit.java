package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Fruit extends AppCompatActivity {
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
    fruitsFragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        vp=findViewById(R.id.viewp2);

        FragmentManager fm= getSupportFragmentManager();
        adapter =new fruitsFragmentAdapter(fm,getLifecycle());
        vp.setAdapter(adapter);
        mp1 = MediaPlayer.create(this,R.raw.apple);
        mp2 = MediaPlayer.create(this,R.raw.banana);
        mp3 = MediaPlayer.create(this,R.raw.grapes);
        mp4 = MediaPlayer.create(this,R.raw.mango);
        mp5 = MediaPlayer.create(this,R.raw.sapodillaplum);
        mp6 = MediaPlayer.create(this,R.raw.malabarplum);
        mp7 = MediaPlayer.create(this,R.raw.pineapple);
        mp8 = MediaPlayer.create(this,R.raw.orange);
        mp9 = MediaPlayer.create(this,R.raw.strawberry);
    }

    public void evs(View view) {
        Intent i=new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }

    public void fruitsnveg(View view) {
        Intent i=new Intent(getApplicationContext(),FruitsandVeg.class);
        startActivity(i);
    }

    public void apple(View view) {mp1.start();
    }
    public void banana(View view) {mp2.start();
    }
    public void grapes(View view) {mp3.start();
    }
    public void mango(View view) {mp4.start();
    }
    public void sapodilla(View view) {mp5.start();
    }
    public void malabarplum(View view) {mp6.start();
    }
    public void pineapple(View view) {mp7.start();
    }
    public void orange(View view) {mp8.start();
    }
    public void strawberry(View view) {mp9.start();
    }




}