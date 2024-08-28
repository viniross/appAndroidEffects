package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTitleMcqueen, txtCarros;

        txtTitleMcqueen = findViewById(R.id.txtTitleMcqueen);
        txtTitleMcqueen.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        txtTitleMcqueen.getPaint().setShadowLayer(3, 3, 5, Color.BLACK);

        txtCarros = findViewById(R.id.txtCarros);

        txtCarros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator rotate = ObjectAnimator.ofFloat(txtCarros, "rotation", 0, 360f);
                rotate.setDuration(1000);
                rotate.start();
            }
        });


    }
}