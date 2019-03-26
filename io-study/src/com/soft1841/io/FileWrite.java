package com.soft1841.io;
/**
 * 控制台输入写入文件
 * @author刘恋
 * 2019.3.26
 */

import java.io.*;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String inputString = scanner.nextLine();
        char[] chars = inputString.toCharArray();
        File destFile = new File("E:/result.txt");
        Writer out = new FileWriter(destFile);
        out.write(chars);
        out.close();


    }
}
