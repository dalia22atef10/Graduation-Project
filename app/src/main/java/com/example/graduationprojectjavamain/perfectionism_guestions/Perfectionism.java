package com.example.graduationprojectjavamain.perfectionism_guestions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.graduationprojectjavamain.Article_list_perfec;
import com.example.graduationprojectjavamain.PerfecVid;
import com.example.graduationprojectjavamain.R;

public class Perfectionism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfectionism);

        Button buttonv=findViewById(R.id.buttonvideo);
        buttonv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentv=new Intent(Perfectionism.this, PerfecVid.class);
                startActivity(intentv);
            }
        });
        Button buttona=findViewById(R.id.buttonarticle);
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenta=new Intent(Perfectionism.this, Article_list_perfec.class);
                startActivity(intenta);
            }
        });
    }
}