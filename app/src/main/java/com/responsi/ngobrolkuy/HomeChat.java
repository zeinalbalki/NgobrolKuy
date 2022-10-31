package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import android.os.Bundle;

public class HomeChat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.kembali:
                Toast.makeText(getApplicationContext(),"Anda telah meng click Kembali", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(getApplicationContext(),"Anda telah meng click Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.signout:
                // finish(); digunakan untuk menutup halaman/aplkasi
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}