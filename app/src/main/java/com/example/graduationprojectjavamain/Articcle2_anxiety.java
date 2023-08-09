package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Articcle2_anxiety extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articcle2_anxiety);
        PDFView pdfView1 = findViewById(R.id.pdf);
        pdfView1.fromAsset("howanx.pdf").load();
    }
}