package collection;

import java.util.*;

/**
 * List集合
 * 1.存储元素的特点
 *   - 有序【有下标】，读取元素的顺序和存入顺序相同
 *   - 可重复
 *   - 系统默认容量为10
 *     - 因为ArrayList底层是数组，扩容意味着数组copy较消耗内存，因此建议在创建对象时给予足够的内存空间
 * */
public class CLTest04_List {
    public static void main(String[] args) {
        //创建List对象
//        List l = new ArrayList(80);
        // 因为ArrayList和LinkedList都实现List接口，add和get方法可以共用，所以可直接在new对象时改掉类型而不影响以下代码的执行
        List l = new LinkedList();

        l.add(322);
        l.add(322);
        l.add(12);
        l.add(89);
        l.add(76);

        l.add(2, 75);

        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==================================");
        for (int i = 0;i < l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
