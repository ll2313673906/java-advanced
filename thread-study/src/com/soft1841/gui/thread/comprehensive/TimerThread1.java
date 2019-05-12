package com.soft1841.gui.thread.comprehensive;

import javax.swing.*;

/**
 * 桌面倒计时
 * author刘恋
 */
public class TimerThread1 extends Thread{
    private Thread timerTest2Thread;
    private JLabel timerLabel;
    public void setTimerTestThread(Thread timerTest2Thread){
        this.timerTest2Thread = timerTest2Thread;
    }
    public void setTimerLabel(JLabel timerLabel){
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        timerLabel.setText(" ");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
            try{
                timerTest2Thread.join();
            }catch (InterruptedException e1){
                e1.printStackTrace();
            }
        }
        for (int i = 10; i > 0; i--){
            timerLabel.setText(String.valueOf(i));
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        timerLabel.setText("时间到");
    }
}
