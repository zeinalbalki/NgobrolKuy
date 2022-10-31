package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LupaPasswordResult extends AppCompatActivity {
    private TextView kembaliLupaPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password_result);

        kembaliLupaPassword = findViewById(R.id.kembaliLupaPassword);
        kembaliLupaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(LupaPasswordResult.this, LoginActivity.class);
                startActivity(pindah);
            }
        });
    }
}