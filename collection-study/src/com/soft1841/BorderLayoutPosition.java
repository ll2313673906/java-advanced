package com.soft1841;

import javax.swing.*;
import java.awt.*;

/**
 * 使用边界布局管理器
 * @author liulian
 * 2019.3.26
 */

public class BorderLayoutPosition extends JFrame {
    public BorderLayoutPosition(){
        setTitle("这个窗体使用边界布局管理器");
        Container c = getContentPane();//定义一个容器
        setLayout(new BorderLayout());//设置容器边界为布局管理器
        JButton centerBtn = new JButton("中通神"),
                northBtn = new JButton("北丐"),
                southBtn = new JButton("南帝"),
                 westBtn = new JButton("西毒"),
               eastBtn = new JButton("东邪");
        // 添加按钮
        c.add(centerBtn,BorderLayout.CENTER);
        c.add(northBtn,BorderLayout.NORTH);
        c.add(southBtn,BorderLayout.SOUTH);
        c.add(westBtn,BorderLayout.WEST);
        c.add(eastBtn,BorderLayout.EAST);
        setSize(350,210);
        setVisible(true);
        // 设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }


}
