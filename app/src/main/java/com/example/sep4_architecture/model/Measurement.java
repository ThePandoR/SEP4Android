package com.example.sep4_architecture.model;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Measurement {

    private Long id;
    private Long id_device;
    private LocalDate date;
    private LocalTime time;
    private int temperature;
    private boolean light;
    private int humidity;
    private int co2;
}
