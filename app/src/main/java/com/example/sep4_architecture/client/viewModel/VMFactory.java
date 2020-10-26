package com.example.sep4_architecture.client.viewModel;

import com.example.sep4_architecture.client.model.ModelFactory;

public class VMFactory {
    private ModelFactory modelFactory;
    private SignUpVM signUpVM;
    private LoginVM loginVM;
    private MainWindowVM mainWindowVm;

    public VMFactory(ModelFactory modelFactory) {
        this.modelFactory = modelFactory;
    }

    public SignUpVM getSignUpVM(){
        if (signUpVM==null){
            signUpVM= new SignUpVMImpl(modelFactory.getSignUpM());
        }
        return signUpVM;
    }

    public LoginVM getLoginVM(){
        if (loginVM==null){
            loginVM= new LoginVMImpl(modelFactory.getLoginM());
        }
        return loginVM;
    }

    public MainWindowVM getMainWindowVm(){
        if (mainWindowVm== null){

                mainWindowVm= new MainWindowVMImpl(modelFactory.getMainWindowM());
        }
        return mainWindowVm;
    }
}
