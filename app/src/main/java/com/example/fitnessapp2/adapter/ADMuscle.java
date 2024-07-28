package com.example.fitnessapp2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnessapp2.R;
import com.example.fitnessapp2.model.Muscle;

import java.util.List;

public class ADMuscle extends RecyclerView.Adapter<ADMuscle.MyViewHolder> {

    List<Integer> arr;
    List<Muscle> text;

    public void setArr(List<Integer> arr) {
        this.arr = arr;
    }

    public void setMuscleList(List<Muscle> text) {
        this.text = text;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.musclelayout,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(arr.get(position));
        holder.textView.setText(text.get(position).getMuscle());
    }

    @Override
    public int getItemCount() {
        return text.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
            textView=itemView.findViewById(R.id.tv);

        }
    }
}