package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class numbers extends AppCompatActivity {
    ViewPager2 vp1;
    NumberFragment f;
    MediaPlayer one_1,two_2,three_3,four_4, five_5,six_6,seven_7,eight_8,nine_9,ten_10,eleven_11,twelve_12,thirteen_13,fourteen_14,fifteen_15,sixteen_16,seventeen_17,eighteen_18,nineteen_19,twenty_20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        vp1= findViewById(R.id.vp);
        FragmentManager fm = getSupportFragmentManager();
        f = new NumberFragment(fm,getLifecycle());
        vp1.setAdapter(f);

        one_1 = MediaPlayer.create(this,R.raw.onw);
        two_2 = MediaPlayer.create(this,R.raw.twoo);
        three_3= MediaPlayer.create(this,R.raw.threee);
        four_4= MediaPlayer.create(this,R.raw.fourr);
        five_5= MediaPlayer.create(this,R.raw.fivee);
        six_6 = MediaPlayer.create(this,R.raw.sixx);
        seven_7 = MediaPlayer.create(this,R.raw.sevenn);
        eight_8 = MediaPlayer.create(this,R.raw.eightt);
        nine_9 = MediaPlayer.create(this,R.raw.ninee);
        ten_10 = MediaPlayer.create(this,R.raw.tenn);
        eleven_11 = MediaPlayer.create(this, R.raw.elevenn);
        twelve_12 = MediaPlayer.create(this, R.raw.twelvee);
        thirteen_13 = MediaPlayer.create(this, R.raw.thirteenn);
        fourteen_14 = MediaPlayer.create(this, R.raw.fourteenn);
        fifteen_15 = MediaPlayer.create(this, R.raw.fifteenn);
        sixteen_16 =  MediaPlayer.create(this, R.raw.sixteenn);
        seventeen_17 = MediaPlayer.create(this, R.raw.seventeenn);
        eighteen_18 = MediaPlayer.create(this, R.raw.eighteenn);
        nineteen_19 = MediaPlayer.create(this, R.raw.nineteenn);
        twenty_20 = MediaPlayer.create(this, R.raw.twentyy);
    }
    public void one(View view){
        one_1.start();
    }
    public void two(View v){
        two_2.start();
    }
    public void three(View view){
        three_3.start();
    }
    public void four(View view){
        four_4.start();
    }
    public void five(View view){
        five_5.start();
    }
    public void six(View view){
        six_6.start();
    }
    public void seven(View view){
        seven_7.start();
    }
    public void eight(View view){
        eight_8.start();
    }
    public void nine(View view){
        nine_9.start();
    }
    public void ten(View view){
        ten_10.start();
    }
    public void eleven(View view){
        eleven_11.start();
    }
    public void twelve(View view){
        twelve_12.start();
    }
    public void thirteen(View view){
        thirteen_13.start();
    }
    public void fourteen(View view){
        fourteen_14.start();
    }
    public void fifteen(View view){
        fifteen_15.start();
    }
    public void sixteen(View view){
        sixteen_16.start();
    }
    public void seventeen(View view){
        seventeen_17.start();
    }
    public void eighteen(View view){
        eighteen_18.start();
    }
    public void nineteen(View view){
        nineteen_19.start();
    }
    public void twenty(View view){
        twenty_20.start();
    }

    public void back_math(View view){
        Intent i = new Intent(getApplicationContext(), Math.class);
        startActivity(i);
    }
    public void math_home(View view)
    {
        Intent i= new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }

}