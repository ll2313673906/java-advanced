package com.soft1841.gui.thread.comprehensive;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CarouselThread1 implements Runnable {
    private String[] imgs = {"D:/carousel/1.jpg",
            "D:/carousel/2.jpg","D:/carousel/3.jpg",
            "D:/carousel/4.jpg","D:/carousel/5.jpg",
            "D:/carousel/6.jpg","D:/carousel/7.jpg"};
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
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
                bgLabel.setIcon(icon);
                try {
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
