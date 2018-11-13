package basic;
/**
 * StringBuffer和StringBuilder
 * 1.  是什么
 *     - 可变容量的字符串缓冲区
 * 2.  工作原理
 *     - 预先在内存中申请一块空间以容纳字符串序列，如果预留的空间不够则进行自动扩容
 *       以容纳更多的字符序列
 * 3.  和String的区别
 *     - String是不可变得字符序列，存储在字符串常量池
 * 4. 默认容量
 *     - 16
 * 5. 如何优化StringBuffer和StringBuilder
 *     - 创建对象前预测所存储字符的数量，创建时使用指定初始化容量的方式创建，这样做可以避免扩容引起的数组拷贝，从而提高效率
 * 6. StringBuffer和StringBuilder的区别
 *    - StringBuffer是线程安全的，可以在多线程场景下使用,StringBuilder不能在多线程场景下使用
 *    - StringBuilder效率高于StringBuffer因此在单线程环境下操作字符串时应该使用StringBuilder
 * */

public class Test014_StringBuilder {
    public static void main(String[] args){
        /**
         * StringBuffer的使用
        * */
        StringBuffer sb = new StringBuffer(50);

        String[] names = {"Emily","Panda","Garrad","Ricky"};

        for (int i = 0; i < names.length;i++){
            sb.append(names[i]);
            if (i != names.length - 1){
                sb.append(",");
            }
        }
        System.out.println(sb);
    }
}

