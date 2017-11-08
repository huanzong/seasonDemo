package com.demo.interceptor;

import com.season.aop.Interceptor;
import com.season.aop.Invocation;
import com.demo.common.Context;
import com.demo.controller.base.BaseController;

/**
 * 全局拦截器
 *
 * @author joy
 *         2015年12月23日 13:50
 */
public class BBSGlobalInterceptor implements Interceptor {

    @Override
    public void intercept(Invocation inv) {
        try {
            Context.setBaseController((BaseController) inv.getController());
            inv.invoke();
        } finally {
            Context.removeBaseControllerThreadLocal();
        }
    }
}
