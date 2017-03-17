package com.perqin.playground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity /*implements GestureDetector.OnGestureListener*/ {
    private static final String TAG = "MainActivity";
    private View mBox;
//    private GestureDetector detector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBox = findViewById(R.id.box);
//        detector = new GestureDetector(this, this);
    }

    public void mainClick(View view) {
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) mBox.getLayoutParams();
        params.topMargin += 150;
        params.height += 150;
        mBox.setLayoutParams(params);
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        Log.i(TAG, "onTouchEvent");
//        return detector.onTouchEvent(event);
//    }
//
//    @Override
//    public boolean onDown(MotionEvent e) {
//        return false;
//    }
//
//    @Override
//    public void onShowPress(MotionEvent e) {
//    }
//
//    @Override
//    public boolean onSingleTapUp(MotionEvent e) {
//        return false;
//    }
//
//    @Override
//    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
//        Log.i(TAG, "onScroll");
//        return false;
//    }
//
//    @Override
//    public void onLongPress(MotionEvent e) {
//    }
//
//    @Override
//    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
//        Log.i(TAG, "onFling");
//        return false;
//    }
}
