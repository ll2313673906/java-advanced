package com.soft1841.jdbc;

/**
 * java设计模式四
 * 客户端调用
 * author刘恋
 * 2019.5.23
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}
