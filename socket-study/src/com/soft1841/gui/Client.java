package com.soft1841.gui;

import java.io.IOException;
import java.net.Socket;

/**
 * 网络编程1
 * author刘恋
 * 2019.5.6
 */

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建客户端对象，指定连接的服务器IP和端口
        Socket socket = new Socket("127.0.0.1",8080);
        System.out.println("已和服务器建立连接，远程主机地址：" + socket.getRemoteSocketAddress());
    }
}
