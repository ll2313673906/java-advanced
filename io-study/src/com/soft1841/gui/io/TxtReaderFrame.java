package com.soft1841.gui.io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * txt文件阅读器窗体
 * @author liulian
 */

public class TxtReaderFrame extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton confirmButton;
    private JPanel topPanel;
    private JTextArea contentArea;


    public TxtReaderFrame(){
        init();
        setTitle("文本阅读窗体");
        setSize(new Dimension(640,480));
        setLocationRelativeTo(null);// 居中
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public  void init(){
      // Font font = new Font("微软雅黑"，)
        inputField = new JTextField(30);
        //设置合适大小
        inputField.setPreferredSize(new Dimension(120,40));
        confirmButton = new JButton("确认");
        confirmButton.setPreferredSize(new Dimension(60,40));
        topPanel = new JPanel();
        topPanel.add(inputField);
        topPanel.add(confirmButton);
        // 给按钮注册监听
        confirmButton.addActionListener(this);
        add(topPanel, BorderLayout.NORTH);

        //中间的多行文本域
        contentArea = new JTextArea();
        add(contentArea);

    }

    public static void main(String[] args) {
        new TxtReaderFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取输入框的内容
        String filePath = inputField.getText().trim();
        File file = new File(filePath);// 创建文件
        // 用三种方法将File中的内容读入

        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            // 读入内容，到字节数组
            inputStream.read(bytes);
            // 使用bytes构建一个结果字符串
            String resultStr = new String(bytes);
            contentArea.append(resultStr);
            contentArea.append("\r\n");
        } catch (IOException e1) {
            System.out.println("iO异常");

        }
    }
}
