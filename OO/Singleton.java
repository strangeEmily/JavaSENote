package OO; /**
 *  单例模式的要领
 * 1 构造方法私有化
 * 2 对外提供一个公开的，静态的获取当前类型对象的方法
 * 3 提供一个当前类型的静态变量
 * 单例模式的缺点
 * - 单例模式的类无法被继承，原因是构造方法为私有方法无法被子类调用
 * */
//实现一个单例模式的类
/**
 * 懒汉式单例 - 在用到对象时才创建
 * */
class Singleton1{
//  静态变量
    private static Singleton1 s;
//  构造方法私有化
    private Singleton1(){
    }

//  对外提供一个获取Singleton对象的静态方法
//  使用静态方法的原因-静态方法在类加载时加载，存放在方法区，所有对象共用一份
    public static Singleton1 getSingleton1(){
//        if判断的作用是为了保证Singleton对象只被创建一次
        if (s == null){
            Singleton1 s = new Singleton1();
        }
        return s;
    }

}

/**
 * 饿汉式单例 - 在类加载阶段就创建了对象
 * */
class Singleton2{
//    静态变量
    private static Singleton2 s = new Singleton2();

//    构造方法私有化
    private Singleton2(){

    }

//    对外公开一个获取当前类型对象的静态方法
    public static Singleton2 getSingleton2(){
        return s;
    }
}
