package OO;

/**
 * this关键字
 * 1. this是什么
 *    - this是一个引用类型，保存的是内存地址，存放在堆中的对象中，this保存的内存地址指向自身，每个对象都有this[门牌号]
 * 2. this能用在哪里
 *      - 成员方法中
 *      - 谁调用成员方法，this就指谁  this指当前对象，该关键字可以省略
 *      - this可以用来区分同名的成员变量和局部变量
 *    - 构造方法中,
 *      - this关键字可以用来在构造方法中调用另一个构造方法，方便代码重用
 * 3. this为什么不能用在静态方法中
 *    - 因为静态方法的调用是通过类名.的方式实现的，而不是引用.
* */
public class OOTest04_this {
    private String date;
    public OOTest04_this(){
      this("2018","09","15");
    }

    public OOTest04_this(String year,String month,String day){
       date = year + "年" + month + "月" + day + "日";
    }

    public static void main(String[] args){
        OOTest04_this test = new OOTest04_this();
        //静态方法中不能使用this关键字  必须通过引用.的方式访问成员变量
        System.out.println(test.date);
    }

}
