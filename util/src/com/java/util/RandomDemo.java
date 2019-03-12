package com.java.util;

import java.util.Random;

/**
 * 随机数
 * @author liulian
 * 2019.3.12
 */

public class RandomDemo {
    public static void main(String[] args) {
        //随机生成一个5以内的随机数包括5
        Random random = new Random();
        int num = random.nextInt(6);//填5不包括5
        System.out.println(num);
    }
}
