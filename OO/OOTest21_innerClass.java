package OO;

/**
 * 内部类
 * 1. 作用
 *    - 访问外部类中的私有数据
 * 2. 分类
 * 1.1 静态内部类【不常用】
 *     - 可以等同看做静态变量
 *     - 可以直接访问外部类的静态数据无法直接访问成员数据
 * 1.2 成员内部类【不常用】
 *     - 可以等同看做成员变量
 *     - 成员内部类中不能定义静态属性或静态方法
 *     - 可以访问外部类中的所有数据
 * 1.3 局部内部类*
 *     - 等同于局部变量
 *     - 局部内部类不能使用访问控制权限修饰符public,private...修饰
 *     - 局部内部类中不能有静态声明
 *     - 局部内部类只能访问final类型的变量
 * 1.4 匿名内部类***
 *     - 指没有名字的内部类xxx
 *     - 优点： 少定义一个类
 *     - 缺点： 无法重复使用
 * */
public class OOTest21_innerClass {
    private static String name = "innerClassTest";
    private int type = 12;
    /**
     * 静态内部类
     * - 可以用访问控制权限修饰符public,private...修饰
     */
    static class StaticInnerClass{
        public static void m1(){
            OOTest21_innerClass innerClass = new OOTest21_innerClass();
            // 可直接访问外部类的静态属性
            System.out.println(name);
            // 不能直接访问外部类的成员属性
            System.out.println(innerClass.type);
        }
    }
    /**
     * 成员内部类
     * - 可以直接访问内部类的所有数据
     * - 可以用访问控制权限修饰符public,private...修饰
     */
    class InnerClass02{
//        成员内部类中不能定义静态属性或方法
//        private static String test;
        public void m2(){
            //可以直接访问外部类的所有数据
            System.out.println(name);
            System.out.println(type);
            StaticInnerClass.m1();
        }
    }

    /**
     * 局部内部类
     * - 不能使用访问控制权限修饰符public,private...修饰
     * -  局部内部类只能访问final修饰的变量
     */
    public void m3(){
        final int n1 = 5;

        class InnerClass03{
            // 局部内部类中不能有静态声明
            //public static String var;
            public void m4(){
                System.out.println(n1);
            }
        }

        InnerClass03 innerClass03 = new InnerClass03();
        innerClass03.m4();
    }

    interface CustomerService{
        void logout();
    }

    public static void  t(CustomerService cs){
        cs.logout();
    }



    public static void main(String[] args){
        // 静态内部类通过类名.的方式访问
        StaticInnerClass.m1();
        // 成员内部类访问需要先创建一个外部类的对象，再通过外部类对象创建内部类对象，通过对象访问
        OOTest21_innerClass innerClass = new OOTest21_innerClass();
        InnerClass02 innerClass02 = innerClass.new InnerClass02();
        innerClass02.m2();
        // 局部内部类调用通过调用内部类所在方法直接调用，方法中需编写调用局部内部类的逻辑
        innerClass.m3();

        /**
         * 匿名内部类
         *
         */
        // 因为方法t的入参为一个抽象类，无法创建对象，因此需要先实例化再调用，可以使用匿名内部类实例化
        t(new CustomerService() {
              @Override
              public void logout() {
                  System.out.println("您已成功退出系统！");
              }
          }

        );

    }
}
