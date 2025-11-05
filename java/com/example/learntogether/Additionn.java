package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Additionn extends AppCompatActivity {
    MediaPlayer equal,equal1,equal2,equal3;
    ViewPager2 vp2;
    AdditionFragment ff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additionn);
        equal = MediaPlayer.create(this,R.raw.twoplustwo);
        equal1 = MediaPlayer.create(this,R.raw.fiveplusthree);
        equal2 = MediaPlayer.create(this,R.raw.twoplusthree);
        equal3 = MediaPlayer.create(this,R.raw.nineplustwo);
        vp2  = findViewById(R.id.vpadd);
        FragmentManager fmm = getSupportFragmentManager();
        ff = new AdditionFragment(fmm,getLifecycle());
        vp2.setAdapter(ff);

    }
    public void back_math(View view){
        Intent i = new Intent(getApplicationContext(), Math.class);
        startActivity(i);
    }
    public void twoplustwo(View view){

        equal.start();
    }
    public void fiveplusthree(View view){
        equal1.start();
    }
    public void twoplusthree(View view){
        equal2.start();
    }
    public void nineplustwo(View view){
        equal3.start();
    }


}