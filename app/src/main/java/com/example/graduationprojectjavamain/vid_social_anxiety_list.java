package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vid_social_anxiety_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid_social_anxiety_list);
        Button button = findViewById(R.id.socialV1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vid_social_anxiety_list.this , Vid1_social_anxiety.class);
                startActivity(intent);
            }
        });
        Button button1 = findViewById(R.id.socialV2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vid_social_anxiety_list.this , Vid2_anxiety_social.class);
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.socialV3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vid_social_anxiety_list.this , Vid3_social_anixiety.class);
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.socialV4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vid_social_anxiety_list.this ,Vid4_social_anxiety.class);
                startActivity(intent);
            }
        });


    }
}