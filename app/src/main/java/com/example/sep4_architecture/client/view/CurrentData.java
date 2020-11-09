package com.example.sep4_architecture.client.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.sep4_architecture.R;
import com.example.sep4_architecture.data.Measurement;

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

    public CurrentData() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static CurrentData newInstance(Measurement measurement) {
        CurrentData fragment = new CurrentData();
        Bundle args = new Bundle();
        args.put(MEASUREMENT, measurement);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            measurement = getArguments().getString(MEASUREMENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_current_data, container, false);
    }
}