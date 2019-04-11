package com.soft1841.thread;

import javax.swing.*;
import java.awt.*;

/**
 * 在窗体中绘制图像
 * @author 刘恋
 * 2019.4.11
 */

public class DrawImageTest extends JFrame {
    public DrawImageTest(){
        this.setSize(1000,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new CanvasTest());
        this.setTitle("在窗体中绘制图像");

    }

    public static void main(String[] args) {
        new DrawImageTest().setVisible(true);
    }
    class CanvasTest extends Canvas{
        // 创建画布
        public void paint(Graphics g){
            super.paint(g);
            // 创建绘图对象
            Graphics2D g2 = (Graphics2D)g;
            // 获取图片资源
            Image img = new ImageIcon(this.getClass().getResource("/img/1.jpg")).getImage();
            // 显示图像
            g2.drawImage(img,0,0,this);
        }
    }
}
