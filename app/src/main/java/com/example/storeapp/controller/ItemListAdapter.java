package com.example.storeapp.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.storeapp.Activity.DownloadImageTask;
import com.example.storeapp.R;
import com.example.storeapp.model.MatHang;

import java.util.ArrayList;
import java.util.List;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.MyViewHolder> {

    private List<MatHang> mhList;

    public ItemListAdapter(List<MatHang> mhList) {
        this.mhList = mhList;
    }

    @Override
    public ItemListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.alt_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MatHang mh = mhList.get(position);
        holder.itemName.setText(mh.getTenMatHang());
        holder.itemCost.setText(String.valueOf(mh.getGia())+" VND");
        new DownloadImageTask(holder.itemImg)
                .execute(mh.getAnh());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mhList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView itemName;
        TextView itemCost;
        ImageView itemImg;

        public MyViewHolder(View v) {
            super(v);
            itemName =  itemView.findViewById(R.id.main_itemName);
            itemCost = itemView.findViewById(R.id.main_itemCost);
            itemImg = itemView.findViewById(R.id.main_itemImg);
        }
    }
}