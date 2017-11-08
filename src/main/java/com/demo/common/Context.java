package com.demo.common;


import com.demo.controller.base.BaseController;
import com.demo.pojo.Appuser;

/**
 * 社区上下文
 * @author joy
 * 2015年12月23日 12:49
 */
public class Context {
    public final static String sessionKey = "bbs_app_user";
    private final static ThreadLocal<Appuser> appuserThreadLocal = new ThreadLocal<Appuser>();
    private final static ThreadLocal<BaseController> baseControllerThreadLocal = new ThreadLocal<BaseController>();


    public static void setAppuser(Appuser appuser) {
        appuserThreadLocal.set(appuser);
    }

    public static void removeAppuserThreadLocal() {
        appuserThreadLocal.remove();
    }

    public static Appuser getCurrUser() {
        return appuserThreadLocal.get();
    }



    public static void setBaseController(BaseController controller) {
        baseControllerThreadLocal.set(controller);
    }

    public static void removeBaseControllerThreadLocal() {
        baseControllerThreadLocal.remove();
    }

    public static BaseController getBaseController() {
        return baseControllerThreadLocal.get();
    }

}


