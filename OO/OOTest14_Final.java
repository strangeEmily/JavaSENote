package OO;

/**
 * final关键字
 * - final修饰的类无法被继承
 * - final修饰的方法无法被重写
 * - final修饰的局部变量一旦赋值，无法更改
 * - final修饰的成员变量必须手动初始化，且不能修改【final修饰的成员变量一般和static关键字连用作为常量使用】
 * - final修饰的引用数据类型不可更改，即内存地址指向不可修改，但该对象的属性可以更改
* */
public class OOTest14_Final {
   public static final String NAME = "Emily";

   public static void main(String[] args){
       final int i = 1;
       System.out.println(i);
       // final 修饰的局部变量不能重新赋值
//       i = 3;
   }

}

final class Test01{

}
//final修饰的类不能被继承
//final修饰的类不能被继承
//class Test02 extends Test01{
class Test02{
   public final void m1(){

  }
}

class Test03 extends Test02{
    final int i = 1;
//    final修饰的方法不能被重写
//    public void m1(){}
}
