package com.soft1841.thread.join;

import javax.swing.*;
import java.awt.*;

/**
 * 使用join（）方法控制进度条的滚动
 * @author 刘恋
 *
 */

public class JoinTest extends JFrame {

    private static final long serialVersionUID = 1L;
    // 定义两个线程
    private Thread threadA;
    private Thread threadB;

    // 定义两个进度条组件
    final JProgressBar progressBar = new JProgressBar();
    final  JProgressBar progressBar2 = new JProgressBar();

    int count = 0;

    public static void main(String[] args) {
        new JoinTest();
    }
    public JoinTest() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setVisible(true);

        // 将进度条设置在窗体的最北面
        getContentPane().add(progressBar, BorderLayout.NORTH);
        // 将进度条设置在窗体的最南面
        getContentPane().add(progressBar2,BorderLayout.SOUTH);
        // 设置进度条显示数字字符
        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);
        // 使用匿名内部类形式初始化Thread实例
        threadA = new Thread(new Runnable() {
            int count = 0;
            // 重写run方法
            public void run(){
                while (true){
                    progressBar.setValue(++count);//设置进度条的当前值
                    try{
                        Thread.sleep(100);
                        if (count == 20){
                            threadB.join();
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }


        });
        // 启动线程A
        threadA.start();
        threadB = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while (true){
                    progressBar2.setValue(++count);
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    if (count == 100)
                        break;
                }
            }
        });
        threadB.start();
    }



}
