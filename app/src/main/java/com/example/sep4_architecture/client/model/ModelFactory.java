package com.example.sep4_architecture.client.model;

import com.example.sep4_architecture.client.networking.Client;

public class ModelFactory {

    private Client client;
    private LoginM loginM;
    private SignUpM signUpM;
    private MainWindowM mainWindowM;

    public SignUpM getSignUpM(){
        if (signUpM == null){
            signUpM= new SignUpMImpl();
            signUpM.setClient(client);
        }
        return signUpM;
    }

    public LoginM getLoginM(){
        if (loginM== null){
            loginM= new LoginMImpl();
            loginM.setClient(client);
        }
        return loginM;
    }

    public MainWindowM getMainWindowM(){
        if (mainWindowM== null){
            mainWindowM= new MainWindowMImpl();
            mainWindowM.setClient(client);
        }
        return mainWindowM;
    }

    public void setClientFactory(Client client) {
        this.client= client;
    }
}
