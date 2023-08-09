package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Article1_social_anixiety extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article1_social_anixiety);
        PDFView pdfView = findViewById(R.id.pdf1);
        pdfView.fromAsset("1.pdf").load();
    }
}