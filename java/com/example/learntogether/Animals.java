package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Animals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
    }

    public void evs(View view) { Intent i=new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }




    public void domes(View view) {
        Intent i =new Intent(getApplicationContext(),domestic.class);
        startActivity(i);
    }
}