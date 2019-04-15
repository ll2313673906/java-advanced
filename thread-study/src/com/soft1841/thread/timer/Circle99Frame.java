package com.soft1841.thread.timer;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Circle99Frame extends JFrame {


    public static void main(String[] args) {
        JFrame frame = new Circle99Frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        //g.drawString("circle 99", 20, 20);

                int x0 = getSize().width / 2;//圆的最左上角x坐标
                int y0 = getSize().height / 2;//圆的最左上角y坐标
                for (int r = 0; r < getSize().height / 2; r += 10) {
                    g.setColor(getRandomColor());//给画笔设置随机数颜色


                    g.drawOval(x0 - r, y0 - r, r * 2, r * 2);
                }
            }


        public Color getRandomColor () {
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            return color;
        }

    }



