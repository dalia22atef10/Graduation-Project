package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Perfection_thrd_vid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfection_thrd_vid);

        VideoView videoview3 = findViewById(R.id.v3);
        String videopath3 = "android.resource://" + getPackageName() + "/" + R.raw.dangerofperfectionism;
        Uri uri1 = Uri.parse(videopath3);
        videoview3.setVideoURI(uri1);

        MediaController mediaController3 = new MediaController(this);
        videoview3.setMediaController(mediaController3);
        mediaController3.setAnchorView(videoview3);
    }
}