package com.perqin.playground;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Author   : perqin
 * Date     : 17-3-17
 */

public class FlingView extends View implements GestureDetector.OnGestureListener {
    private static final String TAG = "FlingView";

    private GestureDetector detector;

    public FlingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initDetector(context);
    }

    public FlingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initDetector(context);
    }

    private void initDetector(Context context) {
        detector = new GestureDetector(context, this);
        detector.setIsLongpressEnabled(false);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "onTouchEvent: action = " + event.getAction());
        boolean consumed = detector.onTouchEvent(event);
//        Log.i(TAG, "onTouchEvent: consumed: " + (consumed ? "true" : "false"));
        return consumed;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.i(TAG, "onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.i(TAG, "onFling");
        return true;
    }
}
