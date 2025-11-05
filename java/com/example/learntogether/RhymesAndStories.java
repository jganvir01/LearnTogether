package com.example.learntogether;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RhymesAndStories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs);
    }

    public void rhy(View view) {
        Button pray = (Button) findViewById(R.id.button);
        pray.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Rhymes.class);
            startActivity(intent);
        });
    }

    public void sto(View view)
    {
        Button pray = (Button) findViewById(R.id.button2);
        pray.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Stories.class);
            startActivity(intent);
        });
    }
    public void rs_to_home(View view)
    {
        Intent intent=new Intent(getApplicationContext(),page2.class);
        startActivity(intent);
    }
}