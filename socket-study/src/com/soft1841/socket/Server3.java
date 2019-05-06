package com.soft1841.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端向服务器端发送文本数据--控制台版
 * author刘恋
 * 2019.5.7
 */
public class Server3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true) {
            Socket socket = serverSocket.accept();
           ServerThread3 server = new ServerThread3(socket);
           new Thread(server).start();

        }
    }
}
