package com.demo.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.demo.config.DemoConstantsProperties;
import com.season.common.BeanKit;
import com.season.common.StrKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 读取静态文件相关工具类
 * 如:wcm发布的json/html
 *
 * @author joy
 *         2015年12月14日 10:24
 */
public class StaticKit {

    private static DemoConstantsProperties constants = BeanKit.getBean(DemoConstantsProperties.class);

    private static Logger logger = LoggerFactory.getLogger(StaticKit.class);

    //缓存文件的读取内容
    private static Map<String, String> contentMap = new HashMap<String, String>();

    /**
     * 获取文件内容
     * 如果配置的wcm发布目录存在该文件,则从wcm目录读取
     * 如果不存在,则远程调用
     *
     * @param path 站点根目录开始的绝对路径（不包括根路径）,如
     *             /public/bbs_type/discuc_json.json,不包括/bbs
     * @return
     */
    public static String getContent(String path) {
        if (StrKit.isEmpty(path)) {
            return null;
        }
        String fileUrl = constants.getDomainUrl() + path;
        // 本地路径
        String pubFilePath = "";
        File file = new File(pubFilePath);

        //本地路径2
        String pubFilePath2 = "";
        File file2 = new File(pubFilePath2);

        String content;
        //尝试从本地读取
        if (file.exists() && file.isFile()) {
            content = CacheFileKit.readFile(pubFilePath);
        } else if (file2.exists() && file2.isFile()) {
            content = CacheFileKit.readFile(pubFilePath2);
        } else {
            logger.info("本地都没有找到该文件,pubFilePath:" + pubFilePath + ",pubFilePath2:" + pubFilePath2);
            String key = Digest.getMD5(fileUrl);
            content = contentMap.get(key);
            if (!contentMap.containsKey(key) && content == null) {
                long startTime = System.currentTimeMillis();
                //远程下载
                content = FileKit.fetchHtml(fileUrl);
                long endTime = System.currentTimeMillis();
                logger.error("读取远程文件:" + fileUrl + ",耗时:" + (endTime - startTime) + " ms");
                contentMap.put(key, content);
            } else {
                content = contentMap.get(key);
            }
        }
        return content.isEmpty() ? "" : content;
    }


    /**
     * 转json对象
     *
     * @param path
     * @return
     */
    public static JSONObject getJSONObject(String path) {
        String jsonStr = getContent(path);
        if (StrKit.isEmpty(jsonStr)) {
            return null;
        }
        return JSON.parseObject(jsonStr);
    }

    /**
     * 转实体类对象
     *
     * @param path
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getJSONObject(String path, Class<T> clazz) {
        String jsonStr = getContent(path);
        if (StrKit.isEmpty(jsonStr)) {
            return null;
        }
        return JSON.parseObject(jsonStr, clazz);
    }

    /**
     * 转json数组
     *
     * @param path
     * @return
     */
    public static JSONArray getJSONOArray(String path) {
        String jsonStr = getContent(path);
        if (StrKit.isEmpty(jsonStr)) {
            return null;
        }
        return JSON.parseArray(jsonStr);
    }

    /**
     * 转对象集合
     *
     * @param path
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> getJSONOArray(String path, Class<T> clazz) {
        String jsonStr = getContent(path);
        if (StrKit.isEmpty(jsonStr)) {
            return null;
        }
        return JSON.parseArray(jsonStr, clazz);
    }


}
