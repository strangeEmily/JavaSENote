package basic;

public class Test008_While {
/**
 * 注意：关系运算符只有在运行期才能得到运算结果，所以错误无法在编译期被检测到
 *
 * while运算符
 * 1.while循环的语法结构：
 *   while(布尔表达式){
 *       循环体
 *   }
 * 2.while循环的执行原理
 *   先判断布尔表达式的结果
 *      * true
 *        - 执行循环体
 *           - 判断布尔表达式的执行结果
 *             true
 *             - 执行循环体
 *               ...
 *             false
 *             - 循环结束
 *      *false
 *        - 循环结束
 * 3. while循环的循环次数为0~n次
 *
* */
   public static void main(String args[]){
       /**
        * Test01 - 用while语句输出1 - 10
       * */
       int i = 1;
       while (i <= 10){
           System.out.println(i);
           i++;
       }
       /**
        *Test02 - 系统对死循环的处理
       * */
       int j = 10;

       while ( j > 0){
           System.out.println(j);
       }
//     关系运算符只有在程序执行时才能得到结果，所以前面的 j > 0 为死循环无法被检测到，该语句不会报错，但也不会被执行
       System.out.println("End");

       while (true){
           System.out.println(j);
       }

//     前面有一个死循环 该语句不会被执行到，所以编译报错
//       System.out.println("End");
   }
}
