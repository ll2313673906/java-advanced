package com.soft1841.gui;
/**
 * 流式布局
 * @author
 *
 */

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        // 设置窗体的标题
        setTitle("下面四句诗，那一句是描写夏天的？");
        Container c = getContentPane();
        // 设置窗体使用流式布局管理器，使组件右对齐
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        for (int i = 0 ; i < 8; i++){
            c.add(new JButton("button" + i));
        }
        setSize(300,200);
        // 设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // 设置窗体可见
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }

}
