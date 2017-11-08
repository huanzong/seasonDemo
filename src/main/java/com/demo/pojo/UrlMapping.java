package com.demo.pojo;

import com.season.core.db.Pojo;
import com.season.core.db.annotation.TableInfo;

/**
 * URL映射
 * @author joy
 * 2015年12月25日 18:42
 */
@TableInfo(tableName = UrlMapping.TABLENAME)
public class UrlMapping extends Pojo<UrlMapping> {

    public final static String TABLENAME = "haierapp_url_mapping";

    private Long id;
    private String contextPath;//所属应用
    private String target;//需要跳转的url
    private String source;//匹配原url的正则
    /**
     * 参数,json格式 {"id":"$1","name":"$2","type":123}
     * 比如 /forum/2121/aaaa.html
     * $0的含义为forum
     * $1的含义为2121
     * $2的含义为aaaa
     * ....
     */
    private String params;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
