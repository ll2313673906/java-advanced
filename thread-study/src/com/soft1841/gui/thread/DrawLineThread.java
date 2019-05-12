package com.soft1841.gui.thread;
/**
 * 在窗体中自动绘制彩色线段
 * @author 刘恋
 * 2019.4.10
 */
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawLineThread implements Runnable {
    int x = 200;
    int y = 100;

    private JFrame frame;
    private Color[] colors = {Color.RED,Color.ORANGE,
    Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE};
    public void setFrame(JFrame frame){
        this.frame = frame;
    }
    @Override
    public void run() {
        Random random = new Random();
        while (true){
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Graphics graphics = frame.getGraphics();
            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawLine(x,y,650,y);
            y += 10;
            if (y >= 500){
                y = 100;
            }
        }

    }
}