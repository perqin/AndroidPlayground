package com.perqin.playground.entry;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.perqin.playground.R;

import java.util.ArrayList;

/**
 * Author: Perqin
 * Date  : 2017/7/17
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private final Activity mActivity;

    private ArrayList<Pair<String, Class<?>>> mDataSet = new ArrayList<>();

    RecyclerAdapter(Activity activity) {
        this.mActivity = activity;
    }

    void addItem(String title, @NonNull Class<?> activity) {
        mDataSet.add(new Pair<>(title, activity));
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_entry, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(mDataSet.get(position).first);
        holder.itemView.setOnClickListener(v -> mActivity.startActivity(new Intent(mActivity, mDataSet.get(holder.getAdapterPosition()).second)));
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        ViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
