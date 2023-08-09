package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArticlesList extends AppCompatActivity {

    private Button article1;
    private Button article2;
    private Button article3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles_list);


        article1=findViewById(R.id.article1);
        article2=findViewById(R.id.article2);
        article3=findViewById(R.id.article3);


        article1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticlesList.this, Article1_anxiety.class));

            }
        });

        article2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticlesList.this, Articcle2_anxiety.class));

            }
        });

        article3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticlesList.this, Article3_Anxiety.class));

            }
        });
    }
}