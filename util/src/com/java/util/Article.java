package com.java.util;

import java.util.Date;

/**
 * List编程练习
 * author 刘恋
 * 2019.3.18
 */
public class Article {
    private Integer id;
    private String title;
    private String author;
    private Date time;

    public Article(Integer id, String title, String author, Date time) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getTime() {
        return time;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", time=" + time +
                '}';
    }
}