package com.soft1841.gui.io;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Calendar;

public class ImageFrame extends JFrame {
    private  JPanel topPanel;
    private JButton[] buttons;
    private  JLabel imglabel;
    private  Icon icon;//接受图片的对象  标记
    private  JLabel namelabel;
    private  JLabel timelabel;


    //构造方法
    public ImageFrame() {
        init();
        setTitle("图片窗口");
        setSize(1000,600);
        //设置自动居中
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    //设置布局、放置组件
    public  void  init()  {
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1;
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        String timelabel2 =year+"-"+month+"-"+day+" "+ hour+ ":" + minutes +":"+ seconds;
        timelabel=new JLabel(timelabel2);
        timelabel.setIcon(icon);
        add(timelabel,BorderLayout.SOUTH);
        topPanel=new JPanel();
        buttons=new JButton[5];
        for (int i=0;i<5;i++){
            buttons[i]=  new JButton("按钮"+i+1);
            topPanel.add(buttons[i]);
        }
        add(topPanel, BorderLayout.NORTH);
        imglabel=new JLabel("图片");
        //读入本地的图片内存到字节数组
        File srcfile=new File("E:/fengzi.jpg");
        InputStream inputStream;
        byte[] bytes = new byte[0];
        try {
            inputStream =new FileInputStream(srcfile);
            bytes= new byte[(int) srcfile.length()];
            inputStream.read(bytes);
        } catch (IOException e) {
            System.out.println("IO异常");
        }
        icon=new ImageIcon(bytes);
        imglabel.setIcon(icon);
        add(imglabel,BorderLayout.CENTER);
        String name=srcfile.getPath();
        namelabel=new JLabel(name);
        add(namelabel,BorderLayout.EAST);
    }
    public static void main (String[] args) {
        new ImageFrame();
    }
}

