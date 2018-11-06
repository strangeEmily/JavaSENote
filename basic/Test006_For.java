package basic;

public class Test006_For {
    /**
     * for语句属于循环结构
     * 1.循环结构：在程序中需要反复执行的代码，在循环体中编写这些代码片段，可让这部分代码实现一次编写，反复使用
     * 2.基本所有的编程语言支持的循环结构包含三种：for循环，while循环，do...while循环
     * 3.for循环的语法结构为：
     * for(初始化表达式,布尔表达式，更新表达式){
     *     //需反复执行的代码片段
     * }
     * 4.for循环的执行过程/执行原理为：
     *  4.1 初始化表达式，布尔表达式，更新表达式都不是必须的【但是两个分号是必须的】
     *  4.2 初始化表达式最先执行，并且在整个for循环中只执行一次
     *  4.3 布尔表达式的值必须是true/false
     *  4.4 for循环的执行过程为：
     *      - 先执行初始化表达式
     *      - 判断布尔表达式的值是true还是false
     *        - false
     *           退出循环
     *        - true
     *           执行循环体
     *           执行更新表达式
     *           判断布尔表达式的值是true还是false
     *              - false
     *                退出循环
     *              - true
     *                执行循环体
     *                ...
     * 5. 其他说明
     * 5.1 for（）{}括号中定义的变量，作用域为当前for循环
    * */

   public static void main(String[] args){
//for循环示例
       for (int i = 1;i<=10;i++){
           System.out.println(i);
       }
       for (int i = 1;i<=10;i+=2){
           System.out.println(i);
       }

       for (int i = 10;i>0;i--){
           System.out.println(i);
       }
//循环语句和if语句的嵌套使用
   }
}
