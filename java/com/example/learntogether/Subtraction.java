package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Subtraction extends AppCompatActivity {
    MediaPlayer minus1,minus2,minus3,minus4;
    ViewPager2 vp3;
    SubtractionFragment f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);
        vp3  = findViewById(R.id.vpsub);
        FragmentManager fmm = getSupportFragmentManager();
        f = new SubtractionFragment(fmm,getLifecycle());
        vp3.setAdapter(f);

        minus1 = MediaPlayer.create(this,R.raw.sevenminusfive);
        minus2 = MediaPlayer.create(this,R.raw.twominustwp);
        minus3 = MediaPlayer.create(this,R.raw.sixminusthree);
        minus4 = MediaPlayer.create(this,R.raw.threeminustwo);
    }
    public void back_math(View view){
        Intent i = new Intent(getApplicationContext(), Math.class);
        startActivity(i);
    }
    public void sevenminusfive(View view){
        minus1.start();
    }
    public void twominustwo(View view){
        minus2.start();
    }
    public void sixminusthree(View view){
        minus3.start();
    }
    public void threeminustwo(View view){
        minus4.start();
    }

}