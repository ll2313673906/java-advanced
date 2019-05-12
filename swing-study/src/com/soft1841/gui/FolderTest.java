package com.soft1841.gui;
/**
 * 遍历文件夹
 * @author刘恋
 * 2019.4.1
 */

import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        // 要遍历的路径
        String path = "F:\\360Downloads";
        // 获取其fil对象
        File file = new File(path);
        // 遍历path下的文件和目录，放在file数组中
        File[] fs = file.listFiles();
        // 遍历File数组
        for (File f:fs){
            // 若非目录(即文件）则打印
            if (!f.isDirectory())
                System.out.println(f);
        }
    }
}
