package com.technopark.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ((Button) findViewById(R.id.store_button_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Songs.this, Store.class);
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.now_playing_button_5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Songs.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
