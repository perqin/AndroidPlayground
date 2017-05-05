package com.perqin.playground.activities;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.perqin.playground.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeNewThread();
            }
        });
    }

    private void makeNewThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i(TAG, "run: This is a new thread: " + Thread.currentThread().getId());
                Looper.prepare();
                Handler handler = new Handler(new Handler.Callback() {
                    @Override
                    public boolean handleMessage(Message msg) {
                        Log.i(TAG, "handleMessage: Handle message received by thread " + Thread.currentThread().getId());
                        button.setText("MESSAGE HANDLED");
                        return true;
                    }
                });
                handler.sendMessageDelayed(Message.obtain(), 3000);
                Looper.loop();
            }
        }).start();
    }
}
