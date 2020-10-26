package com.example.sep4_architecture.client.viewModel;

import com.example.sep4_architecture.client.model.MainWindowM;

public class MainWindowVMImpl implements MainWindowVM{
    private MainWindowM mainWindowM;

    public MainWindowVMImpl(MainWindowM mainWindowM) {
        this.mainWindowM = mainWindowM;
    }
}
