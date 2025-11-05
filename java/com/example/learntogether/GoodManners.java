package com.example.learntogether;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GoodManners extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_manners);
        setTitle("Good Manners");
        Context context=this;
        final MediaPlayer[] mp1 = {MediaPlayer.create(context, R.raw.beagoodfriend)};
        final MediaPlayer[] mp2={MediaPlayer.create(context,R.raw.donotyell)};
        final Button gm1= findViewById(R.id.button26);
        final Button gm2=findViewById(R.id.button29);
        gm1.setOnClickListener(v -> {
            try{
                if(mp1[0].isPlaying()){
                    mp1[0].stop();
                    mp1[0].release();
                    mp1[0] =MediaPlayer.create(context,R.raw.beagoodfriend);
                }
                mp1[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        gm2.setOnClickListener(v -> {
            try{
                if(mp2[0].isPlaying()){
                    mp2[0].stop();
                    mp2[0].release();
                    mp2[0] =MediaPlayer.create(context,R.raw.donotyell);
                }
                mp2[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        final MediaPlayer[] mp3={MediaPlayer.create(context,R.raw.cleanup)};
        final Button gm3= findViewById(R.id.button30);
        gm3.setOnClickListener(v -> {
            try{
                if(mp3[0].isPlaying()){
                    mp3[0].stop();
                    mp3[0].release();
                    mp3[0] =MediaPlayer.create(context,R.raw.cleanup);
                }
                mp3[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        final MediaPlayer[] mp4={MediaPlayer.create(context,R.raw.bekind)};
        final Button gm4= findViewById(R.id.button16);
        gm4.setOnClickListener(v -> {
            try{
                if(mp4[0].isPlaying()){
                    mp4[0].stop();
                    mp4[0].release();
                    mp4[0] =MediaPlayer.create(context,R.raw.bekind);
                }
                mp4[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });


        final MediaPlayer[] mp5={MediaPlayer.create(context,R.raw.taketurns)};
        final Button gm5= findViewById(R.id.button17);
        gm5.setOnClickListener(v -> {
            try{
                if(mp5[0].isPlaying()){
                    mp5[0].stop();
                    mp5[0].release();
                    mp5[0] =MediaPlayer.create(context,R.raw.taketurns);
                }
                mp5[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        final MediaPlayer[] mp6={MediaPlayer.create(context,R.raw.gm6)};
        final Button gm6= findViewById(R.id.button18);
        gm6.setOnClickListener(v -> {
            try{
                if(mp6[0].isPlaying()){
                    mp6[0].stop();
                    mp6[0].release();
                    mp6[0] =MediaPlayer.create(context,R.raw.gm6);
                }
                mp6[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });


        final MediaPlayer[] mp7={MediaPlayer.create(context,R.raw.gm7)};
        final Button gm7= findViewById(R.id.button24);
        gm7.setOnClickListener(v -> {
            try{
                if(mp7[0].isPlaying()){
                    mp7[0].stop();
                    mp7[0].release();
                    mp7[0] =MediaPlayer.create(context,R.raw.gm7);
                }
                mp7[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        final MediaPlayer[] mp8={MediaPlayer.create(context,R.raw.gm8)};
        final Button gm8= findViewById(R.id.button19);
        gm8.setOnClickListener(v -> {
            try{
                if(mp8[0].isPlaying()){
                    mp8[0].stop();
                    mp8[0].release();
                    mp8[0] =MediaPlayer.create(context,R.raw.gm8);
                }
                mp8[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });


        final MediaPlayer[] mp9={MediaPlayer.create(context,R.raw.gm9)};
        final Button gm9= findViewById(R.id.button21);
        gm9.setOnClickListener(v -> {
            try{
                if(mp9[0].isPlaying()){
                    mp9[0].stop();
                    mp9[0].release();
                    mp9[0] =MediaPlayer.create(context,R.raw.gm9);
                }
                mp9[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });


       final MediaPlayer[] mp10={MediaPlayer.create(context,R.raw.gm10)};
        final Button gm10= findViewById(R.id.button22);
        gm10.setOnClickListener(v -> {
            try{
                if(mp10[0].isPlaying()){
                    mp10[0].stop();
                    mp10[0].release();
                    mp10[0] =MediaPlayer.create(context,R.raw.gm10);
                }
                mp10[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });


        final MediaPlayer[] mp11={MediaPlayer.create(context,R.raw.gm11)};
        final Button gm11= findViewById(R.id.button23);
        gm11.setOnClickListener(v -> {
            try{
                if(mp11[0].isPlaying()){
                    mp11[0].stop();
                    mp11[0].release();
                    mp11[0] =MediaPlayer.create(context,R.raw.gm11);
                }
                mp11[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });


        final MediaPlayer[] mp12={MediaPlayer.create(context,R.raw.gm12)};
        final Button gm12= findViewById(R.id.button20);
        gm12.setOnClickListener(v -> {
            try{
                if(mp12[0].isPlaying()){
                    mp12[0].stop();
                    mp12[0].release();
                    mp12[0] =MediaPlayer.create(context,R.raw.gm12);
                }
                mp12[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        final MediaPlayer[] mp13={MediaPlayer.create(context,R.raw.gm13)};
        final Button gm13= findViewById(R.id.button25);
        gm13.setOnClickListener(v -> {
            try{
                if(mp13[0].isPlaying()){
                    mp13[0].stop();
                    mp13[0].release();
                    mp13[0] =MediaPlayer.create(context,R.raw.gm13);
                }
                mp13[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        final MediaPlayer[] mp14={MediaPlayer.create(context,R.raw.gm14)};
        final Button gm14= findViewById(R.id.button27);
        gm14.setOnClickListener(v -> {
            try{
                if(mp14[0].isPlaying()){
                    mp14[0].stop();
                    mp14[0].release();
                    mp14[0] =MediaPlayer.create(context,R.raw.gm14);
                }
                mp14[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });


        final MediaPlayer[] mp15={MediaPlayer.create(context,R.raw.gm15)};
        final Button gm15= findViewById(R.id.button28);
        gm15.setOnClickListener(v -> {
            try{
                if(mp15[0].isPlaying()){
                    mp15[0].stop();
                    mp15[0].release();
                    mp15[0] =MediaPlayer.create(context,R.raw.gm15);
                }
                mp15[0].start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

    }

    public void manners_to_ettiquettes(View view)
    {
        Intent i= new Intent(getApplicationContext(),Etiquettes.class);
        startActivity(i);
    }
    public void manners_to_page2(View view)
    {
        Intent i= new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }

}