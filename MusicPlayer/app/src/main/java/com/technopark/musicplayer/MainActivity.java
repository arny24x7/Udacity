package com.technopark.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mPlayButton;
    boolean isPlay = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayButton = (Button) findViewById(R.id.play_button);
        mPlayButton.setBackgroundResource(R.drawable.ic_play_circle_filled_black_48dp);
        mPlayButton.setOnClickListener(mTogglePlayButton);

        ((Button) findViewById(R.id.songs_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Songs.class);
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.recent_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Recent.class);
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.albums_button_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Albums.class);
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.artists_button_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Artists.class);
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.playlist_button_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Playlist.class);
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.store_button_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Store.class);
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.ff_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Forward", Toast.LENGTH_SHORT).show();
            }
        });

        ((Button) findViewById(R.id.fr_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Rewind", Toast.LENGTH_SHORT).show();
            }
        });

        ((Button) findViewById(R.id.sn_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Next", Toast.LENGTH_SHORT).show();
            }
        });

        ((Button) findViewById(R.id.sp_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Previous", Toast.LENGTH_SHORT).show();
            }
        });
    }

    View.OnClickListener mTogglePlayButton = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // change your button background

            if (isPlay) {
                v.setBackgroundResource(R.drawable.ic_play_circle_filled_black_48dp);
                Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
            } else {
                v.setBackgroundResource(R.drawable.ic_pause_circle_filled_black_48dp);
                Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
            }

            isPlay = !isPlay; // reverse
        }
    };
}
