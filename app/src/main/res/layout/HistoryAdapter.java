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


public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder>{
    private List<HistoryList> historylistItem;
    private Context context;

    public HistoryAdapter(List<HistoryList> listItem, Context context) {
        this.historylistItem = listItem;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate( R.layout.history_list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HistoryList listitem = historylistItem.get(position);
        holder.textViewHead.setText(listitem.getHead());
        holder.textViewDesc.setText(listitem.getDescription());
    }

    @Override
    public int getItemCount() {
        return historylistItem.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textViewDesc;
        public ViewHolder(View itemView) {
            super(itemView);

            textViewDesc = itemView.findViewById(R.id.history_description);
            textViewHead = itemView.findViewById(R.id.history_heading_text);

        }
    }

}
