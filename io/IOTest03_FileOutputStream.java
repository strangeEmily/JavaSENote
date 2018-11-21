package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream 文件字节输出流
 *  - 将计算机内存中的数据写入硬盘文件
 *
 * */
public class IOTest03_FileOutputStream {
    public static void main(String[] args){
        FileOutputStream fos = null;
        String path = "C:/Users/lil/Desktop/io_test.txt";

        try {
            //append参数为true指代写入时以追加的方式写入
            fos = new FileOutputStream(path,true);

            // 开始写入
            String msg = "myTest";

            byte[] b = msg.getBytes();//将字符串转换成数组

            fos.write(b);

            //刷新操作，在写入操作最后为了保证数据完全写入硬盘，通常使用此操作强制写入
            fos.flush();

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fos != null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
