package com.example.lokesh.bittrexcryptoexchange;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lokesh on 3/3/18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<Listitem> listItem;
    private Context context;

    public MyAdapter(List<Listitem> listItem, Context context) {
        this.listItem = listItem;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate( R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Listitem listitem = listItem.get(position);
        holder.textViewHead.setText(listitem.getHead());
        holder.textViewDesc.setText(listitem.getDescription());
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textViewDesc;
        public ViewHolder(View itemView) {
            super(itemView);

            textViewDesc = itemView.findViewById(R.id.description);
            textViewHead = itemView.findViewById(R.id.headingtext);

        }
    }

}
