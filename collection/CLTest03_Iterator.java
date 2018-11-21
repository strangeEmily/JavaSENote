package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator迭代器
 * - 实现集合的遍历
 *
 * */
public class CLTest03_Iterator {
    public static void  main(String[] args){
        // 创建集合
        Collection c = new ArrayList();

        c.add("TEST01");
        c.add(3545);
        c.add("dfdg");
        c.add(false);


        // 创建迭代器对象
        // 注意：迭代器对象创建之后不能对集合中的元素数目进行更改
        Iterator it = c.iterator();

        // 调用迭代器中的方法完成迭代/遍历
        System.out.println("====================================");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=====================================");

        for (Iterator it2 = c.iterator();it2.hasNext();){
            System.out.println(it2.next());
        }
    }
}
