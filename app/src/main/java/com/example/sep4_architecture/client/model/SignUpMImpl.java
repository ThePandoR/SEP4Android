package com.example.sep4_architecture.client.model;

import com.example.sep4_architecture.client.networking.Client;

public class SignUpMImpl implements SignUpM{
    private Client client;

    @Override
    public void setClient(Client client) {
        this.client= client;
    }

    @Override
    public boolean register() {
        return client.register();
    }
}
