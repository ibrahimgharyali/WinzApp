package com.firsteconomy.winzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Vendor_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_2);
    }
}
