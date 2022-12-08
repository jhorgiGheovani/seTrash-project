package com.example.banksampahreal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    Button buttonShowMaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        buttonShowMaps=(Button) findViewById(R.id.showmap);
        buttonShowMaps.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,showMaps.class);
                startActivity(intent);
                Toast.makeText(MenuActivity.this, "Show Maps Berhasil", Toast.LENGTH_SHORT).show();
            }
        }));







    }
}