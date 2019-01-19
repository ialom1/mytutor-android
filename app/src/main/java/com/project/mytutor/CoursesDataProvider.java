package com.project.mytutor;

import android.content.Context;
import android.provider.Contacts;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by ac on 11/22/2017.
 */

public class CoursesDataProvider {

    private int val;
    private String subjectName;

    public CoursesDataProvider() {
    }

    public CoursesDataProvider(int val, String subjectName) {
        this.val = val;
        this.subjectName = subjectName;

    }

    public int getVal() {

        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
