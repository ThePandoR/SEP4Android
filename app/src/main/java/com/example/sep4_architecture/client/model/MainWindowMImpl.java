package com.example.sep4_architecture.client.model;

import com.example.sep4_architecture.client.networking.Client;

public class MainWindowMImpl implements MainWindowM{
    private Client client;

    @Override
    public double getCurrentTemperature() {
        return client.getCurrentTemperature();
    }

    @Override
    public void setClient(Client client) {
        this.client= client;
    }
}
