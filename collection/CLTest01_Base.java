package collection;
/**
 * 一. 集合
 * 1. 分类 - 集合可以分为collection和map两个大类， collection是一个一个存储数据的，map是一对一对存储数据的
 * 2. 存储类型 - 集合中只能存储引用数据类型
 * 3. 继承结构
 *    Iterable<Interface> [内含iterator()方法] - 可迭代的，所有的集合都是可迭代的，迭代就是遍历
 *    <继承>
 *    Collection<Interface> --- <依赖> --- Iterator<Interface> [迭代器]
 *    - Collection 集合通过继承Iterable获取迭代器Iterator，进而使用迭代器遍历集合
 *    <继承>
 *    List<Interface>                Set<Interface>
      <实现>                         <实现>            <继承>
 *    - Arraylist                    - HashSet        - SortedSet
 *    - LinkedList                                    <实现>
 *    - Vector                                        - TreeSet
 *****************************************************************************************************
 * 二. 不同类型集合存储元素的特点对比
 * 1. List
 *   - 有序 ：存进去的元素顺序和取出时顺序一致
 *   - 可重复
 * 2. Set
 *   - 无序
 *   - 不可重复
 * 3. SortedSet
 *   - 无序,但是所存储元素可以按照元素大小排序
 *   - 不可重复
 ******************************************************************************************************
 * 三. 常用集合类底层数据结构
 *   1. ArrayList 【使用较多】
 *      - 底层存储的是数组
 *      - 适合查询，不适合随机增删
 *   2. LinkedList
 *      - 底层采用双向链表这种数据结构存储数据
 *      - 适合频繁增删数据，不适合查询操作
 *   3. Vector
 *      - 底层和ArrayList相同，但是是线程安全的
 *      - 因为效率较低所以很少使用
 *   4. HashSet
 *      - 底层是哈希表/散列表c
 *******************************************************************************************************
 * 四. 单向链表
 *     - 单向链表的每个元素都称作节点，每个节点都由两部分组成：object【集合存储的引用数据类型】和 下一个元素的内存地址
 *     - 注意：单向链表中每个节点在内存中存储的位置是没有规律的
 *     - 单向链表查询效率低的原因：
 *       - 单向链表的元素在内存中的存储位置没有规律可言，因此查找时需要从头节点开始依次往后找直到找到所需元素
 *     - 单向链表增删元素高的原因
 *       - 因为元素存储空间没有顺序所以增删时只需将前一个元素的内存地址指向删除元素的后一个元素或者新增元素的内存地址即可，其他元素不需要位移
 *******************************************************************************************************
 * 五. 双向链表
 *     - 双向链表是环形结构，每个节点由三部分组成：前一个节点的内存地址，Object对象，下一个节点的内存地址
 *     - 双向链表删除和新增效率高，查询效率低
 * */
public class CLTest01_Base {
    public static void main(String[] args){

    }
}
