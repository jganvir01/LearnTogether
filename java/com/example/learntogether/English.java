package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class English extends AppCompatActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
    }
    public void home_back(View view)
    {
        i = new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }
    public void alphabets(View view)
    {
        i = new Intent(getApplicationContext(),alphabets.class);
        startActivity(i);
    }
    public void actionWords(View view)
    {
        i = new Intent(getApplicationContext(),action_words.class);
        startActivity(i);
    }
    public void opposite(View view)
    {
        i = new Intent(getApplicationContext(),opposites.class);
        startActivity(i);
    }
    public void communityHelper(View view)
    {
        i = new Intent(getApplicationContext(),community_helper.class);
        startActivity(i);
    }
}