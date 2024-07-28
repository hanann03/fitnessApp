package com.example.fitnessapp2.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fitnessapp2.R;
import com.example.fitnessapp2.adapter.ADMuscle;
import com.example.fitnessapp2.data.APIService;
import com.example.fitnessapp2.data.Retrofit;
import com.example.fitnessapp2.model.Muscle;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ADMuscle AD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclehome);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AD = new ADMuscle();
        fetchProducts();
    }

    private void fetchProducts() {
        APIService api = Retrofit.getClient("https://api.api-ninjas.com/v1/").create(APIService.class);
        Call<List<Muscle>> call = api.getMuscle("UEUOPQUY+s/Fq82davzKJQ==Aj0alGwQMWKQD2KB","biceps");// khdna instance mn retrofit w creatna beh api service

        List<Integer> list = List.of(R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background);


        call.enqueue(new Callback<List<Muscle>>() {
            @Override
            public void onResponse(Call<List<Muscle>> call, Response<List<Muscle>> response) {
                if (response.isSuccessful()) {
                    List<Muscle> muscleList = response.body();
                    Log.i("onResponse",response.body().size() + "") ;
                    AD.setMuscleList(muscleList);
                    AD.setArr(list);
                    recyclerView.setAdapter(AD);
                }else {
                    Log.i("onError",response.message());
                    Log.i("onError",response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<List<Muscle>> call, Throwable t) {
            }
        });
    }
}