package com.example.android.logo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager layoutManager;
    //TODO creare il mio adapter
    private RecyclerView.Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_list);

        mRecyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());

        mRecyclerView.setLayoutManager(layoutManager);



        return view;
    }
}
