package com.soft1841.gui;

import javax.swing.*;
import java.io.IOException;

public class CloudMusicFrame {
    private JPanel mainPanel;
    private JPanel LeftPanel;
    private JButton 搜素Button;
    private JButton 发现Button;
    private JButton MVButton;
    private JButton 朋友Button;
    private JPanel CenterPanel;
    private JLabel bottomLabel;
    private JLabel bannerLabel;
    private JPanel musicPanel;
    private JLabel music1;
    private JLabel music2;
    private JLabel music3;
    private JLabel music4;
    private JLabel music5;

    public static void main(String[] args) throws Exception {
        String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
        UIManager.setLookAndFeel(lookAndFeel);
        JFrame frame = new JFrame("CloudMusicFrame");
        frame.setContentPane(new CloudMusicFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //窗口全屏显示
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
