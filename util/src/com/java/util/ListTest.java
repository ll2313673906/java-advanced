package com.java.util;
import java.util.ArrayList;
import java.util.List;


/**
 * List接口的练习
 * author 刘恋
 * 2019.3.18
 *
 */
public class ListTest {
    public static void main(String[] args) {
        //创建一个List接口的对象，元素为String类型
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random() * list.size());
        System.out.println("随机或取集合的元素" + list.get(i));
        list.remove(2);
        System.out.println("将索引是'2'的元素从集合移除后，集合中的元素是：");


        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j ));

        }
    }
}



