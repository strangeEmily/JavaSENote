package basic;
/**
 * String
 * 1.解释
 *   - java.lang.String属于final类型类  不可继承
 *   - 底层存储的是一个char类型的数组
 * 2.存储
 *   - 所有在java中使用双引号""括起来的字符串在创建时会在方法区中的“字符串常量池”中创建一份，程序执行过程中若用到某个字符串会先去字符串常量池
 *     中查找，若找到则将地址指向该字符串地址，找不到则在常量池中新建
 *   - 字符串判断是否相等使用equals方法，equals方法已被String类重写，对比的是值而非内存地址
 *  3.注意
 *   - 尽量不要做频繁的字符串拼接，因为每拼接一次都要重新创建一个对象，浪费内存，且会给垃圾回收带来压力
 * 正则表达式
 * 1.解释
 *   - 正则表达式是一门独立的学科，在各编程语言中通用
 *   - 正则表达式是一种字符模型，用于字符串格式匹配
 * 2.示例
 *   - \d 数字
 *   - \D 非数字
 *   - \w 英文字母
 *   - \W 非英文字母
 *   - "^a{2}$"表示2个a字符，等同于aa
* */

public class Test013_String {
    public static void main(String[] args){

         String s1 = "abc";
         String s2 = "abc";

          /**
           * 字符串存储
           * */
         //true abc存储在字符串常量池，s2直接使用，因此s1和s2的内存地址是相同的
         System.out.println(s1 == s2);

         String s3 = new String("abc");
         //false s3在堆区新建了一个字符串对像,该对象指向方法区中的“abc”s3指向该对象的内存地址，和s1指向的方法区中的abc地址不同，因此结果为false
         System.out.println(s1==s3);
         //true equals对比的是值而非内存地址，因此结果为true
         System.out.println(s1.equals(s3));

         //局部变量s1并未被final修饰，因此可以重新指向想新的内存地址
         s1 = "xyz";
         System.out.println(s1);

         //以下操作创建了3个对象，堆区2个，方法区1个
        String s4 = new String ("dbc");
        String s5 = new String ("dbc");

        //字符串之间可以使用+进行拼接，拼接会在方法区为s6创建一个新的对象“xyzdbc”
        String s6 = s1 + s4;
        System.out.println(s6);
        /**
         * 字符串常用方法
        * */
        String s7 = "javamysqlpythonabapjava";
        //从指定下标开始获取指定字符第一次出现的下标
        System.out.println(s7.indexOf("java",1));
        // 获取指定字符最后一次出现时的下标
        System.out.println(s7.lastIndexOf("java"));
        // 获取字符串长度
        System.out.println(s7.length());
        // 替换字符串中的指定字符
        System.out.println(s7.replaceAll("java","php"));
        // 根据指定字符将字符串分割为数组
        String s8 = "Emily,Garrad,Panda,Ricky";
        String[] ar = s8.split(",");
        for (int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
        // 忽略大小写对比字符串是否相等
        System.out.println("bcd".equals("BCd"));
        System.out.println("bcd".equalsIgnoreCase("BCd"));
        // 根据指定下标截取字符串
        System.out.println(s7.substring(19,23));
        // 转换成大写
        System.out.println(s7.toUpperCase());
        // 转换成小写
        System.out.println("ABC".toLowerCase());
        // 去字符串前后空格
        System.out.println("   abd  dr  nd  ".trim());
        /**
         * 正则表达式
         *
        * */
        //替换正则表达式指定字符
        String test = "xfds1234324drdfdsf36454dfdfdfd34";
        System.out.println(test.replaceAll("\\d","哈"));
        //判断字符串是否与正则表达式格式相匹配
        System.out.println("aa".matches("^a{2}$"));
    }
}
