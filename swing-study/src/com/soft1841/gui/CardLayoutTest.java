package com.soft1841.gui;
/**
 * 卡片布局
 * @author刘恋
 */

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CardLayoutTest extends JFrame implements ActionListener {
    private JPanel cardPanel;
    private JButton preButton,nextButton;
    private JPanel buttonPanel;
    private CardLayout cardLayout;

    public CardLayoutTest(){
        init();
        setTitle("卡片布局");
        setSize(900,600);
        setLocationRelativeTo(null);
        setResizable(false);
       setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void init(){
        cardLayout = new CardLayout(); // 创建卡片布局对象
        cardPanel = new JPanel();     // 创建一个容器，设置为卡片布局
        cardPanel.setLayout(cardLayout);
        for (int i = 0; i < 3; i++){    // 循环调用三次，每次向容器中加入一个getPanel（）方法得到面板对象，并且编号为1,2,3，
            cardPanel.add(String.valueOf(i + 1),getPanel());

        }
        add(cardPanel);  //容器加入窗体中间


             buttonPanel = new JPanel(); // 底部按钮面板，放入两个按钮，面板加入窗体底部
            buttonPanel.setBackground(new Color(120,165,241));
            preButton = new JButton("上一张");
            nextButton = new JButton("下一张");
           buttonPanel.add(preButton);
           buttonPanel.add(nextButton);
           add(buttonPanel,BorderLayout.SOUTH);
           // 按钮注册监听
           preButton.addActionListener(this);
           nextButton.addActionListener(this);
    }
     // 内部方法返回一个随机产生的背景色的JPanel‘对象
    private JPanel getPanel(){
        JPanel newPanel = new JPanel();
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        newPanel.setBackground(new Color(r,g,b));
        return newPanel;
    }

    public static void main(String[] args) {
        try{
            BeautyEyeLNFHelper.frameBorderStyle=BeautyEyeLNFHelper.frameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new CardLayoutTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 点击的是上一张按钮，
        if (e.getSource() == preButton){
            // 调用previous显示上一张
            cardLayout.previous(cardPanel);
        }else {
            // 调用next显示下一张
            cardLayout.next(cardPanel);
        }

    }
}
