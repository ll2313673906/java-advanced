package com.soft1841.io;

import java.io.*;

public class TxtCopy {
    public static void main(String[] args)throws IOException {
        File srcFile = new File("D:/fengzi.jpg");
        File destFile = new File("D:/fengzi副本.jpg");
        Reader in = new FileReader(srcFile);
        char[] chars = new char[(int) srcFile.length()];
        in.read(chars);
        Writer out = new FileWriter(destFile);
        out.write(chars);
        out.close();
        in.close();

    }
}
