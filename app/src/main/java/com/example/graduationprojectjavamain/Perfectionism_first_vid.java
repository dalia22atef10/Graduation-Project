package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Perfectionism_first_vid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfectionism_first_vid);

        VideoView videoview1 = findViewById(R.id.v1);
        String videopath1 = "android.resource://" + getPackageName() + "/" + R.raw.perfectandreal;
        Uri uri1 = Uri.parse(videopath1);
        videoview1.setVideoURI(uri1);

        MediaController mediaController1 = new MediaController(this);
        videoview1.setMediaController(mediaController1);
        mediaController1.setAnchorView(videoview1);
    }
}