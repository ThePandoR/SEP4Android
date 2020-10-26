package com.example.sep4_architecture.client.viewModel;

import com.example.sep4_architecture.client.model.LoginM;

public class LoginVMImpl implements LoginVM{

    private LoginM loginM;

    public LoginVMImpl(LoginM loginM) {
        this.loginM= loginM;
    }
}
