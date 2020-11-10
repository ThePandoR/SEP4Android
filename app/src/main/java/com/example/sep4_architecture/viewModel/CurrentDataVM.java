package com.example.sep4_architecture.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.sep4_architecture.model.Measurement;
import com.example.sep4_architecture.network.GreenHouseClient;

import java.io.IOException;

import lombok.Getter;

@Getter
public class CurrentDataVM extends ViewModel {

    private MutableLiveData<Measurement> measurement;
    private GreenHouseClient client;

    // public CurrentDataVM(GreenHouseClient client) {
    public CurrentDataVM() {
        this.client = new GreenHouseClient("http://192.168.137.1:8080");
        measurement = new MutableLiveData<Measurement>();
    }

    public void update() throws IOException {
        measurement.setValue(client.getLastMeasurement());
    }

    public LiveData<Measurement> getMeasurement(){
        return measurement;
    }
}
