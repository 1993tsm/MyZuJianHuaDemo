package com.example.logincomponent;

import android.app.Application;

import com.example.componentlibrary.IComponentApp;
import com.example.componentlibrary.ServiceFactory;

/**
 * Created by Administrator on 2019/3/24.
 */

public class LoginApplication extends Application implements IComponentApp{
    private static Application application;
    public Application getApplication(){
        return  application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initApplication(this);  //如果组件作为一个模块单独运行的话肯定会调用onCreate
    }

    @Override
    public void initApplication(Application app) {
        application = app;
        ServiceFactory.getInstance().setiLoginService(new LoginService());
    }
}
