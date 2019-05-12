package com.soft1841.gui.map;

import java.util.*;

/**
 * @author 刘恋
 * 2019.3.19
 */

public class StudentMapTest {
    public static void main(String[] args) {

            //创建list1，并加入数据
            List<Student> list1 = new ArrayList<>();
            list1.add(new Student(1802343320,"杨晶"));
            list1.add(new Student(1802343301,"白建坤"));
            //创建list2，并加入数据
            List<Student> list2 = new ArrayList<>();
            list2.add(new Student(1802343329,"黄屏"));
            list2.add(new Student(1802343331,"刘恋"));
            //创建Map对象，存入数据
            Map<String,List<Student>> list3 = new HashMap<>();
            list3.put("男生",list1);
            list3.put("女生",list2);
            //用Iterator遍历并输出
            System.out.println("按性别输出集合的结果：");
            Iterator<Map.Entry<String,List<Student>>> iterator = list3.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String ,List<Student>> entry = iterator.next();
                System.out.println(entry.getKey());
                Iterator<Student> listIterator = entry.getValue().iterator();
                while (listIterator.hasNext()){
                    System.out.println(listIterator.next());
                }
            }

        }

    }


