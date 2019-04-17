package com.soft1841.thread.jsoup;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * JSoup爬虫练习
 * @author 刘恋
 * 2019.4.18
 */

public class JsoupDemo {
    public static void main(String[] args) throws Exception {
        //1、指定目标页面连接
        String url = "https://www.jianshu.com/u/951f5b10854b";
        //2、建立与目标页面的连接
        Connection connection = Jsoup.connect(url);
        //3、解析目标页面
        Document document = connection.get();
        //4、获取页面中所有的class为content的元素
        Elements elements = document.getElementsByClass("content");
        System.out.println(elements.size());
        for (Element element : elements) {
            //取出div的子元素div->a
            Element link = element.child(0);
            //得到a标记的文字内容
            String titleString = link.text();
            System.out.println(titleString);
        }
    }
}
