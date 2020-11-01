package com.example.sep4_architecture.network;

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

    public double getLastTemperature() throws IOException {

        return service.lastTemperature()
                .execute()
                .body();
    }

}
