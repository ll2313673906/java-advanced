package com.soft1841.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        // 创建一个
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        // 直接输出list对象
        System.out.println(list);
       // 2通过for循环遍历集合
        for (int i = 0,len = list.size(); i<len; i++){
            System.out.print(list.get(i)+ "  ");
            System.out.println();
        }
        // 3 通过Iterator迭代器遍历集合

        // 4 通过Lambda表达式遍历集合
    }
}
