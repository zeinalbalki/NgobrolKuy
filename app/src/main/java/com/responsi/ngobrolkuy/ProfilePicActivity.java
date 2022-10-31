package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfilePicActivity extends AppCompatActivity {
    private TextView lewati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);

        lewati = findViewById(R.id.lewati);
        lewati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ProfilePicActivity.this, HomeChat.class);
                startActivity(pindah);
            }
        });
    }
}