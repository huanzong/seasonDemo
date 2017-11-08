package com.demo.seasonDemo.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.season.common.StrKit;
import com.season.handler.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.pojo.UrlMapping;
import com.demo.service.UrlMappingService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 处理URL
 *
 * @author joy
 *         2017年11月02日 14:35
 */
@Service
public class PathHandler extends Handler {

    @Autowired
    private UrlMappingService urlMappingService;

    private static List<UrlMapping> urlMappingList = null;
    private Logger logger = LoggerFactory.getLogger(PathHandler.class);

    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, boolean[] isHandled) {
        long startTime = System.currentTimeMillis();
        String url = new String(target);
        UrlMapping urlMapping = getUrlMapping(target, request);
        //需要重定向
        if (urlMapping != null) {
            String params = urlMapping.getParams();
            //需要设置参数
            if (StrKit.isNotEmpty(params)) {
                setAttr(target, params, request);
            }
            target = urlMapping.getTarget();
        }
        nextHandler.handle(target, request, response, isHandled);
        long endTime = System.currentTimeMillis();
        logger.info("========url:" + url + ",action:" + target + ",time:" + (endTime - startTime) + " ms");
    }


    /**
     * 获取映射
     *
     * @param target
     * @return
     */
    private UrlMapping getUrlMapping(String target, HttpServletRequest request) {
        String contextPath = request.getContextPath();
        if (urlMappingList == null) {
            urlMappingList = urlMappingService.getUrlMappings();
        }
        if (urlMappingList != null && urlMappingList.size() > 0) {
            for (UrlMapping urlMapping : urlMappingList) {
                if (urlMapping.getContextPath().equals(contextPath)) {
                    String regex = urlMapping.getSource();
                    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
                    boolean flg = pattern.matcher(target).matches();
                    if (flg) {
                        return urlMapping;
                    }
                }
            }
        }
        return null;
    }

    /**
     * 清空
     */
    public static void removeUrlMappingList() {
        urlMappingList = null;
    }

    /**
     * 设置参数
     *
     * @param target
     * @param jsonParams
     * @param request
     */
    private void setAttr(String target, String jsonParams, HttpServletRequest request) {
        if (target.indexOf("/") == 0) {
            target = target.substring(1, target.length());
        }
        if (target.indexOf(".") != -1) {
            target = target.substring(0, target.indexOf("."));
        }
        String[] params = target.split("/");
        JSONObject jsonObject = JSON.parseObject(jsonParams);
        String[] keys = jsonObject.keySet().toArray(new String[0]);
        for (String key : keys) {
            String value = jsonObject.getString(key);
            if (StrKit.isNotEmpty(value) && value.indexOf("$") == 0) {
                value = value.substring(1);
                value = params[Integer.valueOf(value)];
            }
            request.setAttribute(key, value);
        }
    }
}
