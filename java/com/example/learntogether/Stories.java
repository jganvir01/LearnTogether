package com.example.learntogether;

//import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class Stories extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<youTubeVideos> youtubeVideos = new Vector<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
       // setTitle("Stories");
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" + ".youtube.com/embed/uwzViw-T0-A\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/bw_5JfrQ-aE\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/RP2gIgRL6Yw\" frameborder=\"0\" allowfullscreen></iframe>") );

        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/ugZGG5QsVQY\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);

    }
}