package com.soft1841.gui.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 多线程的服务端
 */
public class Server4 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动成功");
        while (true){
            Socket socket = serverSocket.accept();
            ServerThread2 server = new ServerThread2(socket);
            new Thread(server).start();
        }

    }
}
class ServerThread2 implements Runnable {
    private Socket socket;

    public ServerThread2(Socket socket) {
        this.socket = socket;
    }



    @Override
    public void run() {
        System.out.println(socket.getInetAddress()+"客户端连接成功");

        try {

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }


