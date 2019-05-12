package com.soft1841.gui.thread;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImgCarouselThread implements Runnable{
    private String[] imgs = {"D:/carousel/Yellow.png",
            "D:/carousel/Yellow.png",
            "D:/carousel/Yellow.png",
            "D:/carousel/Yellow.png",
            "D:/carousel/Yellow.png",
            "D:/carousel/Yellow.png"};
    private JLabel jLabel;

    public void setjLabel(JLabel jLabel) {
        this.jLabel = jLabel;
    }

    @Override
    public void run() {
        int i = 0;
        int len = imgs.length - 1;
        while (true){
            try {
                File file = new File(imgs[i]);
                InputStream inputStream = new FileInputStream(file);
                byte[] bytes = new byte[(int) file.length()];
                inputStream.read(bytes);
                Icon icon = new ImageIcon(bytes);
                jLabel.setIcon(icon);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i == len){
                    i = 0;
                }
            }catch (IOException e){
                System.out.println("IO异常");
            }
        }

    }
}
