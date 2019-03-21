package com.soft1841.map;

import java.util.Calendar;
import java.util.Date;
import java.util.zip.DataFormatException;

public class ClendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //获取年月日，天，小时，分钟，秒
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("当前的时间为：" + year + "_" + month+"_" + day + "_" +hour + "_" +minute + "_" + second);
        Date date = new Date();
        Long time = calendar.getTimeInMillis();
        System.out.println("当前的时间为:" + date);
        System.out.println("当前的毫秒数：" + time);


    }
}
