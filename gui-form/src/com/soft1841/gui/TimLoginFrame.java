package com.soft1841.gui;
/**
 * Gui From制作窗体并打包
 * author刘恋
 * 2019.5.13
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimLoginFrame {
    private JPanel mainPanel;
    private JLabel bannerLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox 记住密码CheckBox;
    private JCheckBox 忘记密码CheckBox;
    private JButton button1;
    private JLabel avatarLabel;
    private JButton 登录Button;

    public TimLoginFrame() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"登陆成功");
            }
        });
    }

    public static void main(String[] args){

        JFrame frame = new JFrame("TimLoginFrame");
        frame.setContentPane(new TimLoginFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
