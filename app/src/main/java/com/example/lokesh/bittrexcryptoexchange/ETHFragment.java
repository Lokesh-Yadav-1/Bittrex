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


public class ETHFragment extends Fragment {
    private RecyclerView recyclerView;
    private  RecyclerView.Adapter adapter;
    private List<Listitem> listitems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_eth, container, false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        listitems = new ArrayList<>();

        for(int i=0;i<10;i++){
            Listitem listitem = new Listitem(
                    "Coin"+(i+1),
                    "0.123987",
                    "10.21"
            );
            listitems.add(listitem);
        }

        adapter=new MyAdapter(listitems,getContext());
        recyclerView.setAdapter(adapter);
        return rootView;
    }

}
