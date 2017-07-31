package com.perqin.playground.nullcontext;

import android.util.Log;

/**
 * Author: Perqin
 * Date  : 2017/7/31
 */

public class Presenter {
    private static final String TAG = "Presenter";

    public Presenter(View view) {
        Log.d(TAG, "Presenter: Context = " + view.context());
    }
}
