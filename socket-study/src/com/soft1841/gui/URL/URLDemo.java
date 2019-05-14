package com.soft1841.gui.URL;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.net.URL;

/**
 * 网络编程
 * author刘恋
 * 2019.5.14
 */
public class URLDemo {
    public static void main(String[] args) {
        try {

            URL url = new URL("http://www,runoob.com/index.html?language=cn#j2se");
            System.out.println("URL 为：" + url.toString());
            System.out.println("协议为：" + url.getProtocol());
            System.out.println("验证信息为：" + url.getAuthority());
            System.out.println("文件名及请求的参数：" + url.getFile());
            System.out.println("主机名：" + url.getHost());
            System.out.println("路径：" + url.getPath());
            System.out.println("端口：" + url.getPort());
            System.out.println("默认端口：" + url.getDefaultPort());
            System.out.println("请求参数：" + url.getQuery());
            System.out.println("定位位置：" + url.getRef());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
