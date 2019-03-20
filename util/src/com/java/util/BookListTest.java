package com.java.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * author刘恋
 * 2019.3.19
 */

public class BookListTest {
    public static void main(String[] args) {

        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"海的女儿",23.4));
        list.add(new Book(2,"冰雪奇缘",34.2));
        list.add(new Book(3,"格林童话",48.4));
        System.out.println(list);
        System.out.println("——————图书信息——————");
        System.out.println("id\t\t\t书名\t\t\t价格");
        // 用for循环遍历list集合
        System.out.println("用for循环遍历list集合");
        for (int i = 0,len = list.size();i < len; i++){
            System.out.print(list.get(i).getId() + "\t\t\t" + list.get(i).getName() + "\t\t\t" + list.get(i).getPrice());
            System.out.println();
        }

        //用Iterator迭代器遍历集合
        System.out.println("用Iterator迭代器遍历集合");
        Iterator<Book> iterator = list.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getId() + "\t\t\t" + book.getName() + "\t\t\t" + book.getPrice());
        }
        //用Lambda表达式遍历集合
        System.out.println("用Lambda表达式遍历集合\t\t" );
        list.forEach(book -> System.out.println(book.getId() + "\t\t\t" + book.getName() + "\t\t\t" +book.getPrice()));

    }
}
