package com.example.fitnessapp2.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnessapp2.R;

public class ADBack extends RecyclerView.Adapter<ADBack.MyViewHolder> {

    int [] arr2;
    String[] text2;

    public ADBack(int[] arr, String[] text) {
        this.arr2 = arr;
        this.text2 = text;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.homelayout,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView2.setImageResource(arr2[position]);
        holder.textView2.setText(text2[position]);


    }

    @Override
    public int getItemCount() {
        return arr2.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView2;
        TextView textView2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.ivback);
            textView2 =itemView.findViewById(R.id.tvback);

        }
    }
}


