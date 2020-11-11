package com.example.sep4_architecture.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.sep4_architecture.model.Measurement;
import com.example.sep4_architecture.network.GreenHouseClient;

import java.io.IOException;


import lombok.Getter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Getter
public class CurrentDataVM extends ViewModel {

    private MutableLiveData<Measurement> measurement;
    private GreenHouseClient client;

    // public CurrentDataVM(GreenHouseClient client) {
    public CurrentDataVM() {
        this.client = new GreenHouseClient("https://localhost:8080/");
        measurement = new MutableLiveData<Measurement>();
    }

    public void update() throws IOException {
        client.requestLastMeasurement(new Callback<Measurement>() {
            public void onResponse(Call<Measurement> call, Response<Measurement> measurementResponse) {
                measurement.setValue(measurementResponse.body());
            }

            @Override
            public void onFailure(Call<Measurement> call, Throwable t) {
                System.out.println("Network error");
                throw new RuntimeException(t);
            }
        });
    }

    public LiveData<Measurement> getMeasurement(){
        return measurement;
    }
}
