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
 * Created by Karan on 04/03/2018.
 */


public class CompletedAdapter extends RecyclerView.Adapter<CompletedAdapter.ViewHolder>{
    private List<CompletedList> completedlistItem;
    private Context context;

    public CompletedAdapter(List<CompletedList> listItem, Context context) {
        this.completedlistItem = listItem;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate( R.layout.completed_list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CompletedList listitem = completedlistItem.get(position);
        holder.textViewHead.setText(listitem.getHead());
        holder.textViewDesc.setText(listitem.getDescription());
    }

    @Override
    public int getItemCount() {
        return completedlistItem.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textViewDesc;
        public ViewHolder(View itemView) {
            super(itemView);

            textViewDesc = itemView.findViewById(R.id.completed_description);
            textViewHead = itemView.findViewById(R.id.completed_heading_text);

        }
    }

}
