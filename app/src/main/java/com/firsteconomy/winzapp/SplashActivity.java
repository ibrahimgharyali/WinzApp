package com.firsteconomy.winzapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openActivity(SplashActivity.this, FirstActivity.class);
                finish();
            }
        }, getWaitTime());
    }
    public static void openActivity(@NonNull Activity activity, Class clazz) {

        Intent m = new Intent(activity, clazz);
        if (clazz == FirstActivity.class)
            m.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(m);
//        activity.finish();

    }

    private int getWaitTime() {
        return 1500;
    }

}
