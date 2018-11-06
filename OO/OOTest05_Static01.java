package OO;

/**
 * 静态语句块和实例语句块在程序中的执行
 * 结论
 * 1. 静态语句块在类加载阶段就会被执行
 * 2. 构造方法是在new的时候被调用的
 * 3. 当new一个对象即调用构造方法时会发现实例语句块被执行且在构造方法调用前被执行
 * 4. 构造方法每调用一次，实例语句块被执行一次，而静态语句块只在类加载时被执行，无论构造方法被调用多少次都只执行一次
 *
 * 应用场景
 * 1. 要求在类加载时记录日志 - 将日志内容放在静态语句块中
 * 2. 要求在创建对象时记录日志 - 将日志内容放在实例语句块中
* */
public class OOTest05_Static01 {
    //静态语句块
    static {
        System.out.println("A");
    }
    //实例语句块
    {
        System.out.println("1");
    }
    {
        System.out.println("1");
    }
    {
        System.out.println("1");
    }

    public OOTest05_Static01(){
        System.out.println("构造方法被调用");
    }

    public static void main(String[] args){
        //此时构造方法被调用
        new OOTest05_Static01();

        new OOTest05_Static01();

    }

}
