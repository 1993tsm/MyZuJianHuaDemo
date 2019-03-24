package com.example.administrator.myzujianhuademo;

import android.app.Application;

import com.example.componentlibrary.ComponentConfig;
import com.example.componentlibrary.IComponentApp;

/**
 * Created by Administrator on 2019/3/24.
 */

public class MainApplication extends Application implements IComponentApp{
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
    public void initApplication(Application application) {
        for(String s: ComponentConfig.strings){
            try {
                Class<?> clazz = Class.forName(s);
                Object object = clazz.newInstance();
                if(object instanceof IComponentApp){
                    ((IComponentApp) object).initApplication(this);  //获取到所有组件的application 并且将mainApplication 传到每个组件的application中
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
