package com.example.graduationprojectjavamain;

import io.realm.RealmObject;

public class Comments extends RealmObject {
    String comment;


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}