package com.example.sep4_architecture.network;

import com.example.sep4_architecture.data.Measurement;

import java.io.IOException;

import retrofit2.Retrofit;

public class GreenHouseClient {

    private GreenHouseService service;

    public GreenHouseClient(String url){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .build();

        this.service = retrofit.create(GreenHouseService.class);
    }

    public Measurement getLastMeasurement() throws IOException {

        return service.lastMeasurement()
                .execute()
                .body();
    }

}
