package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtMate = findViewById(R.id.txtMate);
        Button btnTransp = findViewById(R.id.btnTransp);
        ImageView imgMcqueen = findViewById(R.id.imgMcqueen);

        txtMate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMate.animate().translationX(200f).setDuration(500).start();
            }
        });

        btnTransp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgMcqueen.setAlpha(0.5f);
            }
        });

        imgMcqueen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMcqueen = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(telaMcqueen);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}