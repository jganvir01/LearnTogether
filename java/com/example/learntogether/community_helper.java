package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class community_helper extends AppCompatActivity {
    ViewPager2 v1;
    ViewPager2 v2;
    community_helperfragment ch1;
    community_helperfragment2 ch2;
    TabLayout t1;
    TabLayout t2;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_helper);

        t1 = findViewById(R.id.tl1);
        t2 = findViewById(R.id.tl2);
        v1 = findViewById(R.id.vp1);
        v2 = findViewById(R.id.vp2);

        FragmentManager fm1 = getSupportFragmentManager();
        ch1 = new community_helperfragment(fm1,getLifecycle());
        v1.setAdapter(ch1);

        FragmentManager fm2 = getSupportFragmentManager();
        ch2 = new community_helperfragment2(fm2,getLifecycle());
        v2.setAdapter(ch2);

        t1.addTab(t1.newTab().setText("Doctor"));
        t1.addTab(t1.newTab().setText("Fire Fighter"));
        t1.addTab(t1.newTab().setText("Pilot"));

        t2.addTab(t2.newTab().setText("Police"));
        t2.addTab(t2.newTab().setText("Scientist"));
        t2.addTab(t2.newTab().setText("Teacher"));

        t1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                v1.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        v1.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                t1.selectTab(t1.getTabAt(position));
            }
        });

        t2.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                v2.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}
            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });

        v2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                t2.selectTab(t2.getTabAt(position));
            }
        });
    }

    public void playAudioCommunityHelper(View view)
    {

        int id=view.getId();
        if(id== R.id.doctor)
        {
            mp = MediaPlayer.create(this, R.raw.aa_doctor);
            mp.start();
        }
        else if(id== R.id.fire_fighter)
        {
            mp = MediaPlayer.create(this, R.raw.bb_fire_fighter);
            mp.start();
        }
        else if(id== R.id.teacher)
        {
            mp = MediaPlayer.create(this, R.raw.ff_teacher);
            mp.start();
        }
        else if(id== R.id.pilot)
        {
            mp = MediaPlayer.create(this, R.raw.cc_pilot);
            mp.start();
        }
        else if(id== R.id.scientist)
        {
            mp = MediaPlayer.create(this, R.raw.ee_scientist);
            mp.start();
        }
        else if(id== R.id.police)
        {
            mp = MediaPlayer.create(this, R.raw.dd_police_officer);
            mp.start();
        }
    }

    public void community_to_home(View view)
    {
        Intent i = new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }
    public void community_to_english(View view)
    {
        Intent i = new Intent(getApplicationContext(),English.class);
        startActivity(i);
    }
}