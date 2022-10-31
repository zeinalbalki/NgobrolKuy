package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LupaPassword extends AppCompatActivity {
    private TextView submitLupaPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        submitLupaPassword = findViewById(R.id.submitLupaPassword);
        submitLupaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(LupaPassword.this, LupaPasswordResult.class);
                startActivity(pindah);
            }
        });
    }
}