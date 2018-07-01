package com.technopark.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ((Button) findViewById(R.id.artists_button_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Albums.this, Artists.class);
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.now_playing_button_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Albums.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
