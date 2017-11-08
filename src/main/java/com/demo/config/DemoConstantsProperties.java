package com.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * bbs用到的需要配置的相关常量
 *
 * @author joy
 *         2015年12月11日 10:09
 */
@ConfigurationProperties(prefix = DemoConstantsProperties.PREFIX)
@Component
public class DemoConstantsProperties {

    public static final String PREFIX = "demo.constants";

    //是否模拟appuser
    private String appName = "/seasonDemo";
    //是否模拟appuser
    private boolean appUser = false;
    //网站域名
    private String domainUrl = "http://bbs.haier.com";
    //静态资源url
    private String staticUrl = "/images";
    //本地静态资源url,方便本地开发使用
    private String localStaticUrl = "/images";

    public boolean isAppUser() {
        return appUser;
    }

    public void setAppUser(boolean appUser) {
        this.appUser = appUser;
    }

    public String getDomainUrl() {
        return domainUrl;
    }

    public void setDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
    }

    public String getStaticUrl() {
        return staticUrl;
    }

    public void setStaticUrl(String staticUrl) {
        this.staticUrl = staticUrl;
    }

    public String getLocalStaticUrl() {
        return localStaticUrl;
    }

    public void setLocalStaticUrl(String localStaticUrl) {
        this.localStaticUrl = localStaticUrl;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
