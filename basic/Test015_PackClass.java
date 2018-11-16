package basic;

import com.sun.javafx.image.impl.IntArgb;

/**
 * 包装类
 * - java中的8种基本类型分别对应一种包装类型，这样做的目的是为了方便使用
 *   基本数据类型     包装类型
 *   byte            java.lang.Byte
 *   short           java.lang.Short
 *   int             java.lang.Integer
 *   long            java.lang.Long
 *
 *   float           java.lang.Float
 *   double          java.lang.Double
 *
 *   boolean         java.lang.Boolean
 *
 *   char            java.lang.Character
 * - 以上8种包装类型的继承关系为：
 *   Byte/Short/Integer/Long/Float/Double -----[继承]--- java.lang.Number ---[继承]--- java.lang.Object
 *   Boolean/Character ---[继承]--- java.lang.Object
 *   *************************************************************************
 *   自动装箱和自动拆箱
 *   - 是程序编译阶段的概念，和程序运行无关
 *   - 目的：方便程序员编码
* */
public class Test015_PackClass {

    public static void main(String[] args){
        int  a = 11;
        Integer a1 = new Integer(a);
        //因为m1方法的形参是Object类型，属于引用数据类型，因此无法将基本数据类型a作为参数传进去，但是可以将Integer类型的a1传进去
        m1(a1);
        /**
         * 以java.lang.Integer为例，实践包装类中的常用方法
        * */
        //获取int类型的最大值和最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //创建Integer对象
        Integer i1 = new Integer(34);  //对象创建时将int类型的34强制转换成了Integer类型
        Integer i2 = new Integer("63");   //对象创建时将String类型的63强制转换成了Integer类型
        //Integer类重写了toString方法，因此打印出的不是内存地址而是具体的值
        System.out.println(i1);
        System.out.println(i2);
        //将Integer类型转换成long类型
        long i3 = i2.longValue();
        System.out.println(i3);
        //将String类型转换成int类型
        int i4 = Integer.parseInt("98");
        System.out.println(i4);

        /**
         * Integer,int,String三种数据类型之间的相互转换
        * */
        // int ---> Integer
        Integer i5 = Integer.valueOf(13);
        // Integer ---> int
        int i6 = i5.intValue();
        // String ---> Integer
        Integer i7 = Integer.valueOf("32");
        // Integer ---> String
        String s1 = i7.toString();
        // String ---> int
        int i8 = Integer.parseInt(s1);
        // int ---> String
        // int类型i8和字符串进行拼接，得到的数据类型为字符串
        String s2 = i8 + "";
        /**
         * JDK5.0的新特性
         * - 自动装箱（auto_boxing）和自动拆箱(auto_unboxing)
         * */
        // 装箱
        Integer i9 = new Integer(13);
        // 拆箱
        int i10 = i9.intValue();
        // 自动装箱
        Integer i11 = i10;
        // 自动拆箱
        int i12 = i11;

        m1(11); //自动装箱，int型参数11会被自动包装为Integer类型

        /**
         * Integer数据类型如何对比是否相等
         * - 应使用equals方法进行对比而非==
         * */
        Integer x1 = 23;
        Integer x3 = 23;
        /*true
         解释：Integer x1 = 23 等同于 Integer x1 = new Integer(23)
              因此x1和x3都属于引用数据类型  存储的是内存地址
              因为jvm的方法区有一个整形常量池，将-128~127的数据存在常量池中，因此x1和x3中的23指向的是方法区中常量池的地址而非
              在堆区新建对象，因此对比结果为true
         */
        System.out.println(x1 == x3);

        Integer x4 = 340;
        Integer x5 = 340;
        // false
        System.out.println(x4 == x5);
        // true
        // Integer类重写了equals方法，对比的是值而非内存地址，因此结果为true
        System.out.println(x4.equals(x5));


    }

    public static void m1(Object o){
        System.out.println(o);
    }
}
