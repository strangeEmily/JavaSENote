package OO;

import basic.GetAndSet;

public class OOTest002 {

    public static void main(String[] args){
        GetAndSet c = new GetAndSet();

/*没有private约束的成员变量的读取和赋值*/
//        // 读取age
//        System.out.println(c.age);
//        // 给age赋值  此时age是一个没有任何修饰符约束的非静态变量，所以外部可以直接访问并随意赋值
//        c.age = 10;
//
//        System.out.println(c.age);

/*有private约束的成员变量的读取和赋值*/
         System.out.println(c.getAge());

         c.setAge(10);

         System.out.println(c.getAge());
    }

}
