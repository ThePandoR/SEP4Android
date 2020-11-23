package com.example.sep4android.Client.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sep4android.Client.ViewModel.MainActivityViewModel;
import com.example.sep4android.R;

public class MainActivity extends AppCompatActivity {
    MainActivityViewModel mainActivityViewModel;
    TextView temperatureTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temperatureTV= findViewById(R.id.temperatureTV);
        mainActivityViewModel= new ViewModelProvider(this).get(MainActivityViewModel.class);
        mainActivityViewModel.getTemperature().observe(this, new Observer<Double>() {
            @Override
            public void onChanged(Double temperature) {
                temperatureTV.setText(temperature.toString());
            }
        });
    }

    public void getTemperatureFromServer(View view) {
        mainActivityViewModel.getTemperatureFromServer();
    }
}