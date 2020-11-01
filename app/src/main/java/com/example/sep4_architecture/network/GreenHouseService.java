package com.example.sep4_architecture.network;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GreenHouseService {

    @GET("current")
    Call<Double> lastTemperature();
}
