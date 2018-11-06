package basic;

/**
 * 面向对象的封装性指的是：
 * 1.属性私有化
 * 2.对外提供公开的setter和getter方法
 * 3.通过get和set方法访问变量的原因
 *  - 通过get和set方法访问变量而不是直接访问变量能保证数据的安全性，因为可以在方法中增加安全控制
 *  - 具体体现在：可以在set方法中用if语句判断所赋的值是否合法，再决定赋值操作是否生效
 *  4.get和set方法的命名规范
 *    - get / set + 变量名（变量名首字母大写）
* */
public class GetAndSet {

//   属性，成员变量，实例变量，非静态变量 【其他类可以new一个对象直接访问】
//    int age;
    private int age;//用private修饰的数据只能在本类中访问

//  对外提供两个公开的方法来访问age的值
/**
 * 若方法结构中没有stati修饰符 则该方法为成员方法，实例方法,非静态方法
 * 也就意味着该方法必须通过对象.的方式访问
 *  *静态方法可以直接通过类名.的方式访问
* */
//  get - 读取   有返回值无参数
    public int getAge() {
        return age;
    }
//  set - 赋值   有参数无返回值
    public void setAge(int age) {
        if (age < 0 || age > 100){
            System.out.println("输入数据越界");
        }else {
            //this在这里用来区分同名的成员变量和局部变量
            this.age = age;
        }
    }
}
