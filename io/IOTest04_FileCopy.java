package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest04_FileCopy {
    public static void main(String[] args) throws Exception{
        // 创建输入流
        FileInputStream fis = new FileInputStream("C:/Users/lil/Desktop/io_test.txt");
        // 创建输出流
        FileOutputStream fos = new FileOutputStream("C:/Users/lil/Desktop/io_test2.txt");

        // 边读边写
        byte[] b = new byte[1024];
        int temp = 0;
        while ((temp = fis.read(b)) != -1){
            fos.write(b, 0, temp);
        }

        // 刷新
        fos.flush();

        // 关闭流
        fis.close();
        fos.close();

    }
}
