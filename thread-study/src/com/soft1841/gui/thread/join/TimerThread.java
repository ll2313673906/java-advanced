package com.soft1841.gui.thread.join;

import javax.swing.*;

public class TimerThread extends Thread {
    private Thread timeTest2Thread;

    public void setTimeTest2Thread(
            Thread timeTest2Thread){
        this.timeTest2Thread = timeTest2Thread;
    }
    private JLabel numberLabel;
    public void setNumberLabel(JLabel numberLabel){
        this.numberLabel = numberLabel;
    }
    @Override
    public void run() {
        numberLabel.setText("   ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            try {
                timeTest2Thread.join();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        for (int i = 10;i>0;i--){
            numberLabel.setText(String.valueOf(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numberLabel.setText(" 时间到 ");
    }
}


