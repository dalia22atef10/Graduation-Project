package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Perfection_fourth_vid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfection_fourth_vid);
        VideoView videoview4 = findViewById(R.id.v4);
        String videopath4 = "android.resource://" + getPackageName() + "/" + R.raw.lastvideo;
        Uri uri1 = Uri.parse(videopath4);
        videoview4.setVideoURI(uri1);

        MediaController mediaController4 = new MediaController(this);
        videoview4.setMediaController(mediaController4);
        mediaController4.setAnchorView(videoview4);
    }
}