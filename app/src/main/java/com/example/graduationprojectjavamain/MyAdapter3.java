package com.example.graduationprojectjavamain;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import io.realm.Realm;
import io.realm.RealmResults;

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.MyViewHolder> {

    Context context;
    RealmResults<Comments> commentList;


    public MyAdapter3(Context context, RealmResults<Comments> commentList) {
        this.context = context;
        this.commentList = commentList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view_three,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        Comments comments = commentList.get(position);
        holder.commentContent.setText(comments.getComment());



        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                PopupMenu menu = new PopupMenu(context,v);
                menu.getMenu().add("DELETE");
                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getTitle().equals("DELETE")){
                            //delete the note
                            Realm realm = Realm.getDefaultInstance();
                            realm.beginTransaction();
                            comments.deleteFromRealm();
                            realm.commitTransaction();
                            Toast.makeText(context,"Comment deleted",Toast.LENGTH_SHORT).show();
                        }
                        return true;
                    }
                });
                menu.show();

                return true;
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the new activity
                Intent intent = new Intent(context, CommentsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // Add this line to include the flag

                context.startActivity(intent);
            }
        });

    }



    @Override
    public int getItemCount() {
        return commentList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{


        TextView commentContent;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            commentContent= itemView.findViewById(R.id.commentContent);
        }
    }




}