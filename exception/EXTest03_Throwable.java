package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Throwable类中的常用方法[Throwable是Exception类的父类]
 * 1. getMessage（）方法
 *    - 获取异常描述信息
 *
 * 2. printStackTrace （）方法 【常用,更有利于代码调试】
 *    - 打印异常堆栈信息
 * */
public class EXTest03_Throwable {
    public static void main(String[] args){
        try {
            FileInputStream file = new FileInputStream("C:/test.txt");
        }catch (FileNotFoundException e){
            String msg = e.getMessage();
            System.out.println("异常信息：" + msg);
            System.out.println("堆栈信息：");
            e.printStackTrace();
        }
    }
}
