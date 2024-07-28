package com.example.fitnessapp2.data;

import com.example.fitnessapp2.model.Muscle;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface APIService {
    @GET("exercises")
    Call<List<Muscle>> getMuscle(
            @Header("X-Api-Key") String apiKey,
            @Query("muscle") String muscle
    );


}
