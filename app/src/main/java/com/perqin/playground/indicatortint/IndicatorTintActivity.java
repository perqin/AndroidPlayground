package com.perqin.playground.indicatortint;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;

import com.perqin.playground.R;

public class IndicatorTintActivity extends AppCompatActivity {
    private static final String TAG = "IndicatorTintActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_indicator_tint, menu);
        for (int i = 0; i < menu.size(); ++i) {
            MenuItem item = menu.getItem(i);
            DrawableCompat.setTint(item.getIcon(), getActionIconColor());
        }
        return true;
    }

    private @ColorInt int getActionIconColor() {
        Resources.Theme theme = getTheme();
        TypedValue tv = new TypedValue();
        theme.resolveAttribute(android.R.attr.textColorPrimary, tv, true);
        Log.d(TAG, "getActionIconColor: " + tv.data);
//        TypedValue tv2 = new TypedValue();
//        theme.getResources(R.color.colorAccent, tv2, true);
//        Log.d(TAG, "getActionIconColor: " + tv2.data);
//        return tv.data;
        return Color.BLUE;
    }
}
