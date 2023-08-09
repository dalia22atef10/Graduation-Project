package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerfecVid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfec_vid);
        Button buttonvf=findViewById(R.id.buttonv1);
        buttonvf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentv1 = new Intent(PerfecVid.this, Perfectionism_first_vid.class);
                startActivity(intentv1);
            }
        });
        Button buttonvs=findViewById(R.id.buttonv2);
        buttonvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentv2 = new Intent(PerfecVid.this, Perfectionism_second_vid.class);
                startActivity(intentv2);
            }
        });
        Button buttonvt=findViewById(R.id.buttonv3);
        buttonvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentv3 = new Intent(PerfecVid.this, Perfection_thrd_vid.class);
                startActivity(intentv3);
            }
        });
        Button buttonvfo=findViewById(R.id.buttonv4);
        buttonvfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentv4 = new Intent(PerfecVid.this, Perfection_fourth_vid.class);
                startActivity(intentv4);
            }
        });
    }
}