package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型
 * - JDK5.0的新特性
 * 1. 为什么引入泛型
 *    - 统一集合中的数据类型
 *    - 减少强制类型转换的状况
 * 2. 泛型语法如何实现
 *    - <数据类型>
 * */
public class CLTest08_Generics {
    public static void main(String[] args){
        // 使用泛型创建一个只能存储String类型元素的list
        List<String> slist = new ArrayList<>();

        slist.add("Lucy");
        slist.add("Andy");
        slist.add("Emily");

        Iterator<String> it = slist.iterator();
        while (it.hasNext()){
            String element = it.next();
            System.out.println(element);
        }
    }
}
