package com.app.music.musicapp;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.view_all)
    ConstraintLayout activity_all;
    @BindView(R.id.view_store)
    LinearLayout activity_store;
    @BindView(R.id.view_playlist)
    LinearLayout activity_playlist;
    @BindView(R.id.view_recents)
    LinearLayout activity_recents;
    @BindView(R.id.view_now_playing)
    ConstraintLayout activity_now_playing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        activity_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendIntent(AllSongs.class);
            }
        });

        activity_store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendIntent(Store.class);
            }
        });

        activity_playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendIntent(Playlist.class);
            }
        });

        activity_recents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendIntent(Recents.class);
            }
        });

        activity_now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendIntent(NowPlaying.class);
            }
        });
    }

    public void sendIntent(Class className) {
        Intent i = new Intent(MainActivity.this, className);
        startActivity(i);
    }
}
