package OO;

public class OOTest001 {
    public static void main(String[] args){

        /**
         * 1.创建对象
         *1.1 stu1是一个局部变量，这个局部变量是一个引用数据类型，Student类型
         *1.2 创建对象时虚拟机JVM会在内存中开辟出一块‘堆’类型（heap）的内存空间，比如new OO.OOTest001.Student()这个动作会让虚拟机在堆中开辟出一个Student的内存空间
         *1.3 stu1是一个引用而非对象，java中所有new出来的对象都存放在堆区中，程序员无法对堆区直接操作，只能通过内存地址间接操作
         * 1.4 成员变量存放在堆中，局部变量存放在栈中
        * */

        Student stu1 = new Student();

//        一个类可以创建多个对象
        Student stu2 = new Student();

        /**
         * 2.使用对象
         * 2.1 访问成员变量必须使用“引用.”
        * */
        System.out.println("ID = " + stu1.id);
        System.out.println("name = " + stu1.name);
    }

    private static class Student {
        /**
         * 属性
        * */
    //  学号
        int id;  //成员变量/实例变量、非静态变量
                 //id是对象级别的，必须先有对象才能访问，不能通过类直接访问

    //  姓名
        String name;

    //  性别
        boolean sex;

    //  年龄
        int age;

    //  住址
        String addr;

        /**
         *方法
        * */
    }
}
