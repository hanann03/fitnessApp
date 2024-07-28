package com.example.fitnessapp2.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnessapp2.R;
import com.example.fitnessapp2.adapter.ADLegs;

public class LegsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ADLegs recyclerViewAdapter;

    int []arr= {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
        recyclerView=findViewById(R.id.recycler);

        int[] imageResIds = {
                R.drawable.ic_launcher_background, R.drawable.ic_launcher_background
                , R.drawable.ic_launcher_background, R.drawable.ic_launcher_background
                , R.drawable.ic_launcher_background, R.drawable.ic_launcher_background
        };
        String[] text = {
              "lily","sunflower",
                "lily","sunflower",
                "lily","sunflower"
        };


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ADLegs adLegs=new ADLegs(imageResIds,text);
        recyclerView.setAdapter(adLegs);





    }
}