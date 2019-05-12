package com.soft1841.gui;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * 文件选择器组件JFileChooser
 * @author 刘恋
 */
public class JFileChooserTest extends JFrame implements ActionListener {

    private JButton chooserBtn;
    private JLabel pathLable;
    private JFileChooser fileChooser;


    public JFileChooserTest(){
        init();
        setTitle("JFileChooserTest");
        setSize(900,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void init(){
        chooserBtn = new JButton("选择文件");
        pathLable = new JLabel("暂无选择");
        add(chooserBtn, BorderLayout.NORTH);
        chooserBtn.addActionListener(this);
        Font font = new Font("微软雅黑",Font.BOLD,26);
        pathLable.setFont(font);
        add(pathLable);

    }

    public static void main(String[] args) {
        try{
            BeautyEyeLNFHelper.frameBorderStyle=BeautyEyeLNFHelper.frameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new JFileChooserTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // System.out.println("click");
        // 创建 JfileChooser对象
        fileChooser = new JFileChooser();
        // 设置文件选择器的默认路径
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setCurrentDirectory(new File("D:/"));
       // 打开对话框
        int result = fileChooser.showOpenDialog(null);
        // 用户点击了确定按钮
       if (result == JFileChooser.APPROVE_OPTION){
           File file = fileChooser.getSelectedFile();

       }
    }
}
