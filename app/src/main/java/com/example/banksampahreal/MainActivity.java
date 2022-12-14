package com.example.banksampahreal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.signup);
        textView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Sign up berhasil", Toast.LENGTH_SHORT).show();
            }
        }));

        loginButton=(Button) findViewById(R.id.login);
        loginButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();
            }
        }));
    }
}