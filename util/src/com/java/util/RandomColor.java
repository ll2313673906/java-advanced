package com.java.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * 随机颜色
 * @author liulian
 * 2019.3.12
 */

public class RandomColor {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        //生成redRandom随机值
        int redRandom = random.nextInt(256);
        //生成greenRandom随机值
        int greenRandom = random.nextInt(256);
        //生成blueRandom随机值
        int blueRandom = random.nextInt(256);
        System.out.println("R:" + redRandom + "，G:" +greenRandom + ",B:" + blueRandom);
        //开始使用钢材的随机的色值绘制图片
        //生成在图片缓冲区生成一个图片对象
        BufferedImage bufferedImage = new BufferedImage(120,40,BufferedImage.TYPE_INT_RGB);//指定图片大小和类型
        //获取画笔
        Graphics g =bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("微软雅黑",Font.BOLD,16);
        g.setFont(font);
        //设置画笔颜色，使用随机生成的颜色

        Color color = new Color(redRandom,greenRandom,blueRandom);
        g.setColor(color);
        //开始绘制矩形，充满图片的缓冲区
        g.fillRect(0,0,120,40);
        //输出图片
        g.setColor(Color.BLACK);
        for (int i = 0 ; i <= 50; i++){
            int x = random.nextInt(120);
            int y = random.nextInt(40);
            int x1 = random.nextInt(12);
            int y1= random.nextInt(12);
            g.drawLine(x,y,x + x1,y + y1);
        }

       g.drawString("M" + "B" + "V" + "g",40,25);
        //指定文件路径
        File file = new File("F:/code.jpg");

        //获取输出流
        OutputStream outputStream = new FileOutputStream(file);

        //将图片从缓冲区通过字节流写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //关闭输出流
        outputStream.close();


    }
}
