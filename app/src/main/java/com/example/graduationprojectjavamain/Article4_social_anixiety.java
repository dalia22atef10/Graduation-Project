package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Article4_social_anixiety extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article4_social_anixiety);
        PDFView pdfView = findViewById(R.id.pdf4);
        pdfView.fromAsset("4.pdf").load();
    }
}