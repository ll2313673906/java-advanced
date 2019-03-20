package com.soft1841.list;

import java.util.*;

/**
 * Comparable接口使用
 * @author 刘恋
 * 2019.3.20
 */

public class StudentTest {
    public static void main(String[] args) {
        //创建List对象，存入Student对象
        List<Student> list = new ArrayList<>();
        list.add(new Student("小红帽", 1802343331));
        list.add(new Student("爱丽丝", 1802343330));
        list.add(new Student("疯帽子", 1802343329));
        list.add(new Student("爱德华", 1802343335));

        list.add(new Student("爱尔莎", 1802343334));
        //调用Collections的sort方法，会自动调用之前写的compareTo方法进行排序
        Collections.sort(list);
        for (Student student:list){
            System.out.println("姓名：" + student.getName() + "\t\t\t学号：" + student.getId());
        }

    }
}