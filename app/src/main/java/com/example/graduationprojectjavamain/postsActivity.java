package com.example.graduationprojectjavamain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;

public class postsActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);


        Button addNoteBtn = findViewById(R.id.addNewpost_button);

        addNoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(postsActivity.this,communityActivity.class));
            }
        });

        Realm.init(getApplicationContext());
        Realm realm = Realm.getDefaultInstance();

        RealmResults<Post> postList = realm.where(Post.class).findAll();


        RecyclerView recyclerView = findViewById(R.id.recyclerviewPosts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter2 myAdapter2 = new MyAdapter2(getApplicationContext(),postList);
        recyclerView.setAdapter(myAdapter2);

        postList.addChangeListener(new RealmChangeListener<RealmResults<Post>>() {
            @Override
            public void onChange(RealmResults<Post> posts) {
                myAdapter2.notifyDataSetChanged();
            }
        });
    }


}