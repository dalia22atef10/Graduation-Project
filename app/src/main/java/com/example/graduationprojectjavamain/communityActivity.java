package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class communityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);




        EditText postInput = findViewById(R.id.post);
        postInput .setTextColor(getResources().getColor(R.color.black));

        Button saveBtn = findViewById(R.id.save_post);


        Realm.init(getApplicationContext());
        Realm realm = Realm.getDefaultInstance();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String postt= postInput.getText().toString();
                //  long createdTime = System.currentTimeMillis();

                realm.beginTransaction();
                Post post = realm.createObject(Post.class);
                post.setTitle(postt);


                realm.commitTransaction();
                Toast.makeText(getApplicationContext(),"post saved",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(communityActivity.this,postsActivity.class));

                finish();


            }
        });


    }
    }
