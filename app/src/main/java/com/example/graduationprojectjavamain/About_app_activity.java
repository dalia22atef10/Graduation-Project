package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.graduationprojectjavamain.perfectionism_guestions.Q1;

public class About_app_activity extends AppCompatActivity {

    private ImageView plan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);


        plan=findViewById(R.id.imageView5);
        plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About_app_activity.this, Q1.class);
                startActivity(intent);
            }
        });
    }
}