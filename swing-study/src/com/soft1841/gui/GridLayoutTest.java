package com.soft1841.gui;

import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JFrame {
    JButton[] gl = {null,null,null,null,null,null,null,null};

    public static void main(String[] args) {
        GridLayoutTest gridLayoutDemo = new GridLayoutTest();
    }

    public GridLayoutTest(){
        gl[0] = new JButton("话梅");
        gl[1] = new JButton("果脯");
        gl[2] = new JButton("薯片");
        gl[3] = new JButton("巧克力");
        gl[4] = new JButton("腰果");
        gl[5] = new JButton("锅巴");
        gl[6] = new JButton("开心果");
        gl[7] = new JButton("核桃");

        this.setLayout(new GridLayout(3,3,15,15)); // 15,15,是行和列之间的间隔

        for (int i = 0; i < 8; i++){
            this.add(gl[i]);
        }

        this.setTitle("网格布局");
        this.setSize(200,300);
        this.setLocation(300,400);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}


