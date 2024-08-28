package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTitleMcqueen = findViewById(R.id.txtTitleMcqueen);
        txtTitleMcqueen.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        txtTitleMcqueen.getPaint().setShadowLayer(3, 3, 5, Color.BLACK);
    }
}