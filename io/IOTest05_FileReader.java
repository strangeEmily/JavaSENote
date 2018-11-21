package io;
import java.io.*;
import java.nio.charset.Charset;

/**
 * FileReader  - 字符输入流
 * - 继承关系： java.io.FileReader ---<继承>--> java.io.InputStreamReader ---<继承>--> java.io.Reader
 *            说明：InputStreamReader 是转换流，作用是将字节输入流转换为字符输入流
 *
 * */
public class IOTest05_FileReader {
    public static void main(String[] args){
        /**
         * FileReader的用法
         * fr.read(c)) - 读取指定数组长度的字符  返回值为读取到的字符数，若返回值为-1则表示未读取到字符
         * */
        FileReader fr = null;
        try {
            fr = new FileReader("C:/Users/lil/Desktop/io_test2.txt");
            char[] c = new char[512];
            int temp = 0;
            while ((temp = fr.read(c)) != -1){
                System.out.println(new String(c, 0, temp));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        /**
         * 中文字符的读取
         * 注意：因为中文字符容易因为编码格式不同造成读取时的乱码因此需要使用InputStreamReader类，在创建对象时使用含有参数
         *      charsetName的构造方法，将待读取文件的编码格式一同传进去
         *      txt文件一般使用ANSI编码格式，该格式在java中可使用GBK指代
         * */
        InputStreamReader isr = null;
        File f = null;
        try {
            f = new File("C:/Users/lil/Desktop/io_test3.txt");
            isr = new InputStreamReader(new FileInputStream(f), "GBK");
            // 开始读取
            char[] c = new char[512]; // 每次读取1KB java中一个字符占用2个字节
            int temp = 0;
            while ((temp = isr.read(c)) != -1){
                String output = new String(c,0,temp);
                System.out.println(Charset.defaultCharset());
                System.out.println(output);
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
