package com.app.music.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Recents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recents);
        Toolbar toolbar = findViewById(R.id.activity_recents_toolbar);
        setSupportActionBar(toolbar);
    }
}
