package com.technopark.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent);

        ((Button) findViewById(R.id.artists_button_3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Recent.this, Artists.class);
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.now_playing_button_4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Recent.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
