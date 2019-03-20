package com.soft1841.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;

/**
 * @author 刘恋
 * 2019.3.20
 */

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("小红帽",1802343331));
        list.add(new Student("爱丽丝",1802343330));
        list.add(new Student("疯帽子",1802343329));
        list.add(new Student("爱德华",1802343335));

        list.add(new Student("爱尔莎",1802343334));
        Collections.sort(list);
        for (Student student: list){
            System.out.println("姓名："+ student.getName() + ",\t\t" + "学号：" + student.getId());
        }
    }
}
