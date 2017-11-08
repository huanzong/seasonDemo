package com.demo.seasonDemo.handler;

import com.demo.config.DemoConstantsProperties;
import com.season.handler.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author joy
 *         2015年12月02日 10:24
 */
@Component
public class ContextHandler extends Handler {

    @Autowired
    private DemoConstantsProperties constants;

    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, boolean[] isHandled) {
        // 获取头尾静态文件
//        request.setAttribute("publicHeadContent", StaticKit.getContent(constants.getHeadPath()));
//        request.setAttribute("publicFootContent", StaticKit.getContent(constants.getFootPath()));
        request.setAttribute("ctx", request.getContextPath());
        request.setAttribute("PATH", constants.getStaticUrl());
        request.setAttribute("LOCAL_PATH", constants.getAppName() + constants.getLocalStaticUrl());
        request.setAttribute("DOMAIN", constants.getDomainUrl());
        nextHandler.handle(target, request, response, isHandled);
    }

}
