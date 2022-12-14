package com.example.banksampahreal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    View buttonShowMaps;
    View buttonPickup;
    View buttonDaftarSampah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        buttonShowMaps=(View) findViewById(R.id.showmap);
        buttonShowMaps.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,MapsActivity.class);
                startActivity(intent);
                Toast.makeText(MenuActivity.this, "Show Maps Berhasil", Toast.LENGTH_SHORT).show();
            }
        }));


        buttonPickup=(View) findViewById(R.id.pickup);
        buttonPickup.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://api.whatsapp.com/send?phone=+6285861209132";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                Toast.makeText(MenuActivity.this, "Membuka WhatsApp", Toast.LENGTH_SHORT).show();
            }
        }));

        buttonDaftarSampah=(View) findViewById(R.id.btnHargaJenis);
        buttonDaftarSampah.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,AndroidListViewCursorAdaptorActivity.class);
                startActivity(intent);
                Toast.makeText(MenuActivity.this, "Show Maps Berhasil", Toast.LENGTH_SHORT).show();
            }
        }));




    }
}