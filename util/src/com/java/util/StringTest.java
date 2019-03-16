package com.java.util;

/**
 * String ，StringBuffer，StringBuilder的比较
 * author 刘恋
 * 2019.3.16
 */

public class StringTest {
    //定义次数
    private static int time = 50000;
    public static void main(String[] args) {
      testString();
      testStringBuffer();
      testStringBuilder();

    }
    public  static void testString(){
        String s = "";
        //获取以毫秒为单位的当前开始时间
        Long begin = System.currentTimeMillis();
        //调用50000次String的拼接，每次都会生成新的String对象！
        for (int i = 0;i < time; i++){
            s += "java";
        }
        //获取以毫秒为单位的当前结束时间
        Long over = System.currentTimeMillis();
        //求出实际耗时
        System.out.println("操作String类型使用的时间为：" + (over - begin) + "毫秒");

    }
    public static void testStringBuffer(){
        StringBuffer stringBuffer = new StringBuffer();
        Long begin = System.currentTimeMillis();
        for (int i = 0; i < time; i++){
            stringBuffer.append("java");
        }
        Long over = System.currentTimeMillis();
        System.out.println("操作StringBuffer类型使用的时间为：" + (over - begin ) + "毫秒");

    }
    public static void testStringBuilder(){
        StringBuilder stringBuilder = new StringBuilder();
        Long begin = System.currentTimeMillis();
        for (int i = 0 ; i < time; i++){
            stringBuilder.append("java");
        }
        Long over = System.currentTimeMillis();
        System.out.println("操作StringBuilder类型使用的时间为：" + (over - begin) + "毫秒");
    }
}
