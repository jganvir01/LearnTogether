package com.example.learntogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Shapes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        VideoView vv=findViewById(R.id.videoView);
        String videoPath ="android.resource://"+getPackageName()+"/"+R.raw.shapes;
        Uri uri =Uri.parse(videoPath);
        vv.setVideoURI(uri);
        MediaController mediacontroller =new MediaController(this);
        vv.setMediaController(mediacontroller);
        mediacontroller.setAnchorView(vv);
    }

    public void evs(View view) { Intent i = new Intent(getApplicationContext(),EVS.class);
        startActivity(i);
    }
}