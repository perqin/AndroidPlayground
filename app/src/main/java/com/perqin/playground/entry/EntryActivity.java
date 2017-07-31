package com.perqin.playground.entry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.perqin.playground.R;
import com.perqin.playground.activities.MainActivity;
import com.perqin.playground.indicatortint.IndicatorTintActivity;
import com.perqin.playground.logcat.LogCatActivity;

public class EntryActivity extends AppCompatActivity {
    private RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        mAdapter = new RecyclerAdapter(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);

        addAllPlaygrounds();
    }

    private void addAllPlaygrounds() {
        mAdapter.addItem("Activities", MainActivity.class);
        mAdapter.addItem("Indicator Tint", IndicatorTintActivity.class);
        mAdapter.addItem("Logcat", LogCatActivity.class);
    }
}
