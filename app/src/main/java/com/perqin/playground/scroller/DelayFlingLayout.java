package com.perqin.playground.scroller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.Scroller;

/**
 * Author   : perqin
 * Date     : 17-3-18
 */

public class DelayFlingLayout extends FrameLayout implements GestureDetector.OnGestureListener {
    private static final String TAG = "DelayFlingLayout";
    private Scroller mScroller;
    private GestureDetector mDetector;

    public DelayFlingLayout(@NonNull Context context) {
        super(context);
        initView(context);
    }

    public DelayFlingLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    private void initView(Context context) {
        mScroller = new Scroller(context);
        mDetector = new GestureDetector(context, this);
        mDetector.setIsLongpressEnabled(false);
    }

    private void flingUp() {
        mScroller.startScroll(getScrollX(), getScrollY(), 0, 300, 1000);
        invalidate();
    }

    private void flingDown() {
        mScroller.startScroll(getScrollX(), getScrollY(), 0, -300, 1000);
        invalidate();
    }

    private void flingLeft() {
        mScroller.startScroll(getScrollX(), getScrollY(), 300, 0, 1000);
        invalidate();
    }

    private void flingRight() {
        mScroller.startScroll(getScrollX(), getScrollY(), -300, 0, 1000);
        invalidate();
    }

    @Override
    public void computeScroll() {
        if (mScroller.computeScrollOffset()) {
            scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
            invalidate();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mDetector.onTouchEvent(event);
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
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.i(TAG, "onFling: velocityX = " + velocityX + ", velocityY = " + velocityY);
        if (velocityX > 1200) {
            flingRight();
            return true;
        } else if (velocityX < -1200) {
            flingLeft();
            return true;
        } else if (velocityY > 1200) {
            flingDown();
            return true;
        } else if (velocityY < -1200) {
            flingUp();
            return true;
        }
        return false;
    }
}
