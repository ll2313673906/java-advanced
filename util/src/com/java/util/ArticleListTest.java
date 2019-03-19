package com.java.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * List编程练习
 * author 刘恋
 * 2019.3.18
 */
public class ArticleListTest {
    public ArticleListTest() {
    }

    public static void main(String[] args) throws ParseException {
        List<Article> list = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        list.add(new Article(1, "说给昨天失败的你们。", "然小样", simpleDateFormat.parse("2019-03-12 22:43:52")));
        list.add(new Article(2, "世界不曾亏那些努力过的人", "莉莉", simpleDateFormat.parse("2019-03-13 20:13:52")));
        list.add(new Article(3, "因为怕输，难道就不努力了么", "邝正聪", simpleDateFormat.parse("2019-02-10 21:23:22")));
        list.add(new Article(4,"从我的全世界路过的你。","李茂",simpleDateFormat.parse("2019-3-18 22:32:21")));
        System.out.println("id    标题                      作者               时间");
        Iterator iterator = list.iterator();

        while(iterator.hasNext()) {
            Article article = (Article)iterator.next();
            String result = timeCal(simpleDateFormat.format(article.getTime()));
            System.out.println(article.getId() + "    " + article.getTitle().substring(0, 10) + "...      " + article.getAuthor() + "           " + result);
        }

    }

    private static String timeCal(String time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long diff = 0L;

        try {
            Date d1 = format.parse(time);
            Date now = new Date();
            diff = now.getTime() - d1.getTime();
        } catch (ParseException var13) {
            var13.printStackTrace();
        }

        long seconds = diff / 1000L;
        long minutes = seconds / 60L;
        long hours = minutes / 60L;
        long days = hours / 24L;
        if (seconds < 60L) {
            return "刚刚";
        } else if (minutes < 60L) {
            return minutes + "分钟前";
        } else {
            return hours < 24L ? hours + "小时前" : days + "天前";
        }
    }
}
