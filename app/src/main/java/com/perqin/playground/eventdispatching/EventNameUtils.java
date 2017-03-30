package com.perqin.playground.eventdispatching;

import android.view.MotionEvent;

/**
 * Author   : perqin
 * Date     : 17-3-22
 */

public class EventNameUtils {
    public static String eventNameOf(int action) {
        switch (action) {
            case MotionEvent.ACTION_DOWN: return "ACTION_DOWN";
            case MotionEvent.ACTION_MOVE: return "ACTION_MOVE";
            case MotionEvent.ACTION_UP: return "ACTION_UP";
            case MotionEvent.ACTION_CANCEL: return "ACTION_CANCEL";
            default: return "UNKNOWN ACTION";
        }
    }
}
