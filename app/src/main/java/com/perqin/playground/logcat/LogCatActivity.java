package com.perqin.playground.logcat;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.perqin.playground.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogCatActivity extends AppCompatActivity {
    private static final String TAG = "LogCatActivity";

    private TextInputEditText mCommandEditText;
    private TextView mLogTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_cat);

        mCommandEditText = (TextInputEditText) findViewById(R.id.editText_command);
        mLogTextView = (TextView) findViewById(R.id.textView_log);
        findViewById(R.id.button_execute).setOnClickListener(v -> {
            Log.d(TAG, "onCreate: Test debug log");
            try {
                Process process = Runtime.getRuntime().exec(mCommandEditText.getText().toString());
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append('\n');
                }
                mLogTextView.setText(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
