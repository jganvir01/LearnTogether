package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FruitsandVeg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitsand_veg);
    }

    public void evs(View view) {
        Intent i = new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }


    public void vegetables(View view) {
        Intent i=new Intent(getApplicationContext(),Vegetables.class);
        startActivity(i);
    }

    public void fru(View view) {
        Intent i = new Intent(getApplicationContext(), Fruit.class);
        startActivity(i);
    }
}