package com.example.logincomponent;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.componentlibrary.IComponentApp;

public class LoginActivity extends AppCompatActivity implements IComponentApp{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void initApplication(Application application) {
    }
}
