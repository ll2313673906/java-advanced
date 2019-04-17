package com.soft1841.thread.join;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
import java.util.jar.JarFile;

/**
 * 倒计时桌面
 * @author 刘恋
 * 2019.4.17
 */

public class CountdownFrame extends JFrame {
    private int width;
    private int height;
    private JLabel numberLabel;


    public  CountdownFrame() {
        width = 600;
        height = 600;
        init();
        setTitle("桌面倒计时");
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init() {
        ShadePanel shadePanel = new ShadePanel();
        shadePanel.setColor1(new Color(253, 253, 251));
        shadePanel.setColor2(new Color(38, 139, 207));
        shadePanel.setLayout(null);
        add(shadePanel);
     numberLabel = new JLabel();
     numberLabel.setBounds(250,180,500,100);
     Font font = new Font("微软雅红", Font.PLAIN, 50);
     numberLabel.setFont(font);
     shadePanel.add(numberLabel);
     TimerThread timerThread = new TimerThread();

     Thread timerThreadThread = new Thread(timerThread);


     timerThreadThread.start();
     timerThread.setNumberLabel(numberLabel);


    }


    public static void main(String[] args) {
        new CountdownFrame();
    }

    class ShadePanel extends JPanel {
        private Color color1;
        private Color color2;

        public void setColor1(Color color1) {
            this.color1 = color1;
        }

        public void setColor2(Color color2) {
            this.color2 = color2;
        }

        @Override
        protected void paintComponent(Graphics g1) {
            Graphics2D g = (Graphics2D) g1;
            System.out.println(" ");
            super.paintComponent(g);
            int width = 600;
            int height = 600;
            //创建填充模式对象
            GradientPaint paint = new GradientPaint(0, 0, color1, 0,
                    height, color2);
            g.setPaint(paint);
            g.fillRect(0, 0, width, height);

        }
    }
}
