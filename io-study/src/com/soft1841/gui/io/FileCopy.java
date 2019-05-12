package com.soft1841.gui.io;
/**
 * 文件输入输出流
 * @author刘恋
 * 2019.3.26
 */

import java.io.*;

public class FileCopy {
    public static void main(String[] args)throws IOException {
        // 指定源文件
        File srcFile = new File("D:/io.mp4");
        // 指定目标文件
        File destFile = new File("E:/io.mp4");
        // 创建一个字节数组，大小为源文件长度，长度转换为int
        byte[] bytes = new byte[(int) srcFile.length()];
        // 创建字节输入流
        InputStream in = new FileInputStream(srcFile);
        // 将原文件读入输入字节数组
        in.read(bytes);
        // 输出字节数组的长度
        System.out.println(bytes.length/1024+"k");
        // 创建字节输出流
        OutputStream out = new FileOutputStream(destFile);
        // 将字节数组写入目标文件
        out.write(bytes);
        // 关闭输入输出流
        in.close();
        out.close();


    }
}
