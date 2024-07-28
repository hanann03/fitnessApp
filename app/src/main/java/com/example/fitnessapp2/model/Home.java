package com.example.fitnessapp2.model;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp2.R;
import com.example.fitnessapp2.activity.MainActivity;
import com.example.fitnessapp2.data.APIService;
import com.example.fitnessapp2.data.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home extends AppCompatActivity {
    private static final String BASE_URL = "https://api.api-ninjas.com/v1/";



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        APIService apisurvice = Retrofit.getClient(BASE_URL).create(APIService.class);
        Call<List<Muscle>> call = apisurvice.getMuscle("UEUOPQUY+s/Fq82davzKJQ==Aj0alGwQMWKQD2KB","biceps");
        call.enqueue(new Callback<List<Muscle>>() {

            public void onResponse(Call<List<Muscle>> call, Response<List<Muscle>> response) {

                if(response.body()!=null){

                }

                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);



            }

            @Override
            public void onFailure(Call<List<Muscle>> call, Throwable t) {

            }
        });


    }

}
