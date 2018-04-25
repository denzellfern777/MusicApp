package com.app.music.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SongDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);
        Toolbar toolbar = findViewById(R.id.activity_song_details_toolbar);
        setSupportActionBar(toolbar);
    }
}
