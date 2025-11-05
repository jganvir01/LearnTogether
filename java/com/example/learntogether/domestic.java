package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class domestic extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 pager1;
    ViewPager2 pager2;
domesticFragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domestic);

        pager1=findViewById(R.id.vp1);
        pager2=findViewById(R.id.vp2);
        FragmentManager fm=getSupportFragmentManager();
        adapter=new domesticFragmentAdapter(fm,getLifecycle()) ;
        pager1.setAdapter(adapter);
        pager2.setAdapter(adapter);

        tabLayout = (TabLayout)findViewById(R.id.tb);
        tabLayout.addTab(tabLayout.newTab().setText("Dog"));
        tabLayout.addTab(tabLayout.newTab().setText("Cat"));
        tabLayout.addTab(tabLayout.newTab().setText("Cow"));
        tabLayout.addTab(tabLayout.newTab().setText("Rabbit"));
        tabLayout.addTab(tabLayout.newTab().setText("Camel"));
        tabLayout.addTab(tabLayout.newTab().setText("Horse"));
        tabLayout.addTab(tabLayout.newTab().setText("Donkey"));
        tabLayout.addTab(tabLayout.newTab().setText("Goat"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

    }

    public void evs(View view) {
        Intent i=new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }

    public void animals(View view) {
        Intent i=new Intent(getApplicationContext(),Animals.class);
        startActivity(i);
    }
}