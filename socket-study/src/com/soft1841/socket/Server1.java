package com.soft1841.socket;
/**
 * 服务器向客户端发送文本数据
 *
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1  {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10091);
        System.out.println("服务器启动");
        OutputStream out;
        String info = "Java Socket Study";
        while (true){
            Socket socket = ss.accept();
            System.out.println(socket.getInetAddress()+ "上线了");
            out = socket.getOutputStream();
            out.write(info.getBytes());
            out.close();
            socket.close();
        }
    }
}
