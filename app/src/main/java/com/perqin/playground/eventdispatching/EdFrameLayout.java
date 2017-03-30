package com.perqin.playground.eventdispatching;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Author   : perqin
 * Date     : 17-3-18
 */

public class EdFrameLayout extends FrameLayout {
    private static final String TAG = "EdFrameLayout";

    public EdFrameLayout(Context context) {
        super(context);
    }

    public EdFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(TAG, "dispatchTouchEvent: " + EventNameUtils.eventNameOf(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i(TAG, "onInterceptTouchEvent");
        // Intercept it if the gesture is already started
        return ev.getAction() == MotionEvent.ACTION_MOVE;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "onTouchEvent");
        return super.onTouchEvent(event);
    }
}
