package OO;

/**
 * 1.静态变量
 *   - static修饰的变量叫静态变量
 * 2.变量分类
 *   2.1 局部变量【在栈区中存储】
 *   2.2 成员变量（实例变量，非静态变量）【在堆区中存储】
 *   2.3 静态变量【在方法区中存储】
 * 3. 成员变量的缺点：
 *    - 成员变量是对象级别的，每创建一个对象就要为成员变量开辟一块内存空间，当为一个类创建多个对象时，同一个成员变量重复开辟内存空间
 *      对内存消耗比较大
 * 4. 静态变量的优点
 *    - 静态变量被存储在方法区，是属于类本身的，所有对象可以共享同一个内存空间，通过类名.的方式访问，比较节省内存空间
 * 5. 静态变量的使用场景
 *    - 静态变量 - 如果该属性所有对象都有，且值是固定的，则应该声明成静态变量
 * 6. 静态变量和成员变量分别在什么时候初始化
 *    - 静态变量 - 类加载阶段
 *    - 成员变量 - 创建java对象时
 * 7. 静态方法和静态变量的调用注意
 *    - 静态方法和静态变量都是在类加载阶段赋值或调用的，加载时遵循自上而下的顺序，因此变量声明的代码要在调用变量的方法前
 * */
public class OOTest07_Static03 {
    public static void main(String[] args){
        Animal a1 = new Animal("a",10);
        Animal a2 = new Animal("b",20);

        System.out.println(a1.type + " "  + a1.name + " "  + a1.age);
        System.out.println(Animal.type + " "  + a2.name + " "  + a2.age);
    }

//    以下引用会报非法向前引用的错  静态变量i的声明语句应该写在调用它的静态语句块之前
//    static {
//        System.out.println(i);
//    }
//    static int i = 10;

}

//抽象一个现实世界的陆生动物类
class Animal{
    int age;
    String name;
    //将type定义为成员变量时，每次new对象的时候都分配一次内存空间
    //String type = "陆生";
    //将type定义为静态变量，该变量只在类加载时分配一次内存空间，存在方法区，所有新创建的对象共用一份
    static String type = "陆生";

    Animal(String name, int age){
        //使用this.将入参的值赋给Animal类中的成员变量
        this.name = name;
        this.age = age;
    }
}
