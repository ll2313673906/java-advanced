package com.soft1841.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * 多线程客户端
 * author刘恋
 */
public class Server5 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器启动成功");
        while (true){
            Socket socket = ss.accept();
            ServerThread3 serverThread3 = new ServerThread3(socket);
            new Thread(serverThread3).start();

        }
    }
}
class ServerThread3 implements Runnable{
    private Socket socket;

    public ServerThread3(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println(socket.getRemoteSocketAddress()+"客户端连接成功");
        try{
            InputStream inputStream = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(inputStream);
            File file = new File("F:/sun/"+ UUID.randomUUID().toString()+ ".jpg");
            OutputStream os = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            byte[] data = new byte[1024];
            int tmp;
            while ((tmp = bis.read(data)) != -1){
                bos.write(data,0,tmp);
        }
        bos.close();
            bis.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}