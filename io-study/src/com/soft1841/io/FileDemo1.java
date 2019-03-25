package com.soft1841.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {

        String time =  new SimpleDateFormat("yyyy_MM_dd").format(new Date().getTime());

        System.out.println(time);
        File path = new File("D:/"+ time);
        if (!path.exists()){
            path.mkdir();
           File file = new File(path + "/" + "hello.txt");
           if (!file.exists()){
               file.createNewFile();
           }

        }
    }
}

