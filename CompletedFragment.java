package com.example.lokesh.bittrexcryptoexchange;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CompletedFragment extends Fragment {

    private RecyclerView recyclerView;
    private  RecyclerView.Adapter adapter;
    private List<CompletedList> completedlistitems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_completed, container, false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.completed_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        completedlistitems = new ArrayList<>();

        for(int i=0;i<10;i++){
            CompletedList listitem = new CompletedList(
                    "Heading"+(i+1),
                    "dummy text"
            );
            completedlistitems.add(listitem);
        }

        adapter=new CompletedAdapter(completedlistitems,getContext());
        recyclerView.setAdapter(adapter);
        return rootView;

    }




}
