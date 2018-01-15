package com.firsteconomy.winzapp;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    private View img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.right_to_left, R.anim.right_to_left);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        img = findViewById(R.id.img);

    }

    @Override
    protected void onResume() {
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        SplashActivity.openActivity(SecondActivity.this, VendorActivity.class);
                    }
                });
            }
        }, 1000);
    }
}
