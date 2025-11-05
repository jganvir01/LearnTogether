package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EVS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evs);
    }

    public void Summer(View view) {
        Intent i = new Intent(getApplicationContext(),Summer.class);
        startActivity(i);
    }

    public void shapes(View view) {
        Intent i = new Intent(getApplicationContext(),Shapes.class);
        startActivity(i);
    }


    public void Aboutme(View view) {
        Intent i = new Intent(getApplicationContext(),AboutMe.class);
        startActivity(i);
    }

    public void fruitsnVeg(View view) {
        Intent i = new Intent(getApplicationContext(),FruitsandVeg.class);
        startActivity(i);
    }
    public void evs_home(View view) {
        Intent i = new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }
}