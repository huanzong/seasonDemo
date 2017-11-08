package com.demo.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author joy
 * 2015年12月11日 10:48
 */
public class FileKit {

    /**
     * 以给定的编码区读取文件内容，将文件内容作为字符串返回
     *
     * @param path
     *            要读取的文件的路径
     * @param charset
     *            指定的字符集 如"utf-8","gbk"
     * @return
     */
    public static String readFile(String path, String... charset){
        return readFile(new File(path),charset);
    }

    /**
     * 以给定的编码区读取文件内容，将文件内容作为字符串返回
     *
     * @param file
     *            要读取的文件
     * @param charsets
     *            指定的字符集 如"utf-8","gbk",默认utf-8
     * @return
     */
    public static synchronized String readFile(File file, String... charsets){
        if(file==null || !file.exists() || !file.isFile()){
            return null;
        }
        String charset = "utf-8";
        if(charsets!=null && charsets.length>0){
            charset = charsets[0];
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, charset);
            String result = "";
            int read;
            while ((read = isr.read()) != -1) {
                result += (char) read;
            }
            isr.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 抓取某个网页的源代码
     * @param urlStr 要抓取网页的地址
     * @param charsets 网页所使用的编码 如"utf-8","gbk"
     * @return
     */
    public static String fetchHtml(String urlStr, String... charsets){
        try{
            String charset = "utf-8";
            if(charsets!=null && charsets.length>0){
                charset = charsets[0];
            }
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            InputStream is = con.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, charset);
            String result = "";
            int read;
            while ((read = isr.read()) != -1) {
                result += (char) read;
            }
            isr.close();
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
