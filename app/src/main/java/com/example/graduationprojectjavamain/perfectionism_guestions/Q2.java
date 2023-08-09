package com.example.graduationprojectjavamain.perfectionism_guestions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.graduationprojectjavamain.R;

public class Q2 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        radioGroup = findViewById(R.id.radioGroup2);
        textView = findViewById(R.id.q2);
        Button buttonq = findViewById(R.id.n2);
        buttonq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioid = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioid);
                textView.setText("your answer" + radioButton.getText());
            }
        });
        Button button = findViewById(R.id.n2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Q2.this,Q3.class);
                startActivity(intent);
            }
        });

    }

    public void checkButton(View v){
        int radioid = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioid);
        Toast.makeText(this,"Your answer: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}