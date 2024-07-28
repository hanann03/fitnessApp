package com.example.fitnessapp2.activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnessapp2.R;
import com.example.fitnessapp2.adapter.ADBack;
import com.example.fitnessapp2.adapter.ADLegs;

public class BackActivity extends AppCompatActivity {

    private RecyclerView recycleback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        recycleback=findViewById(R.id.recycleback);

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


        recycleback.setLayoutManager(new LinearLayoutManager(this));
        ADLegs adLegs=new ADLegs(imageResIds,text);
        recycleback.setAdapter(adLegs);





    }
}