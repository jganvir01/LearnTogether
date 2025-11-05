package com.example.learntogether;

//import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class Prayer extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<youTubeVideos> youtubeVideos = new Vector<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer);
        setTitle("Prayer");
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" + ".youtube.com/embed/u0mA9SGZVjs\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/SrBowY8QPhc\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/vr7R3RBSRW0\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/M1mVWZKFcUw\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/VqEbJBchHWQ\" frameborder=\"0\" allowfullscreen></iframe>") );
        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);

    }
}
