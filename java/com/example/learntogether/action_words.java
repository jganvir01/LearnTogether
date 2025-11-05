package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import com.google.android.material.tabs.TabLayout;

public class action_words extends AppCompatActivity
{
    ViewPager2 vp_action;
    MediaPlayer mp_action;
    VideoView v;
    action_wordsFragment aw;
    TabLayout tl_action;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_words);

        tl_action = findViewById(R.id.action_word_tab_layout);
        vp_action  = findViewById(R.id.action_word_view_pager);

        FragmentManager fm_action = getSupportFragmentManager();
        aw = new action_wordsFragment(fm_action,getLifecycle());
        vp_action.setAdapter(aw);

        tl_action.addTab(tl_action.newTab().setText("Reading"));
        tl_action.addTab(tl_action.newTab().setText("Cycling"));
        tl_action.addTab(tl_action.newTab().setText("Eating"));
        tl_action.addTab(tl_action.newTab().setText("Running"));
        tl_action.addTab(tl_action.newTab().setText("Swimming"));
        tl_action.addTab(tl_action.newTab().setText("Climbing"));

        tl_action.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                vp_action.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}
            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });

        vp_action.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tl_action.selectTab(tl_action.getTabAt(position));
            }
        });
    }
    public void actionToHome(View view)
    {
        Intent i = new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }
    public void actionToEnglish(View view)
    {
        Intent i = new Intent(getApplicationContext(),English.class);
        startActivity(i);
    }
    public void playVideo(View view)
    {
        int id=view.getId();
        if(id== R.id.reading)
        {
            v = (VideoView) findViewById(R.id.reading);
            v.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video_reading);
            v.start();
            mp_action = MediaPlayer.create(this, R.raw.audio_reading);
            mp_action.start();
        }
        else if(id== R.id.climbing)
        {
            v = (VideoView) findViewById(R.id.climbing);
            v.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video_climbing);
            v.start();
            mp_action = MediaPlayer.create(this, R.raw.audio_climbing);
            mp_action.start();
        }
        else if(id== R.id.cycling)
        {
            v = (VideoView) findViewById(R.id.cycling);
            v.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video_cycling);
            v.start();
            mp_action = MediaPlayer.create(this, R.raw.audio_cycling);
            mp_action.start();
        }
        else if(id== R.id.eating)
        {
            v = (VideoView) findViewById(R.id.eating);
            v.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video_eating);
            v.start();
            mp_action = MediaPlayer.create(this, R.raw.audio_eating);
            mp_action.start();
        }
        else if(id== R.id.running)
        {
            v = (VideoView) findViewById(R.id.running);
            v.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video_running);
            v.start();
            mp_action = MediaPlayer.create(this, R.raw.audio_running);
            mp_action.start();
        }
        else if(id== R.id.swimming)
        {
            v = (VideoView) findViewById(R.id.swimming);
            v.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video_swimming);
            v.start();
            mp_action = MediaPlayer.create(this, R.raw.audio_swimming);
            mp_action.start();
        }
    }

}