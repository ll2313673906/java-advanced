package com.soft1841.gui.thread.timer;
/**
 * 闹钟
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ClockTimer extends JFrame {
    private JPanel jPanel;
    private JLabel jLabel;
    private TimerTask clockTask;
    private java.util.Timer timer;

    public ClockTimer(){
        init();
        setTitle("闹钟");
        setSize(400, 200);
        setLocation(1500,10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public void init(){
        jPanel = new JPanel(){
            protected  void  paintComponent(Graphics g){
                try {
                    Image bg = ImageIO.read(new File("F:\\360Downloads\\47620.jpg"));
                    g.drawImage(bg,0,0,getWidth(),getHeight(),null);
                    System.out.println();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
        add(jPanel);

        Font font = new Font("微软雅黑",Font.BOLD,26);
        jLabel = new JLabel();
        jLabel.setFont(font);
        clockTask = new TimerTask() {
            @Override
            public void run() {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeString = sdf.format(date);
                jLabel.setText(timeString);
                jPanel.add(jLabel);
                if(timeString.equals("2019-04-16 09:33:00")){
                    JOptionPane.showMessageDialog(jPanel, "时间到~~");
                    this.cancel();
                }
            }
        };

        timer = new Timer();
        timer.scheduleAtFixedRate(clockTask, 0, 1000);



    }

    public static void main(String[] args) {
        new ClockTimer();
    }
}
