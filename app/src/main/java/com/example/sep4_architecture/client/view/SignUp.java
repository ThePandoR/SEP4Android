package com.example.sep4_architecture.client.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.sep4_architecture.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SignUp#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SignUp extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    TextView nameLogin;
    TextView signupEmail;
    TextView signupPass;
    TextView signupPassConf;
    Button signupButton;
    float v = 0;

    public SignUp() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_register.
     */
    // TODO: Rename and change types and number of parameters
    public static SignUp newInstance(String param1, String param2) {
        SignUp fragment = new SignUp();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.fragment_signup, container, false);

        nameLogin = vg.findViewById(R.id.name_signup);
        signupEmail = vg.findViewById(R.id.email_signup);
        signupPass = vg.findViewById(R.id.password_signup);
        signupPassConf = vg.findViewById(R.id.repeatPassword_signup);
        signupButton = vg.findViewById(R.id.signupButton);

        nameLogin.setTranslationX(800);
        signupEmail.setTranslationX(800);
        signupPass.setTranslationX(800);
        signupPassConf.setTranslationX(800);
        signupButton.setTranslationX(800);

        nameLogin.setAlpha(v);
        signupEmail.setAlpha(v);
        signupPass.setAlpha(v);
        signupPassConf.setAlpha(v);
        signupButton.setAlpha(v);

        nameLogin.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        signupEmail.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        signupPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        signupPassConf.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        signupButton.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return vg;
    }
}