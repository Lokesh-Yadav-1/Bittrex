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


public class BalanceAdapter extends RecyclerView.Adapter<BalanceAdapter.ViewHolder>{
    private List<BalanceList> balancelistItem;
    private Context context;

    public BalanceAdapter(List<BalanceList> listItem, Context context) {
        this.balancelistItem = listItem;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate( R.layout.balance_list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BalanceList listitem = balancelistItem.get(position);
        holder.textViewHead.setText(listitem.getHead());
        holder.textViewDesc.setText(listitem.getDescription());
    }

    @Override
    public int getItemCount() {
        return balancelistItem.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textViewDesc;
        public ViewHolder(View itemView) {
            super(itemView);

            textViewDesc = itemView.findViewById(R.id.balance_description);
            textViewHead = itemView.findViewById(R.id.balance_heading_text);

        }
    }

}
