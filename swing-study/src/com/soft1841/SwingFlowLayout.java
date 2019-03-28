package com.soft1841;

import javax.swing.*;
import java.awt.*;

/**
 * Swing-FlowLayout流式布局管理器
 * @author 刘恋
 */

public class SwingFlowLayout extends JFrame {
    public SwingFlowLayout(){
        // 设置标题
        setTitle("流式布局管理器");
        Container container = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));

            container.add(new JLabel("下面四句诗，那一句是描写夏天的？" ));
            container.add(new JButton("A.秋风萧瑟天气凉,草木摇荡露为霜。" ));
            container.add(new JButton("B.白雪纷纷何所以，撒盐空中差可拟。" ));
            container.add(new JButton("C.接天莲叶无穷碧，映日荷花别样红。" ));
            container.add(new JButton("D.竹外桃花三两枝，春江水暖鸭先知。" ));

        // 设置窗体大小
        setSize(300,250);
        // 设置窗体关闭的方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // 设置窗体可见
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingFlowLayout();
    }

}
