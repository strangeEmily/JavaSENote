package OO;

/**
 * 1. 静态方法
 * 1.1 静态方法的特点： static修饰的方法叫做静态方法
 * 1.2 静态方法的使用场景：一般情况下工具类中的方法大部分都是静态方法
 * 1.3 静态方法的优点：不用创建对象也能直接访问该方法，比如Math这个工具类中的abs[绝对值]方法，可以直接通过类名.即Math.abs的方式访问
 * 2. main方法被定义为static的原因
 *    - 可以直接通过类名.main()的方式调用，无需创建对象
 * 3. 成员方法
 *    - 成员方法的优点是可以直接访问类体中的成员变量
 *
* */
public class OOTest06_Static02 {

    public static int j = 1;
    private int i;
    //静态方法
    //可以使用类名.的方式调用
    //静态方法中不能直接访问非静态数据
    //静态方法中不能使用this关键字
    public static void method01(){
        OOTest06_Static02 test = new OOTest06_Static02();
        //静态方法访问成员变量  必须先new一个对象  通过引用.的方式访问，
        // 程序在执行过程中会根据new出来的对象名找到类名再通过类名.的方式访问,执行时实际上不需要对象
        System.out.println(test.i);

        /**
         * 注意：
         * 以下示例中，调用test.j会成功执行而调用test.i会报空指针异常，原因是：
         *  -j是静态变量，是通过类名.的方式访问的，所以test.j在执行时实际是通过test找到类OOTest06_Static02，执行OOTest06_Static02.j,
         *   因此test = null并无影响
         *  - i是成员变量，成员变量是通过引用.的方式访问的，因此当test为null时会报空指针异常
        * */
        test = null;
        System.out.println(test.j);
        System.out.println(test.i);

    }
    //成员方法
    public void method02(){
      System.out.println(i);
    }

    public static  void main(String[] args){
       OOTest06_Static02.method01();
    }

}
