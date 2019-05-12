package com.soft1841.gui.thread;

import javax.swing.*;

/*
 *图片轮播窗体
 * @author 刘恋
 * 2019.4.9
 */

public class CarouselFrame extends JFrame {
    JLabel bgLabel;

    public CarouselFrame() {
        init();
        setTitle("轮播窗体");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        bgLabel = new JLabel();
        add(bgLabel);
        CarouselThread ct = new CarouselThread();
        ct.setBgLabel(bgLabel);
        new Thread(ct).start();
    }

    public static void main(String[] args) {
        new CarouselFrame();
    }
}
