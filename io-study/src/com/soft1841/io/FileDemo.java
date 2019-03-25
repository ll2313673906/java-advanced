package com.soft1841.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args)throws IOException {
        File file = new File("E:/README.md");
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
