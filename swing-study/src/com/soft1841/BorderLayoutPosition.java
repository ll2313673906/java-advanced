package com.soft1841;

import javax.swing.*;
import java.awt.*;

/**
 * 边界布局管理器
 * @author 刘恋
 */

public class BorderLayoutPosition extends JFrame {

    public BorderLayoutPosition(){
        // 创建窗体标题
        setTitle("边界布局管理器");
        // 定义容器
        Container container = getContentPane();
        // 设置容器为边界布局管理器
        setLayout(new BorderLayout());
        JButton centerBtn = new JButton("中"),
                northBtn = new JButton("北"),
                southBtn = new JButton("南"),
                westBtn = new JButton("西"),
                eastBtn = new JButton("东");
        // 添加按钮
        container.add(centerBtn,BorderLayout.CENTER);
        container.add(northBtn,BorderLayout.NORTH);
        container.add(southBtn,BorderLayout.SOUTH);
        container.add(eastBtn,BorderLayout.EAST);
        container.add(westBtn,BorderLayout.WEST);
        // 设置窗体的大小
        setSize(350,200);
        // 设置窗体可见
        setVisible(true);
        // 设置窗体关闭的方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);




    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }
}
