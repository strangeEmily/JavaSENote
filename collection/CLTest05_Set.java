package collection;

import org.omg.PortableInterceptor.INACTIVE;
import sun.nio.cs.ext.SJIS;

import javax.swing.plaf.synth.SynthRootPaneUI;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 1.HashSet
 *   - HashSet的底层是一个HashMap
 *     1.1 HashMap
 *     - HashMap的底层是一个哈希表/散列表
 *       - 哈希表是数组和单向链表的结合
 *        - 哈希表的本质是一个数组，只不过这个数组中的每个元素都是一个单向链表
 *        - 哈希表中的单向链表结构为：
 *          Object key;
 *          Object value;
 *          final int hash;    -  key调用hashCode方法得到中间值，再通过“哈希算法”得出的值，代表数组下标
 *          Entry next;        -  单向链表下一个元素的内存地址
 *     1.2 HashMap中的方法
 *        - 添加元素： void put(Object key,Object value);
 *        - 查找元素： Object get(Object key);
 * 2. SortedSet
 *    - 接口，存进去的元素无序不可重复，但是可以按照元素大小顺序自动排列
 *      - 实现类为java.util.TreeSet
 *    - SortedSet可以实现自动排序的原因
 *      - 因为被存储的元素实现了Comparable接口，SUN编写TreeSet集合在添加元素的时候会调用compareTo方法完成比较
 * */
public class CLTest05_Set {
    public static void main(String[] args) throws Exception{
        /**
         * HashMap Test
         * */
        HashMap<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1,"test01");
        map1.put(1,"test02");
        map1.put(2,"test03");
        map1.put(2,"test01");
        System.out.println(map1.size());
        System.out.println(map1.get(1));
        System.out.println(map1.get(2));
        /**
         * SortedSet Test
         * */
        // 创建集合
        SortedSet set = new TreeSet();

        //添加元素
        set.add("Lucy");
        set.add("David");
        set.add("John");
        set.add("Iris");

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        SortedSet dateSet = new TreeSet();

        dateSet.add(sdf.parse("2018-01-09"));
        dateSet.add(sdf.parse("2017-01-01"));
        dateSet.add(sdf.parse("2016-12-12"));
        dateSet.add(sdf.parse("2019-01-04"));
        dateSet.add(sdf.parse("2018-06-23"));

        System.out.println("=================================");

        it = dateSet.iterator();
        while (it.hasNext()){
            Date d = (Date)it.next();
            System.out.println(sdf.format(d));
        }


    }
}
