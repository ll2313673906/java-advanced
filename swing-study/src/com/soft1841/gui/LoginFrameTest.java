package com.soft1841.gui;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class LoginFrameTest extends JFrame {
    private JLabel accoutLabel, passwordLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton comfirmButton, quxiaoButton;
    private int width;
    private int height;

    public LoginFrameTest() {
        Dimension screenSize =
                Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.width;
        height = screenSize.height;
        init();
        setTitle("登陆界面");
        setSize(width, height);
        setLocationRelativeTo(null);
        //窗口大小不可变
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        Font font = new Font("宋体", Font.BOLD, 26);
        accoutLabel = new JLabel("账号:");
        accoutLabel.setFont(font);
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel = new JLabel("密码:");
        passwordLabel.setFont(font);
        passwordField = new JPasswordField();
        passwordField.setFont(font);
        comfirmButton = new JButton("登陆");
        comfirmButton.setFont(font);
        quxiaoButton = new JButton("取消");
        quxiaoButton.setFont(font);
        accoutLabel.setBounds(100, 100, 100, 35);
        //账号
        accountField.setBounds(250, 100, 300, 40);
        //账号框
        passwordLabel.setBounds(100, 200, 100, 40);
        //密码
        passwordField.setBounds(250, 200, 300, 35);
        //密码框
        comfirmButton.setBounds(180, 300, 140, 40);
        comfirmButton.setBackground(new Color(209, 196, 233));
        quxiaoButton.setBounds(400, 300, 140, 40);
        quxiaoButton.setBackground(new Color(209, 196, 233));
        setLayout(null);
        ShadePanel shadePanel = new ShadePanel();
        shadePanel.setColor1(new Color(253, 253, 251));
        shadePanel.setColor2(new Color(94, 53, 177));
        shadePanel.setLayout(null);
        shadePanel.setBounds(500, 180, 700, 400);
        ImgPanel imgPanel = new ImgPanel();
        imgPanel.setLayout(null);
        imgPanel.setImgPath("3.jpg");
        imgPanel.setBounds(0, 0, width, height);
        imgPanel.add(shadePanel);
        shadePanel.add(accountField);
        shadePanel.add(accoutLabel);
        shadePanel.add(passwordField);
        shadePanel.add(passwordLabel);
        shadePanel.add(comfirmButton);
        shadePanel.add(quxiaoButton);
        add(imgPanel);
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle =
                    BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new LoginFrameTest();
    }

    class ShadePanel extends JPanel {
        private Color color1;
        private Color color2;

        public void setColor1(Color color1) {
            this.color1 = color1;
        }

        public void setColor2(Color color2) {
            this.color2 = color2;
        }

        @Override
        protected void paintComponent(Graphics g1) {
            Graphics2D g = (Graphics2D) g1;
            System.out.println(" ");
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();
            //创建填充模式对象
            GradientPaint paint = new GradientPaint(0, 0, color1, 0, height, color2);
            g.setPaint(paint);
            g.fillRect(0, 0, width, height);
        }
    }

    class ImgPanel extends JPanel {
        private String imgPath;

        public void setImgPath(String imgPath) {
            this.imgPath = imgPath;
        }

        @Override
        protected void paintComponent(Graphics g) {
            String basePath = System.getProperty("user.dir");
            Image bg = null;
            try {
                bg = ImageIO.read(new File(basePath + "/swing-study/src/img/" + imgPath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

