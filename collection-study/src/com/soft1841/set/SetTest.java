package com.soft1841.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set接口基础程序
 */

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);
        String s1 = new String("A");
        String s2 = new String("B");
        String s3 = new String("C");
        String s4 = new String("D");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.print(set);
        //用for循环遍历set集合

        System.out.println("用for循环遍历set集合");
       // 用Iterator迭代器遍历set集合
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "   ");

        }
        System.out.println("用Iterator迭代器遍历set集合");
        // 用Lambda表达式遍历set集合

    }
}
