package com.example.disease_list_api222;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<String> arrayList;

    public Adapter(ArrayList<String> arrayList){
        this.arrayList=arrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item =arrayList.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
        public void setItem(String item){
            textView.setText(item);
        }
    }

    public void addItem(String item){
        arrayList.add(item);
        Log.d("#######배열에 넣어짐 -->    ",item);
    }
    public void setarrayList(ArrayList<String> arrayList) {

        this.arrayList = arrayList;
    }

    public String getItem(int position) {

        return arrayList.get(position);
    }

    public void setItem(int position, String item) {

        arrayList.set(position, item);
    }
}