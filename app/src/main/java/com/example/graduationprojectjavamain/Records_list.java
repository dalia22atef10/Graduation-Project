package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Records_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records_list);
        Button buttonm1=findViewById(R.id.r1);
        buttonm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm1=new Intent(Records_list.this,FirstRecord.class);
                startActivity(intentm1);
            }
        });

        Button buttonm2=findViewById(R.id.r2);
        buttonm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm2=new Intent(Records_list.this,SecondRecord.class);
                startActivity(intentm2);
            }
        });

        Button buttonm3=findViewById(R.id.r3);
        buttonm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm3=new Intent(Records_list.this,ThirdRecord.class);
                startActivity(intentm3);
            }
        });

        Button buttonm4=findViewById(R.id.r4);
        buttonm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm4=new Intent(Records_list.this,FourthRecord.class);
                startActivity(intentm4);
            }
        });

        Button buttonm5=findViewById(R.id.r5);
        buttonm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm5=new Intent(Records_list.this,FifthRecord.class);
                startActivity(intentm5);
            }
        });

        Button buttonm6=findViewById(R.id.r6);
        buttonm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm6=new Intent(Records_list.this,SixthRecord.class);
                startActivity(intentm6);
            }
        });
    }
}
