package com.xtc.lottietest;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class UseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use);
        getSupportActionBar().hide();

        ImageView imageView = new ImageView(this);
        Drawable drawable = new RotateDrawable();

        //imageView.setImageDrawable();

    }
}
