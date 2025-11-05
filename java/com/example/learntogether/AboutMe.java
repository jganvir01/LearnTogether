package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);


    }
    public void evs(View view) {
        Intent i = new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }



    public void myfamily(View view) {
        Intent i=new Intent(getApplicationContext(),Family.class);
        startActivity(i);
    }

    public void body(View view) {
        Intent i=new Intent(getApplicationContext(),Body.class);
        startActivity(i);
    }

    public void home(View view) {
        Intent i=new Intent(getApplicationContext(),Home.class);
        startActivity(i);
    }
}