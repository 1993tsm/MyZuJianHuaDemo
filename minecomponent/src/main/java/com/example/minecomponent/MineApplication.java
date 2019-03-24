package com.example.minecomponent;

import android.app.Application;

import com.example.componentlibrary.IComponentApp;
import com.example.componentlibrary.ServiceFactory;

/**
 * Created by Administrator on 2019/3/24.
 */

public class MineApplication extends Application implements IComponentApp{
    private static Application application;
    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initApplication(this);
    }

    @Override
    public void initApplication(Application app) {
        application = app;
        ServiceFactory.getInstance().setiMineService(new MineService());
    }
}
