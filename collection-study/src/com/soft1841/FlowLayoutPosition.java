package com.soft1841;
/**
 * Swing的流式布局
 * @author刘恋
 * 2019.3.25
 */

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        setTitle("本场口使用流式布局");
        Container container = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        for (int i = 0; i < 10; i++){
            container.add(new JButton("button" + i));

        }
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}