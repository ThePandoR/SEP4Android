package com.example.sep4_architecture.client.model;

import com.example.sep4_architecture.client.networking.Client;

public class LoginMImpl implements LoginM{
    private Client client;

    @Override
    public void setClient(Client client) {
        this.client= client;
    }

    @Override
    public boolean login() {
        return client.login();
    }
}
