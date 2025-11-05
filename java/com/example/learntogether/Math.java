package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Math extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }
    public void numbers( View view){
        Intent i = new Intent(getApplicationContext(),numbers.class);
        startActivity(i);
    }
    public void add(View view){
        Intent i= new Intent(getApplicationContext(),Additionn.class);
        startActivity(i);
    }
    public void sub(View view){
        Intent i= new Intent(getApplicationContext(),Subtraction.class);
        startActivity(i);
    }
    public void math_home(View view)
    {
        Intent i= new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }
}