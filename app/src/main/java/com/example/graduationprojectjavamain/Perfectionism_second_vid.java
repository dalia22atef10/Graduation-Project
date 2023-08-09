package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Perfectionism_second_vid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfectionism_second_vid);
        VideoView videoview2 = findViewById(R.id.v2);
        String videopath2 = "android.resource://" + getPackageName() + "/" + R.raw.perfectionismmeaning;
        Uri uri2 = Uri.parse(videopath2);
        videoview2.setVideoURI(uri2);

        MediaController mediaController2 = new MediaController(this);
        videoview2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoview2);
    }
}