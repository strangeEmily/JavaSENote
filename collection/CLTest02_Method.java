package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * collection中的常用方法
 * boolean add(Object object);   // 向集合中添加元素
 * int size();                   // 获取集合中的元素个数
 * void clear();                 // 清空集合中的元素
 * boolean isEmpty();            // 判断集合中是否还有元素
 * Object[] toArray();           // 将集合转换为数组
 *
 * boolean contains(Object o);   // 判断集合中是否包含某元素
 * boolean remove(Object o);     // 删除集合中的某元素
 * */
public class CLTest02_Method {
    public static void main(String[] args){
        // 1. 创建一个ArrayList类型的集合
        Collection c = new ArrayList();//多态
        // 2. 向集合中添加元素
        c.add(1); // 自动装箱
        c.add(new Integer(45));
        c.add("Test");
        //3. 打印集合中的元素个数
        System.out.println(c.size());
        //4. 将集合转换为数组并遍历其中的元素
        Object[] o = c.toArray();
        for (int i = 0; i < o.length;i++){
            System.out.println(o[i]);
        }
        //5. 清空集合中的元素
        c.clear();
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        c.add("Cat");
        c.add("Dog");
        c.add("Pig");
        c.add("bird");

        System.out.println(c.contains("bird"));
        c.remove("bird");
        System.out.println(c.contains("bird"));
        Object[] o2 = c.toArray();
        for (int i = 0; i < o2.length;i++){
            System.out.println(o2[i]);
        }

        String s1 = "Emily";
        String s2 = "Emily";
        c.add(s1);
        c.add(s2);
        System.out.println(c.contains(s1));
        c.remove(s1);
        // contains方法对比的是值而非内存地址，因此就算s1被remove但是其值Emily在集合c中仍然 存在，因此返回值为true
        System.out.println(c.contains(s1));
        // remove方法对比的是内容而非内存地址，所以虽然上文已经删除了s1，但s1的值Emily在集合中有2个，所以可以再删除一次
        System.out.println(c.remove(s1));
        System.out.println(c.contains(s1));
    }
}
