package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Article1_perfec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article1_perfec);
        PDFView p1 = findViewById(R.id.art1);
        p1.fromAsset("articleone.pdf").load();
    }
}