package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Social_anixiety_list_articles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_anixiety_list_articles);

        Button button5 = findViewById(R.id.socialA1);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Social_anixiety_list_articles.this , Article1_social_anixiety.class);
                startActivity(intent);
            }
        });
        Button button6 = findViewById(R.id.socialA2);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Social_anixiety_list_articles.this , Article2_social_anixiety.class);
                startActivity(intent);
            }
        });
        Button button7 = findViewById(R.id.socialA3);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Social_anixiety_list_articles.this , Article3_social_anixiety.class);
                startActivity(intent);
            }
        });
        Button button8 = findViewById(R.id.socialA4);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Social_anixiety_list_articles.this , Article4_social_anixiety.class);
                startActivity(intent);

            }
        });
    }
}