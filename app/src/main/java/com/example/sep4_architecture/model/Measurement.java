package com.example.sep4_architecture.model;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;

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
