package com.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * NBA历史十大巨星
 * author 刘恋
 * 2019.3.18
 */

public class NBA {
    public static void main(String[] args) {
        List<Star> list = new ArrayList<>();
        list.add(new Star("乔丹","飞人/神", 30.1,6.2,5.3));
        list.add(new Star("拉塞尔","指环王",15.1,22.5,4.3));
        list.add(new Star("贾巴尔","天钩",24.6,11.2,3.6));
        list.add(new Star("张伯伦","篮球皇帝",30.1,22.9,4.4));
        list.add(new Star("约翰逊","魔术师",19.5,7.2,11.2));
        list.add(new Star("博德","大鸟",24.3,10.0,6.3));
        list.add(new Star("邓肯","石佛",20.7,11.4,3.2));
        list.add(new Star("科比","黑曼巴",25.1,5.3,4.7));
        list.add(new Star("奥尼尔","大鲨鱼",23.7,10.9,2.5));
        list.add(new Star("奥拉朱旺","大梦",21.8,11.1,2.5));
        int length = list.size();
        Random random = new Random();
        System.out.println("————NBA历史十大巨星————");
    System.out.println("球员  绰号  得分  篮板  助攻");
    for (int i = 0; i<length; i++){
        System.out.println(list.get(i).getName() + "   "
                + list.get(i).getNickname() + "   "+
                list.get(i).getScore() + "    " +
                list.get(i).getRebounds() + "    " +
                list.get(i).getAssists());
    }
    }
}
