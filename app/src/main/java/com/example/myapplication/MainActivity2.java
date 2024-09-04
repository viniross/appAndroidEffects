package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtMate = findViewById(R.id.txtMate);
        ImageView imgMcqueen = findViewById(R.id.imgMcqueen);

        txtMate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMate.animate().translationX(200f).setDuration(500).start();
            }
        });
    }
}