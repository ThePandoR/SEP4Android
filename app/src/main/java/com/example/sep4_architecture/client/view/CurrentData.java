package com.example.sep4_architecture.client.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.sep4_architecture.MainActivity;
import com.example.sep4_architecture.R;
import com.example.sep4_architecture.model.Measurement;
import com.example.sep4_architecture.viewModel.CurrentDataVM;

import java.io.IOException;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CurrentData#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CurrentData extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String MEASUREMENT = "measurement";

    // TODO: Rename and change types of parameters
    private Measurement measurement;

    private CurrentDataVM viewModel;

    private TextView displayTemperature;
    private TextView displayHumidity;
    private TextView displayCo2;

    public CurrentData() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static CurrentData newInstance(Measurement measurement) {
        CurrentData fragment = new CurrentData();
        Bundle args = new Bundle();
        //args.put(MEASUREMENT, measurement);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        displayTemperature = view.findViewById(R.id.currentTemp);
        displayHumidity = view.findViewById(R.id.currentHumidity);
        displayCo2 = view.findViewById(R.id.currentCo2);

        viewModel = ViewModelProviders.of(this).get(CurrentDataVM.class);
        viewModel.getMeasurement().observe(this, measurement -> displayTemperature.setText("" + measurement.getTemperature()));
        viewModel.getMeasurement().observe(this, measurement -> displayHumidity.setText("" + measurement.getHumidity()));
        viewModel.getMeasurement().observe(this, measurement -> displayCo2.setText("" + measurement.getCo2()));

        try {
            viewModel.update();
        } catch (IOException e) {
            // TODO handle error
            throw new RuntimeException(e);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_current_data, container, false);
    }
}