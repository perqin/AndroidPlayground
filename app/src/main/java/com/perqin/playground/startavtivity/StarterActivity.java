package com.perqin.playground.startavtivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.perqin.playground.R;

public class StarterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);
        findViewById(R.id.button_start).setOnClickListener(v ->
                startActivity(new Intent(this, StartedActivity.class))
        );
    }
}
