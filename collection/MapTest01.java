package collection;
/**
 * Map<K,V>
 * Map
 * 1. 解释：
 *    - Map是集合的一种，Map集合以键值对的方式存储元素，Map中键的特点是：无序且不可重复
 * 2. 继承结构
 *    Map<Key,Value> [Interface]
 *    <实现>                                               <继承>
 *    HashMap                                              SortedMap[Interface]
 *    - 底层存储的是哈希表/散列表，key等于一个Set集合            - Key等同于一个SortedSet集合，存储元素的特点是无序不可重复可按元素大小排序
 *    Hashtable                                            <实现>
 *    - 线程安全，但是效率低，所以不太使用                      TreeMap
 *    <继承>                                                - Key等同于一个TreeSet集合
 *    Properties
 *    - 属性类，继承Hashtable.按照键值对方式存储元素，
 *      且key和value只能是字符串类型
 * */
public class MapTest01 {
}
