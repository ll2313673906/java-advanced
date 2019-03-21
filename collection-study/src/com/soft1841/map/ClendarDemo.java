package com.soft1841.map;
/**
 * Calendar类练习
 * @author刘恋
 * 2019.3.22
 */

import java.util.Calendar;
import java.util.Date;
import java.util.zip.DataFormatException;

public class ClendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();  //创建Canlendar对象
        //获取年月日，天，小时，分钟，秒
        int year = calendar.get(Calendar.YEAR);       //获取年
        int month = calendar.get(Calendar.MONTH);    //获取月份，0表示1月份
        int day = calendar.get(Calendar.DAY_OF_MONTH);//获取日期
        int hour = calendar.get(Calendar.HOUR_OF_DAY);// 获取小时
        int minute = calendar.get(Calendar.MINUTE);   // 获取分钟
        int second = calendar.get(Calendar.SECOND);   // 获取秒
        System.out.println("当前的时间为：" + year + "_" + month+"_" + day + "_" +hour + "_" +minute + "_" + second);
        Date date = new Date();                // 将Calendar对象转换为Date对象
        Long time = calendar.getTimeInMillis(); //获取当前毫秒数
        System.out.println("当前的时间为:" + date);
        System.out.println("当前的毫秒数：" + time);


    }
}
