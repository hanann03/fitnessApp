package com.example.fitnessapp2.data;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {

        private static retrofit2.Retrofit retrofit =null;

        public static retrofit2.Retrofit getClient(String baseurl){

            if(retrofit==null){

                retrofit = new retrofit2.Retrofit.Builder()
                        .baseUrl(baseurl)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

            }
            return retrofit;

        }
    }


