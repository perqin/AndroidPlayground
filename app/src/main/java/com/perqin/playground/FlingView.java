package com.perqin.playground;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;

/**
 * Author   : perqin
 * Date     : 17-3-17
 */

public class FlingView extends View implements GestureDetector.OnGestureListener {
    private static final String TAG = "FlingView";

    private GestureDetector detector;
    private Scroller scroller;
    private OnFlingListener onFlingListener;

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
        scroller = new Scroller(context);
    }

    public void setOnFlingListener(OnFlingListener listener) {
        onFlingListener = listener;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
//        return detector.onTouchEvent(event);
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
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
    }

    @Override
    public void computeScroll() {
        if (scroller.computeScrollOffset()) {

        }
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if (onFlingListener != null) onFlingListener.onFling(e1, e2, velocityX, velocityY);
        return true;
    }

    public void smoothlyScrollDown() {
        scroller.startScroll(0, 0, 0, 300, 1000);
        invalidate();
    }

    public interface OnFlingListener {
        void onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY);
    }
}
