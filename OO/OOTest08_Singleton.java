package OO;

/**
 * 单例模式初步
 * 1.解释
 * - 单例模式是设计模式的一种，设计模式指一种重复利用的解决方案，单例模式是23种设计模式中最简单的一种
 * 2. 解决的问题
 * - 为了保证Java虚拟机JVM中某一个类型的java对象永远只有一个
 * 3. 作用
 * - 节省内存开销
 * 4. 单例模式的要领
 * 4.1 构造方法私有化
 * 4.2 对外提供一个公开的，静态的获取当前类型对象的方法
 * 4.3 提供一个当前类型的静态变量
 * 5. 单例模式的分类
 * 5.1 饿汉式单例 - 在类加载阶段就创建了对象
 * 5.2 懒汉式单例 - 在用到对象时才创建
 * */
public class OOTest08_Singleton {
//  调用单例模式的类
    public static void main(String[] args){
       Singleton1 S1 = Singleton1.getSingleton1();
       Singleton1 S2 = Singleton1.getSingleton1();
       Singleton1 S3 = Singleton1.getSingleton1();

//     引用数据类型用 == 判断是否相等，实际上是对比的内存地址，如果判断结果为True，则说明指向的是同一块内存地址
       System.out.println(S1 == S2);
       System.out.println(S2 == S3);
       System.out.println(S1 == S3);
    }
}