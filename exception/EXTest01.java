package exception;

/**
 * 异常
 * 1.定义：异常即程序运行过程中出现的不正常事件
 * 2.说明：java中使用“类”模拟异常，当异常事件发生时，jvm会为该类型的异常创建一个对象
 * 3.作用：程序发生异常事件后输出详细信息，程序员可以通过这些信息对程序进行处理使程序更加健壮
* */

public class EXTest01 {

    public static void main(String[] args){
        int a = 12;
        int b = 0;
        /* 因为除法运算分母不能为0，因此程序运行过程中会会抛出ArithmeticException运算异常
           控制台输出的异常明细如下：
           Exception in thread "main" java.lang.ArithmeticException: / by zero
           at exception.EXTest01.main(EXTest01.java:17)
           解释：在main这个线程中发生了ArithmeticException这个类型的异常，异常明细为：0被整除，
               异常发生的位置为第23行
           注意：在该异常发生时java创建了一个ArithmeticException类型的对象
           */
        int c = a / b;
        // 该语句不会被执行，因为当运行出现异常时会直接退出JVM
        System.out.println("运算结束");
    }
}
