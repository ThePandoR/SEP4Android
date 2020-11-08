package com.example.sep4_architecture.data;

import java.time.LocalDate;
import java.time.LocalTime;

public class Measurement {

    public Measurement() {}

    private int id;
    private int id_device;
    private LocalDate date;
    private LocalTime time;
    private int temperature;
    private boolean light;
    private int humidity;
    private int co2;
}
