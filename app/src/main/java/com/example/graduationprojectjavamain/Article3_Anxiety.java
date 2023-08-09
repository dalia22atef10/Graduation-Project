package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Article3_Anxiety extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article3_anxiety);
        PDFView pdfView2 = findViewById(R.id.pdfv);
        pdfView2.fromAsset("anxietydisorder.pdf").load();
    }
}