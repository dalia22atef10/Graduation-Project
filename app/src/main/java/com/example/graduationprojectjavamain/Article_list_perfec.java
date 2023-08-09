package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Article_list_perfec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_list_perfec);
        Button buttonaf=findViewById(R.id.buttona1);
        buttonaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenta1 = new Intent(Article_list_perfec.this, Article1_perfec.class);
                startActivity(intenta1);
            }
        });
        Button buttonas=findViewById(R.id.buttona2);
        buttonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenta2 = new Intent(Article_list_perfec.this, Article2_perfec.class);
                startActivity(intenta2);
            }
        });
        Button buttonat=findViewById(R.id.buttona3);
        buttonat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenta3 = new Intent(Article_list_perfec.this, Article3Perfec.class);
                startActivity(intenta3);
            }
        });
        Button buttonafourth=findViewById(R.id.buttona4);
        buttonafourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenta4 = new Intent(Article_list_perfec.this, Article4_perfectionism.class);
                startActivity(intenta4);
            }
        });
    }
}