package com.example.sep4_architecture.network;

import com.example.sep4_architecture.model.Measurement;

import java.io.IOException;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GreenHouseClient {

    private GreenHouseService service;

    public GreenHouseClient(String url){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.service = retrofit.create(GreenHouseService.class);
    }

    public void requestLastMeasurement(Callback<Measurement>callback) throws IOException {
         service.lastMeasurement()
                .enqueue(callback);
    }

}
