package com.example.sep4_architecture.client.viewModel;

import com.example.sep4_architecture.client.model.SignUpM;

public class SignUpVMImpl implements SignUpVM{

    private SignUpM signUpM;

    public SignUpVMImpl(SignUpM signUpM) {
        this.signUpM = signUpM;
    }
}
