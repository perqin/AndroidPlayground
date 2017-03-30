package com.perqin.playground.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.perqin.playground.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
