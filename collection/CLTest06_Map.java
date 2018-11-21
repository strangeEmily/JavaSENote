package collection;
import java.util.*;

/**
 * Map
 * 1. Map集合中的常用方法
 *    void clear(); 清空Map
 *    boolean containsKey(Object key); 判断Map中是否包含这样的Key
 *    boolean containsValue(Object value); 判断Map中是否含有这样的value
 *    Set<Map,Entry<K,V> entrySet();    返回此映射中包含的映射关系的Set视图
 *    Object get(Object key);           通过key获取value
 *    Object put（Object key,Object value）; 向集合中添加键值对
 *    boolean isEmpty();                判断集合是否为空
 *    Object remove(Object key);        通过key删除键值对
 *    int size()                        获取Map中键值对的个数
 *    Set keySet();                     获取Map中所有的key
 *    Collection values();              获取Map集合中的所有value
 ********************************************************************
 *
 * */
public class CLTest06_Map {
    public static void main(String[] args){
        //创建一个Map集合
        Map test = new HashMap(100);

        //往Map中添加键值对
        test.put(1000032, "Cat");
        test.put(1000024, "Dog");
        test.put(1000056, "Fish");
        test.put(1000078, "Monkey");
        test.put(1000032, "Bird");

        //获取键值对个数
        System.out.println(test.size());
        //判断Map中是否包含某个key
        System.out.println(test.containsKey(1000032));
        //判断Map中是否包含某个value
        //返回值为false的原因是，key不可重复，因此1000032这个key被重新put时只是将之前的value覆盖掉了
        System.out.println(test.containsValue("Cat"));
        //通过key删除键值对
        test.remove(1000032);
        System.out.println(test.size());
        //获取Map中的所有key
        Set keys = test.keySet();
        System.out.println("=================================");
        Iterator it = keys.iterator();
        while (it.hasNext()){
            Object testKey = it.next();
            Object testValue = test.get(testKey);
            System.out.println(testKey + "--->" + testValue);
        }
        //获取Map中的所有Value
        Collection values = test.values();
        System.out.println("=================================");
        it = values.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        test.clear();
        System.out.println(test.size());


    }
}
