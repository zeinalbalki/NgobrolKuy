package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button keProfile;
    private TextView lupaPassword;
    private TextView menuRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        keProfile = findViewById(R.id.login);
        keProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(LoginActivity.this, ProfilePicActivity.class);
                startActivity(pindah);
            }
        });
        lupaPassword = findViewById(R.id.lupaPassword);
        lupaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah2 = new Intent(LoginActivity.this, LupaPassword.class);
                startActivity(pindah2);
            }
        });

        menuRegister = findViewById(R.id.belumPunyaAkun);
        menuRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah3 = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(pindah3);
            }
        });
    }
}