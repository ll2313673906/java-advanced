package com.soft1841.gui.socket;

import java.io.*;
import java.net.Socket;

public class Client5 {
    public static void main(String[] args) throws IOException {
        Socket client5=new Socket("127.0.0.1",10086);
        System.out.println("成功连上服务器.." );
        File file=new File("D:\\fengzi.jpg");
        byte[]b=new byte[(int) file.length()];
        InputStream is=new FileInputStream(file);
        is.read(b);
        BufferedOutputStream bos=new BufferedOutputStream(client5.getOutputStream());
        bos.write(b);
        is.close();
        bos.close();
    }
}
