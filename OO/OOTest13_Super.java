package OO;

/**
 * super关键字
 * 1.  解释：
 *     1.1 super指代当前对象中的父类型特征
 *     1.2 super并非引用数据类型，存储的不是内存地址
 * 2. 使用场景
*     — 需要在子类中访问父类的属性/方法时
 * 3. 使用范围
 *    - 成员方法 语法：super.
 *    - 构造方法 语法：super(实参)
 * 4. super关键字在构造方法中的使用
 *    - 若子类的构造方法中未使用super关键字，系统会默认调用super（）语句去调用父类的无参构造方法
 *    - super（）的调用只能放在第一行【this（）的调用也只能放在第一行，所以两者不能共存】
 *    - 在构造方法中使用super（实参）调用父类构造方法是为了给子类中的父类特征赋值[并不会创建对象]
* */
public class OOTest13_Super {
    public static void main(String[] args){
        Manager manager = new Manager();

        manager.test();

    }
}

class Employee{
   String name = "Emily";

   public Employee(){
       System.out.println("父类构造被调用");
   }

   public Employee(String name){
       this.name = name;
   }

   public void work(){
       System.out.println("员工在工作");
   }

}

class Manager extends Employee{

    String name = "David";

    // super关键字在构造方法中的使用
    public Manager() {
        super("Bird");
        System.out.println("子类构造被调用");
    }

    public void work(){
        System.out.println("经理在工作");
    }

    // super关键字在成员方法中的使用
    public void test(){
        System.out.println(this.name);
        System.out.println(name);
        System.out.println(super.name);

        work();
        super.work();
    }

}
