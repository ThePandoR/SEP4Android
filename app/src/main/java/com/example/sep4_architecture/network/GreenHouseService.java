package com.example.sep4_architecture.network;

import com.example.sep4_architecture.data.Measurement;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GreenHouseService {

    @GET("current")
    Call<Measurement> lastMeasurement();
}
