package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * finally语句块
 * 1. 应用：
 *    - finally语句块可以直接和try语句块连用  eg：try...finally...    try...catch...finally
 * 2. 特点
 *    - finally语句块一定会被执行
 * 3. 作用：
 *    - 因为finally语句块一定会被执行，因此常在该语句块中写一些释放资源的逻辑以确保资源被释放
 * 4. final,finalize,finally关键字的区别
 *    - final: 关键字，修饰的类无法被继承，修饰的方法无法被重写，修饰的变量一旦赋值无法更改，经常和static关键字连用来修饰常量
 *    - finalize：object类中的方法，在垃圾回收器回收垃圾前会被调用
 *    - finally：和try关键字连用
 * */
public class EXTest04_Finally {
    public static void main(String[] args){
        FileInputStream f = null;
        try{
            f = new FileInputStream("C:/test.txt");
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if (f != null){
                try {
                    f.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            System.out.println("资源已经被释放");
        }
    }
}

