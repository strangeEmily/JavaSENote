package OO;

/**
 * 抽象类
 * 1. 如何定义抽象类
 *    - 在class关键字前加 abstract修饰符
 * 2. 抽象类不能被实例化【即无法创建对象】
 * 3. 抽象类有构造方法，构造方法在子类创建对象中会被调用
 * 4. 抽象类中可以定义抽象方法
 *    - 抽象方法定义的语法为：在修饰符列表中加入关键字abstract
 *    - 抽象方法以“,”结束而不是“{}”，抽象方法没有实体
 *    - 抽象方法只能出现在抽象类中【但一个抽象类中并不是一定要有抽象方法】
 * 5. 非抽象类继承抽象类，必须将抽象类中的抽象方法重写。
 * 6. 抽象类的主要作用是被继承，因此不能被final修饰【抽象方法同理】
* */
public class OOTest15_Abstract {

   public static void main(String[] args){
       // 抽象类不能创建对象
//       AbsTest absTest = new AbsTest();
       AbsExtend absExtend = new AbsExtend();
       absExtend.m1();
   }
}

abstract class AbsTest{
    AbsTest(){
        System.out.println("抽象类absTest构造被调用");
    }
// 抽象方法以“;”结束而不是“{}”，抽象方法没有实体
    public abstract void m1();
//    public abstract void m1(){}
}

class AbsExtend extends AbsTest{
    AbsExtend(){
        System.out.println("absExtend构造被调用");
    }

    public void m1(){
        System.out.println("重写抽象类中的抽象方法");
    }
}