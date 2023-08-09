package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;

public class CommentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        EditText commentInput = findViewById(R.id.comment);
        commentInput .setTextColor(getResources().getColor(R.color.black));

        Button saveBtn = findViewById(R.id.save_button);
       // Button addCommentBtn = findViewById(R.id.addNewComment_button);


        Realm.init(getApplicationContext());
        Realm realm = Realm.getDefaultInstance();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String comment = commentInput.getText().toString();
                //  long createdTime = System.currentTimeMillis();

                realm.beginTransaction();
                Comments comments = realm.createObject( Comments.class);
                comments.setComment(comment);

                realm.commitTransaction();
                Toast.makeText(getApplicationContext(),"Comment saved",Toast.LENGTH_SHORT).show();

             //   finish();


            }
        });

        Realm.init(getApplicationContext());
        Realm realm2 = Realm.getDefaultInstance();

        RealmResults<Comments> commentList = realm2.where(Comments.class).findAll();


        RecyclerView recyclerView = findViewById(R.id.recyclerviewComments);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter3 myAdapter3 = new MyAdapter3(getApplicationContext(),commentList);
        recyclerView.setAdapter(myAdapter3);

        commentList.addChangeListener(new RealmChangeListener<RealmResults<Comments>>() {
            @Override
            public void onChange(RealmResults<Comments> comments) {
                myAdapter3.notifyDataSetChanged();
            }
        });


    }
}