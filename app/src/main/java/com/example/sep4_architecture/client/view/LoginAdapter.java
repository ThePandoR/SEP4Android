package com.example.sep4_architecture.client.view;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {

    int totalNumTabs;

    public LoginAdapter(FragmentManager fm, int behavior, int totalTabs) {
        super(fm, behavior);
        this.totalNumTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalNumTabs;
    }

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Login login = new Login();
                return login;
            case 1:
                SignUp signUp = new SignUp();
                return signUp;
            default:
                return null;
        }
    }

}
