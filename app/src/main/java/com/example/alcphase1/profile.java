package com.example.alcphase1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import java.lang.reflect.Field;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        getSupportActionBar().setTitle(null);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("My profile");



    }
}
