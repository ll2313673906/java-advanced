package com.soft1841.list;

/**
 * @author 刘恋
 * 2019.3.20
 */

public class Student implements Comparable<Student> {
    private String name;
    private Integer id;

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student student) {
        return this.getId() - student.getId();
    }
}
