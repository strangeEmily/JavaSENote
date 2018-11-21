package io;

import java.io.*;
/**
* FileInputStream的常用方法
 * read();          文件读取
 * read(Byte[] b);  文件读取
 * close();         关闭流
 * available();     返回流中剩余未读取的估计字节数
 * skip();          跳过n个字节不读取
* */

public class IOTest02_FileInputStream {
    public static void main(String[] args){
        FileInputStream fis = null;
        String path = "C:/Users/lil/Desktop/io_test.txt";
        try{
            fis = new FileInputStream(path);

            // 开始读取[以字节的方式读取]，若返回值为-1则表示文件已读取到末尾
            int temp = 0;
           /*
              使用read()方法读取文件
              以该方法读取文件需要频繁访问磁盘，效率较低且对磁盘伤害较大，不建议使用
            */
//            while ((temp = fis.read()) != -1){
//                System.out.println(temp);
//            }
            /*
            使用read(byte[] b)方法读取文件
             */
            byte[] b = new byte[3]; //定义一个可存储字节数为3的数组，代表每次读取文件最多可读取3个字节
            int temp2 = 0;
            // fis.read(b))方法返回的是读取到的字节数
            while ((temp2 = fis.read(b)) != -1){
                System.out.println(new String(b,0,temp2));
                //skip(2);读取时跳过两个字节
                fis.skip(2);
                // fis.available()返回流中剩余未读取的估计字节数
                System.out.println(fis.available());
            }


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            // 在finally语句块中执行流的释放操作，保证释放操作一定会被执行
            if (fis != null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
