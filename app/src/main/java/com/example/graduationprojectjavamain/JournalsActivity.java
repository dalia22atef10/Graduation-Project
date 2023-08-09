package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;


public class JournalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journals);

        EditText titleInput = findViewById(R.id.title);
        EditText descriptionInput = findViewById(R.id.description);
        Button saveBtn = findViewById(R.id.save_button);
        titleInput .setTextColor(getResources().getColor(R.color.black));
        descriptionInput .setTextColor(getResources().getColor(R.color.black));


        Realm.init(getApplicationContext());
        Realm realm = Realm.getDefaultInstance();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titleInput.getText().toString();
                String description = descriptionInput.getText().toString();
              //  long createdTime = System.currentTimeMillis();

                realm.beginTransaction();
                Note note = realm.createObject(Note.class);
                note.setTitle(title);
                note.setDescription(description);

                realm.commitTransaction();
                Toast.makeText(getApplicationContext(),"Note saved",Toast.LENGTH_SHORT).show();

                finish();


            }
        });


    }
}