package com.app.music.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NowPlaying extends AppCompatActivity {

    boolean isPlaying;
    @BindView(R.id.loop)
    ImageView Loop;
    @BindView(R.id.previous)
    ImageView Previous;
    @BindView(R.id.play)
    ImageView Play;
    @BindView(R.id.next)
    ImageView Next;
    @BindView(R.id.shuffle)
    ImageView Shuffle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        Toolbar toolbar = findViewById(R.id.activity_now_playing_toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
        isPlaying = false;

        Loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast("Loop");
            }
        });

        Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast("Previous");
            }
        });

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    Play.setImageResource(R.drawable.play);
                    displayToast("pause");
                    isPlaying = false;
                } else if (!isPlaying) {
                    Play.setImageResource(R.drawable.pause);
                    displayToast("play");
                    isPlaying = true;
                }
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast("Next");
            }
        });

        Shuffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast("Shuffle");
            }
        });
    }

    public void displayToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
