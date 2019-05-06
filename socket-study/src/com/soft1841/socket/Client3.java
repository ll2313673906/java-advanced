package com.soft1841.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端向服务器端发送文本数据--控制台版
 * client端
 * author刘恋
 * 2019.5.7
 */
public class Client3 {
    public static void main(String[] args)throws IOException {
        Socket client = new Socket("localhost",10086);
        System.out.println("成功连上服务器");
        Scanner scanner = new Scanner(System.in);
        BufferedWriter buf;
        System.out.println("请输入一行信息：");
        String str = scanner.nextLine();
        buf = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        buf.write(str);
        buf.flush();
        buf.close();
    }
}
