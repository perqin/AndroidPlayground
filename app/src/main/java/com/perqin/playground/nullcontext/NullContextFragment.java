package com.perqin.playground.nullcontext;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.perqin.playground.R;

public class NullContextFragment extends Fragment implements com.perqin.playground.nullcontext.View {
    private Presenter mPresenter;
    private TextView mTextView;

    public NullContextFragment() {
        // Required empty public constructor
    }

    public static NullContextFragment newInstance() {
        return new NullContextFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_null_context, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextView = (TextView) view.findViewById(R.id.textView);
    }

    @Override
    public Context context() {
        return getActivity();
    }

    @Override
    public void setText(String text) {
        mTextView.setText(text);

    }

    public void setPresenter(Presenter presenter) {
        this.mPresenter = presenter;
    }
}
