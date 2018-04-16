package com.example.android.logo.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter> {
    private class GustiViewHolder extends RecyclerView.ViewHolder {
        TextView item;

        public GustiViewHolder(View itemView) {
            super(itemView);

        }

    }

}
