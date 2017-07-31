package com.perqin.playground.nullcontext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.perqin.playground.R;

public class NullContextActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_null_context);

        NullContextFragment fragment = (NullContextFragment) getSupportFragmentManager().findFragmentById(R.id.frameLayout_fragmentContainer);
        if (fragment == null) {
            fragment = NullContextFragment.newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.frameLayout_fragmentContainer, fragment).commit();
        }
        Presenter presenter = new Presenter(fragment);
        fragment.setPresenter(presenter);
    }
}
