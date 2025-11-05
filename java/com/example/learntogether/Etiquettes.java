package com.example.learntogether;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Etiquettes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etiquettes);
    }
    public void etiquttes_home(View view)
    {
        Intent i=new Intent(getApplicationContext(),page2.class);
        startActivity(i);
    }
    public void prayer(View view) {
        Button pray = (Button) findViewById(R.id.prayer);
        pray.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Prayer.class);
                startActivity(intent);
            }
        });
    }
    public void Habits(View view)
    {
        Button habbits = (Button) findViewById(R.id.habitsbtn);
        habbits.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),GoodHabits.class);
                startActivity(intent);
            }
        });
    }
    public void manners(View view) {
        Button manners = (Button) findViewById(R.id.mannersbtn);
        manners.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),GoodManners.class);
                startActivity(intent);

            }
        });
    }
}