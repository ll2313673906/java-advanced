package com.soft1841.thread.comprehensive;

import com.soft1841.thread.*;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

/**
 * 综合大作业
 * @author 刘恋
 */

public class HomeworkFrame extends JFrame implements ActionListener {
    private JPanel cardPanel;
    private JButton preButton, nextButton;
    private JPanel buttonPanel;
    private CardLayout cardLayout;

    // 图片轮播
    private JLabel bgLabel;


    //日期
    private JPanel mianban;
    private JLabel numberLable;
    private JLabel dateLabel;

    //倒计时
    private JLabel timerLabel;
    private JPanel mianban3;

    // 选择文件
    private JTextField inputField;
    private JButton confirmButton;
    private JPanel topPanel;
    private JTextArea contentArea;
    private JPanel wenjianmianban;

    //选择图片
    private JButton chooserBtn;
    private JFileChooser fileChooser;
    private JPanel centerPane,bootomPanel;
    private CardLayout cardLayout1;
    private JLabel imgLabel;
    private  Icon icon;






    public HomeworkFrame() {
        init();
        setTitle("大作业");
        setSize(1920, 1039);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void init() {

        cardLayout = new CardLayout(); // 创建卡片布局对象
        cardPanel = new JPanel(); // 创建一个容器，设置为卡片布局
        cardPanel.setLayout(cardLayout);
        for (int i = 0; i < 3; i++) {    // 循环调用三次，每次向容器中加入一个getPanel（）方法得到面板对象，并且编号为1,2,3，
            cardPanel.add(String.valueOf(i + 1), getPanel());


        }
        add(cardPanel);  //容器加入窗体中间



        buttonPanel = new JPanel(); // 底部按钮面板，放入两个按钮，面板加入窗体底部
        buttonPanel.setBackground(new Color(253, 161, 146));
        preButton = new JButton("后退");
        nextButton = new JButton("前进");
        buttonPanel.add(preButton);
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.NORTH);
        // 按钮注册监听
        preButton.addActionListener(this);
        nextButton.addActionListener(this);

        //倒计时
        mianban3 = new JPanel();
        timerLabel = new JLabel();
        mianban3.add(timerLabel);
        cardPanel.add(mianban3);
        timerLabel.setBounds(550,200,500,100);
        Font font3 = new Font("微软雅黑", Font.BOLD, 70);
        timerLabel.setFont(font3);
        mianban3.setLayout(null);
        TimerThread1 timerThread1 = new TimerThread1();
        new Thread(timerThread1).start();
        timerThread1.setTimerLabel(timerLabel);




        // 图片轮播
        bgLabel = new JLabel();
        CarouselThread1 carouselThread1 = new CarouselThread1();
        carouselThread1.setBgLabel(bgLabel);
        new Thread(carouselThread1).start();
        cardPanel.add(bgLabel);


        // 日期
        mianban = new JPanel();
        numberLable = new JLabel("随机数");
        Font font = new Font("微软雅黑", Font.BOLD, 60);
        numberLable.setFont(font);
        NumThread numThread = new NumThread();
        numThread.setNumberLabel(numberLable);
        numThread.start();
        dateLabel = new JLabel("日期变换");
        Font font1 = new Font("隶书", Font.BOLD, 25);

        dateLabel.setFont(font1);
        mianban.add(numberLable);
        buttonPanel.add(dateLabel);//
        cardPanel.add(mianban);
        DateThread dateThread = new DateThread();
        dateThread.setDateLabel(dateLabel);

        dateThread.start();


        // 选择文件
        wenjianmianban = new JPanel();
    Font font2 = new Font("隶书",Font.BOLD,25);
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
        cardPanel.add(topPanel, BorderLayout.NORTH);


        //中间的多行文本域
        contentArea = new JTextArea();
        contentArea.setFont(font2);
        cardPanel.add(contentArea,BorderLayout.CENTER);

        cardPanel.add(wenjianmianban);

        // 选择图片
        chooserBtn = new JButton("选择图片");

        bootomPanel = new JPanel();
        bootomPanel.add(chooserBtn);

        cardPanel.add(bootomPanel,BorderLayout.SOUTH);
        chooserBtn.addActionListener(this);

        centerPane = new JPanel();
        cardLayout1 = new CardLayout();
        centerPane.setLayout(cardLayout1);
        cardPanel.add(centerPane);
        centerPane.setBackground(new Color(206, 147, 206));


        //阴影效果
        ShadePanel shadePanel1 = new ShadePanel();
        shadePanel1.setColor1(new Color(230, 81, 0));
        shadePanel1.setColor2(new Color(253, 253, 251));

        cardPanel.add(shadePanel1);




    }


    // 内部方法返回一个随机产生的背景色的JPanel‘对象
    private JPanel getPanel() {
        JPanel newPanel = new JPanel();
        return newPanel;
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new HomeworkFrame();

    }

    //阴影效果
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




    @Override
    public void actionPerformed(ActionEvent e) {
        //选择图片
        if(e.getSource() == chooserBtn){
            fileChooser = new JFileChooser();
            //设置文件选择器的默认路径
            fileChooser.setCurrentDirectory(new File("D:\\qn"));
            fileChooser.setMultiSelectionEnabled(true);
            int result = fileChooser.showOpenDialog(null);
            //用户点击“确认”按钮
            if(result == JFileChooser.APPROVE_OPTION){
                File[] files = fileChooser.getSelectedFiles();
                for (File f:files) {
                    System.out.println(f.getAbsolutePath());
                    //对每个f文件，创建输入流读入字节数组，构建Icon,并设置给JLable
                    try {
                        InputStream inputStream = new FileInputStream(f);
                        byte[] bytes = new byte[(int) f.length()];
                        //读入内容到字节数组
                        inputStream.read(bytes);
                        //使用bytes构建一个新的输出字符串
                        icon = new ImageIcon(bytes);
                        imgLabel = new JLabel();
                        imgLabel.setIcon(icon);
                       centerPane.add(imgLabel);


                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null,"IO操作异常");
                    }
                }
            }
        }


        // 选择文件
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
