package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTitleMcqueen = findViewById(R.id.txtTitleMcqueen);
        TextView txtCarros = findViewById(R.id.txtCarros);
        Button btnTeste = findViewById(R.id.btnTeste);
        ImageView imgMate = findViewById(R.id.imgMate);

        txtTitleMcqueen.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        txtTitleMcqueen.getPaint().setShadowLayer(3, 3, 5, Color.BLACK);

        txtCarros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator rotate = ObjectAnimator.ofFloat(txtCarros, "rotation", 0, 360f);
                rotate.setDuration(1000);
                rotate.start();
            }
        });

        // Slide UP
        Animation animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgMate.startAnimation(animSlideUp);
            }
        });

    }
}