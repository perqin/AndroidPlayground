package com.perqin.playground.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.perqin.playground.R;

public class MainActivity extends AppCompatActivity /*implements GestureDetector.OnGestureListener*/ {
    private static final String TAG = "MainActivity";
//    private FlingView mBox;
//    private ViewGroup mBoxParent;
//    private Scroller mScroller;
//    private GestureDetector detector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mBox = (FlingView) findViewById(R.id.box);
//        mBoxParent = (ViewGroup) mBox.getParent();
//        detector = new GestureDetector(this, this);
    }

//    public void mainClick(View view) {
//        mScroller.startScroll(0, 0, 300, 300, 1000);
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
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
//        scrollDown();
//        return true;
//    }
//
//    private void scrollDown() {
//        mScroller.startScroll(0, 0, 0, 300, 1000);
//        mBoxParent.invalidate();
//    }
}
