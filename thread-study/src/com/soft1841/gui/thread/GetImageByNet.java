package com.soft1841.gui.thread;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 读取网络图片
 * @author 刘恋
 * 2019.4.9
 */

public class GetImageByNet {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://tx.haiqq.com/uploads/allimg/150318/230A04I8-11.jpg");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(5 * 1000);
        InputStream inStream = conn.getInputStream();
        ByteArrayOutputStream out1 = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1){
            out1.write(buffer,0,len);
        }
        inStream.close();
        byte[] date = out1.toByteArray();
        File imageFile = new File("Red.png");
        OutputStream out2 = new FileOutputStream(imageFile);

        out2.write(date);
        out2.close();

    }
}
