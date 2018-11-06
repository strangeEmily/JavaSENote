package OO;

/**
 * 接口
 * 1. 解释：
 *   - 接口也是一种引用数据类型，可以等同看做类
 *   - 接口其实是一种特殊的抽象类，特殊之处在于接口中的方法全部都是抽象方法
 * 2. 语法：
 *   - [修饰符] interface 接口名 {}
 * 3. 使用规则
 *   - 3.1 接口中只能出现 常量 和 抽象方法
 *   - 3.2 接口中没有构造方法，也无法被实例化
 *   - 3.3 接口和接口之间可以实现多继承
 *   - 3.4 一个类可以实现多个接口 （这里的实现可以看成“继承”）
 *   - 3.5 一个非抽象的类实现接口必须将接口中的所有方法进行重写
* */
public interface OOTest16_Interface{

    // 常量
    public static final String NAME = "Emily";
    public static final Integer AGE = 18;
    // 因为接口中只能定义常量  常量都是用public static final修饰的  所以修饰符可省略
    Double PI = 3.14;
}

interface Interface01{
   void m01();
}

interface Interface02{
  void m02();
}
// 接口直接可以实现多继承
interface Inteface03 extends Interface01,Interface02{

}

// 一个类可以实现多个接口
class Interface_test implements Interface01,Interface02{
    // 非抽象类实现接口时必须重写接口中的所有方法
    public void m01(){

    }

    public void m02(){

    }
}