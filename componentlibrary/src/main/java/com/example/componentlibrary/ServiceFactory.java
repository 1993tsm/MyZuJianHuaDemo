package com.example.componentlibrary;

/**
 * Created by Administrator on 2019/3/24.
 */

public class ServiceFactory {

    private static final   ServiceFactory instance = new ServiceFactory();
    public static ServiceFactory getInstance(){
        return instance;
    }

    private ServiceFactory(){}

    private ILoginService iLoginService;
    private IMineService iMineService;

    public ILoginService getiLoginService()
    {
        if(null == iLoginService){
            iLoginService = new EmptyLoginService();
        }
        return iLoginService;
    }

    public void setiLoginService(ILoginService iLoginService) {
        this.iLoginService = iLoginService;
    }

    public IMineService getiMineService() {
        if(null == iMineService){
            iMineService = new EmptyMineService();
        }
        return iMineService;
    }

    public void setiMineService(IMineService iMineService) {
        this.iMineService = iMineService;
    }
}
