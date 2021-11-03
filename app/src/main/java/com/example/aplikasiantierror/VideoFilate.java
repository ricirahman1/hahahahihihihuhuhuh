package com.example.aplikasiantierror;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoFilate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_filate);
        setContentView(R.layout.activity_video_filate);
        VideoView video = (VideoView) findViewById(R.id.video_pilates);
        MediaController media = new MediaController(this);
        Uri lokasivideo = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pilates);
        video.setVideoURI(lokasivideo);
        video.setMediaController(media);
        video.start();
        video.requestFocus();
    }
}