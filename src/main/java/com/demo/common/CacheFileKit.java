package com.demo.common;

import com.season.common.StrKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 缓存文件
 * 读取文件如果没有修改就不会重新读取
 * !!不能使用该类来读取大文件,缓存不起啊
 * @author joy
 * 2015年12月11日 11:28
 */
public class CacheFileKit {

    //缓存文件的最后修改时间
    private static Map<String,Long> lastModifiedMap = new HashMap<String,Long>();
    //缓存文件的读取内容
    private static Map<String,String> contentMap = new HashMap<String,String>();

    private static Logger logger = LoggerFactory.getLogger(CacheFileKit.class);

    //上次更新时间,每2分钟才去读取wcm发布的文件是否改变
    private static Map<String,Long> lastUpdateTimeMap = new HashMap<String,Long>();

    private static long cacheTime = 2*60*1000;//缓存时间

    /**
     * 读取某个文件,并且缓存该文件内容,如果最后修改时间发生变化重新读取文件内容
     * @param path 绝对路径
     * @param charset 编码
     * @return
     */
    public static String readFile(String path, String... charset){
        if(StrKit.isEmpty(path)){
            return null;
        }
        String content = null;
        String key = Digest.getMD5(path);
        //当前时间
        long nowTime = System.currentTimeMillis();
        Long lastUpdateTime = lastUpdateTimeMap.get(key);
        if(lastUpdateTime!=null && ( nowTime-lastUpdateTime)<cacheTime){
            content = contentMap.get(key);
            if(content!=null){
                return content;
            }
        }
        File file = new File(path);
        if(file==null || !file.exists() || !file.isFile()){
            return null;
        }
        Long lastModified = lastModifiedMap.get(key);
        if(lastModified==null || lastModified!=file.lastModified()){
            content = FileKit.readFile(path,charset);
            contentMap.put(key,content);
            lastModifiedMap.put(key,file.lastModified());
            logger.info("读取系统文件:"+path);
        }else{
            content = contentMap.get(key);
        }
        lastUpdateTimeMap.put(key,System.currentTimeMillis());
        return content;
    }
}
