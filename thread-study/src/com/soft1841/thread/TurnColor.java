package com.soft1841.thread;

import javax.swing.*;
import java.awt.*;

/**
 * 模拟交通灯信号线程
 * @author 刘恋
 * 2019.4.15
 *
 */

public class TurnColor extends Thread {
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        while (true) { // 线程始终处于被启用状态
            try {
                Thread.sleep(5000); // 线程休眠5秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Yellow.png"))); // 黄灯
            try {
                Thread.sleep(2000); // 线程休眠2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Red.png"))); // 红灯
            try {
                Thread.sleep(8000); // 线程休眠8秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Green.png"))); // 绿灯
        }
    }
}
