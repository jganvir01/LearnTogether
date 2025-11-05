package com.example.learntogether;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GoodHabits extends AppCompatActivity {
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_habits);
        setTitle("Good Habits");

        final Button gh1=findViewById(R.id.button10);
        final MediaPlayer[] mp1 = {MediaPlayer.create(context, R.raw.gh1)};
        gh1.setOnClickListener(v -> {
            try{
                if(mp1[0].isPlaying()){
                    mp1[0].stop();
                    mp1[0].release();
                    mp1[0] = MediaPlayer.create(context,R.raw.gh1);
                }
                mp1[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });


        final Button gh2=findViewById(R.id.button11);
        final MediaPlayer[] mp2 = {MediaPlayer.create(context, R.raw.hg2)};
        gh2.setOnClickListener(v -> {
            try{
                if(mp2[0].isPlaying()){
                    mp2[0].stop();
                    mp2[0].release();
                    mp2[0] = MediaPlayer.create(context,R.raw.hg2);
                }
                mp2[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        final Button gh3=findViewById(R.id.button);
        final MediaPlayer[] mp3 = {MediaPlayer.create(context, R.raw.gh3)};
        gh3.setOnClickListener(v -> {
            try{
                if(mp3[0].isPlaying()){
                    mp3[0].stop();
                    mp3[0].release();
                    mp3[0] = MediaPlayer.create(context,R.raw.gh3);
                }
                mp3[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        final Button gh4=findViewById(R.id.button8);
        final MediaPlayer[] mp4 = {MediaPlayer.create(context, R.raw.gh4)};
        gh4.setOnClickListener(v -> {
            try{
                if(mp4[0].isPlaying()){
                    mp4[0].stop();
                    mp4[0].release();
                    mp4[0] = MediaPlayer.create(context,R.raw.gh4);
                }
                mp4[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        final Button gh5=findViewById(R.id.button5);
        final MediaPlayer[] mp5 = {MediaPlayer.create(context, R.raw.gh5)};
        gh5.setOnClickListener(v -> {
            try{
                if(mp5[0].isPlaying()){
                    mp5[0].stop();
                    mp5[0].release();
                    mp5[0] = MediaPlayer.create(context,R.raw.gh5);
                }
                mp5[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });


        final Button gh6=findViewById(R.id.button3);
        final MediaPlayer[] mp6 = {MediaPlayer.create(context, R.raw.gh6)};
        gh6.setOnClickListener(v -> {
            try{
                if(mp6[0].isPlaying()){
                    mp6[0].stop();
                    mp6[0].release();
                    mp6[0] = MediaPlayer.create(context,R.raw.gh6);
                }
                mp6[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        final Button gh7=findViewById(R.id.button4);
        final MediaPlayer[] mp7 = {MediaPlayer.create(context, R.raw.gh7)};
        gh7.setOnClickListener(v -> {
            try{
                if(mp7[0].isPlaying()){
                    mp7[0].stop();
                    mp7[0].release();
                    mp7[0] = MediaPlayer.create(context,R.raw.gh7);
                }
                mp7[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });
        final Button gh8=findViewById(R.id.button7);
        final MediaPlayer[] mp8 = {MediaPlayer.create(context, R.raw.ggh)};
        gh8.setOnClickListener(v -> {
            try{
                if(mp8[0].isPlaying()){
                    mp8[0].stop();
                    mp8[0].release();
                    mp8[0] = MediaPlayer.create(context,R.raw.ggh);
                }
                mp8[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });
    }
   public void habbits_to_ettiquettes(View view)
   {
       Intent i= new Intent(getApplicationContext(),Etiquettes.class);
       startActivity(i);
   }
    public void habbits_to_page2(View view)
    {
        Intent i= new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }
}