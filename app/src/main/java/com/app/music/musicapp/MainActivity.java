package com.app.music.musicapp;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.view_all) ConstraintLayout activity_all;
    @BindView(R.id.view_store) ConstraintLayout activity_store;
    @BindView(R.id.view_playlist) ConstraintLayout activity_playlist;
    @BindView(R.id.view_recents) ConstraintLayout activity_recents;


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
                Intent i = new Intent(MainActivity.this,AllSongs.class);
                startActivity(i);
            }
        });
    }
}
