package com.example.sep4android.Client.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<Double> temperature= new MutableLiveData<>();

    public LiveData<Double> getTemperature(){
            return temperature;
    }

    public void getTemperatureFromServer(){
        temperature.postValue(23.6);
    }

}
