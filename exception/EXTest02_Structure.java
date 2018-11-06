package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * -----------------------------------------------------------------------------
 * 1.异常的结构/继承关系
 * Object
 * [继承]
 * Throwable 【所有的异常都是可抛出的】
 * [继承]
 * Error
 * - java程序在运行过程中若出现错误，只能直接退出JVM，无法处理 例如：StackOverflowError
 * Exception
 * - Exception是可以处理的，如果未被处理则直接退出JVM
 *   分类：
 *   1.1 编译时异常【发生机率较高】
 *     - 所有直接继承Exception的异常都是编译时异常
 *     - 所有编译时异常要求程序员在编写程序阶段进行处理否则编译无法通过，处理方式有两种
 *       1.1 捕捉：try...catch...
 *       1.2 声明抛出：throws关键字
 *   1.2 运行时异常：RuntimeException
 *     - 所有继承RuntimeException的异常都属于运行时异常
 *     - 运行时异常在程序编写阶段无需进行处理
 * -----------------------------------------------------------------------------
 * 2. 异常处理的两种方式
 *    2.1  声明抛出   throws
 *         - 在方法声明的位置上使用throws关键字向上抛出异常
 *         - 异常并未被处理，谁调用抛给谁
 *    2.2  捕捉      try...catch...
 *         - 语法
 *           try{
 *
 *               可能出现异常的代码
 *
 *           }catch(异常类型1 变量1){
 *
 *               处理异常的代码
 *
 *           }catch（异常类型2 变量2）{
 *
 *               处理异常的代码
 *
 *           }
 *           ...
 *         - 注意
 *           2.2.1 catch语句块可以写多个
 *           2.2.2 catch语句块只能从小异常类型到大异常类型进行捕捉
 *           2.2.3 catch一旦执行则try...catch...语句块退出  其他catch不再继续执行
 *
 * -----------------------------------------------------------------------------
 * */
public class EXTest02_Structure {
    public static void main(String[] args){
        EXTest02_Structure test = new EXTest02_Structure();
           // 异常在fileReadCall()方法中被捕捉，因此其他方法可以直接调用fileReadCall()方法而不受异常影响
            test.fileReadCall();
            System.out.println("执行结束");
    }

    /**
     * 捕捉异常
     * */
    private void fileReadCall(){
        // 因为fileRead()方法使用了throws关键字向上抛出异常，所以该异常未被处理仍然存在被抛给了当前方法
        try {
            fileRead();
            /*
            异常捕捉的执行原理
            - 程序在执行fileRead()时发生了一个FileNotFoundException类型的异常事件，此时JVM创建出一个该类型的对象
            - 执行catch语句块时虚拟机调用catch方法将创建出的异常对象赋值给catch中定义的对象fe
            * */
        }catch (FileNotFoundException fe){
            //FileNotFoundException类将object类的toString方法进行了重写，所以fe对象会被转换成字符串打印到控制台
            System.out.println(fe);
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("IOException");
        }
    }

    /**
     * 使用throws关键字在方法声明中向上抛出异常
    * */
    //方法所抛异常类型可以是FileInputStream类所抛异常的同类型或任意父类型
    private void fileRead() throws IOException{
        // FileInputStream类的构造方法在声明时使用了 throws关键字抛异常，因此在创建对象时也要对所属方法抛异常或进行异常捕捉，
        // 否则编译无法通过
        FileInputStream file = new FileInputStream("C:/test.txt");
    }
}
