package com.soft1841.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *服务器向客户端发送信息--控制台
 * author刘恋
 * 2019.5.8
 */
public class Server6 {
    public static void main(String[] args)throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true){
            Socket socket = serverSocket.accept();
            ServerThread server = new ServerThread(socket);
            new Thread(server).start();
        }
    }
}
class ServerThread implements Runnable{
private Socket socket;
public ServerThread(Socket socket){
    this.socket = socket;
}
    @Override
    public void run() {
        System.out.println("客户端" + socket.getInetAddress() + "连接成功");
        String info = "这是一条服务器通知";
        OutputStream outputStream = null;
        try{
            outputStream = socket.getOutputStream();
        }catch (IOException e){
            e.printStackTrace();
        }
        PrintStream printStream = new PrintStream(outputStream);
        printStream.print(info);
        printStream.close();
    }
}