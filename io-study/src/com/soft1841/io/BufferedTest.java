package com.soft1841.io;

import java.io.*;

/**
 * 带缓冲的输入输出流（二）
 * @author 刘恋
 * 2019.4.4
 */

public class BufferedTest  {
    public static void main(String[] args) {
        // 定义字符串数组
        String content[] = {"你不喜欢我，","我一点也不介意。","因为我活下来，","并不是为了取悦你"};
        // 创建安文件对象
        File file = new File("word.txt");
        try {
            // 创建FileWriter类对象
            FileWriter fw = new FileWriter(file);
            // 创建BufferedWriter 类对象
            BufferedWriter bufw = new BufferedWriter(fw);
            for (int k = 0; k < content.length;k++){
                bufw.write(content[k]);//将字符串数组元素写入到磁盘文件中
                bufw.newLine(); //将数组中的单个元素以但行的形式写入文件
            }
            // 关闭流
            bufw.close();
            fw.close();


        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i = 0;
            while ((s = bufr.readLine()) != null){
                i++;
                System.out.println("第" + i + "行：" + s);
            }
            bufr.close();
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
