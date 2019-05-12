package com.soft1841.gui.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 在主程序中定义个字符串，通过三种方式将该字符串持久化到文件中
 * @author 刘恋
 *
 */

public class OutputEx  {
    public static void main(String[] args) throws IOException {
        String str = "I Love Java";
        File file1 = new File("E:\\result.txt");
        if (!file1 .exists()){
            file1.createNewFile();
        }
        OutputStream outputStream = new FileOutputStream(file1);
        outputStream.write(str.getBytes());
        outputStream.close();
    }
}
