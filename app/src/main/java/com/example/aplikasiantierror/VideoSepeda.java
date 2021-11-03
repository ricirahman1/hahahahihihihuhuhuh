package com.example.aplikasiantierror;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoSepeda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_sepeda);
        VideoView video = (VideoView) findViewById(R.id.video_sepeda);
        MediaController media = new MediaController(this);
        Uri lokasivideo = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sepeda);
        video.setVideoURI(lokasivideo);
        video.setMediaController(media);
        video.start();
        video.requestFocus();
    }
}