package basic;

public class MethodTest01 {

    /**
     * 1.方法的本质：一个可以被重复使用并且完成某个特定功能的代码片段
     * 2.方法被定义在类体中，一个类中可以有多个方法
     * 3.方法体中的代码自上而下依次执行
     * 4.方法的定义规则为：
     *   [方法修饰符列表] 方法的返回值类型  方法名（形式参数列表）{
     *       java语句;
     *   }
     *   4.1 方法修饰符列表是可选项，现在暂时先写成 public static
     *       - static方法调用需要用到类名.方法名 的方式调用,同一个类中的方法可以直接调用
     *   4.2 方法的返回值可以是任意数据类型（基本数据类型或引用数据类型）,若该方法没有返回值则类型写：void
     *   4.3 方法名只要是合法的标识符即可,命名规则为首字母小写,其余单词首字母大写
     *   4.5 方法的形式参数列表可以为空,如果有多个参数，参数之间用“逗号”隔开
     *   4.6 若该方法的返回值不为void，那么在方法体中必须使用return语句返回数据，return语句一旦执行，方法结束
     *
     * 5. 方法重载
     *    - 同一个类中方法名相同，参数不同
     * 5.1 方法重载的优点：
     *     1. 使用相同的方法名，方便记忆和调用
     *     2. 比较美观
     * 5.2 什么时候会发生方法重载
     *     1. 同一个类中
     *     2. 方法名相同
     *     3. 参数列表不同[参数数据类型不同/参数个数不同/参数顺序不同]
     *  *方法重载和方法的返回值类型无关，和修饰符列表无关，和参数有关
     *
     *  6. 方法在调用时才会被分配内存空间,JVM内存中有一块内存是栈内存，方法在开始执行时入栈分配内存，在执行结束后出栈
     *     释放内存
     *
     *  7. 方法的递归
     *  7.1 方法的递归就是指方法调用自身
     *  7.2 递归的方法必须要有返回值，否则会陷入死循环造成栈溢出
     *  7.3 一般不推荐使用递归，因为每调用一次方法都要分配栈帧，性能比较低且占用内存空间
  * */

//   练习：实现一个简单的加和

//    main方法 - 入口
    public static void  main(String[] args){
        System.out.println(sumInt(10,50));
        System.out.println(sum(5));
        System.out.println(factorial(5));
        System.out.println(factorialFor(5));
    }
//    方法定义
    public static int sumInt(int a, int b){
        int c = a + b;
        return c;
    }

//    递归Test01 - 使用递归的方法实现1-n的求和
    public static int sum(int n){
        if (n == 1){
            return 1;
        }else {
            return n + sum( n - 1);
        }
    }

//   递归Test02 - 使用递归的方法实现n的阶乘
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return n * factorial( n - 1 );
        }
    }
//  使用for循环实现n的阶乘
    public static int factorialFor(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
