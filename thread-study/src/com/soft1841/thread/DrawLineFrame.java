package com.soft1841.thread;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * 在窗体中自动绘制彩色线段
 * @author 刘恋
 * 2019.4.10
 */

public class DrawLineFrame extends JFrame {
    public DrawLineFrame(){
        init();
        setTitle("绘制彩色线段");
        setLocationRelativeTo(null);
        setSize(900,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void init(){
       getContentPane().setBackground(new Color(23,35,178));
       DrawLineThread drawLineThread = new DrawLineThread();
       drawLineThread.setFrame(this);
       new Thread(drawLineThread).start();
    }

    public static void main(String[] args) {
        new DrawLineFrame();
    }

}