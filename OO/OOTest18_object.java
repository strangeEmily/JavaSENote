package OO;

/**
 * Object类是java的根类，所有的类都会继承Object类
 * 以下介绍Object类中的几种方法
 * 1. toString()方法
 *    - 作用：返回输入对象的字符串表示形式
 *    - print()方法若调用的是一个引用数据类型，则默认调用该对象的toString()方法
 * 2. equals()方法
 *    - 作用： 对比两个对象是否相等
 *    - 注意：object类中的equals()方法比较的是引用数据类型的内存地址，String类将equals（）方法进行了重写，因此字符串在对比值的时候可以
 *           直接调用equals（）方法进行比较【== 仅用于基本数据类型的值之间的对比】
 *3. finalize（）方法
 *    - 该方法和java中的垃圾回收器GC有紧密的联系
 *    - 该方法每个java对象都有
 *    - 该方法由系统自动执行，当一个对象没有引用指向它时，该对象会被垃圾回收器回收，垃圾回收器再回收该对象时会自动调用finalize方法，
 *    - 相当于现实世界中的遗嘱
 *4. hashCode() 方法
 *    - 该方法返回对象的hash码值
* */
public class OOTest18_object {

    public static void main(String[] args){
        OOTest18_object obj = new OOTest18_object();
        System.out.println(obj.hashCode());
    }
}
