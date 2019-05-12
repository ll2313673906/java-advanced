package com.soft1841.gui.runnable;

/**
 * 实现Runnable接口
 * @author 刘恋
 * 2019.4.8
 */

public class RunnableTest extends Object implements Runnable {
    private int count = 10;

    @Override
    public void run() {
        while (true){
            System.out.print(count + " ");
            if (--count == 0 ){
                break;
            }
        }
    }

    public static void main(String[] args) {
        // 实现Runnable接口
        RunnableTest runnableTest = new RunnableTest();

        Thread thread = new Thread(runnableTest);
        // 启动线程
        thread.start();
    }
}
