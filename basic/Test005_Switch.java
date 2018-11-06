package basic;

import java.util.Scanner;

public class Test005_Switch {
    /**
     * 1.需求说明
     * 实现计算器中的+ - * / %
     * 2.实现思路：
     * 2.1 选择所有数据从键盘输入
     * 2.2使用switch语句进行判断
     * 2.3 需要从控制台输入三次： 第一个数字，运算符，第二个数字
     *
     * 3.最终在控制台上显示这样的场景：
     * 3.1 欢迎使用计算器系统
     * 3.2 请输入第一个数字
     * 3.3 请输入运算符
     * 3.4 请输入第二个数字
     * 3.5 运算结果： x + y = z
     *
    * */
    public static void main(String arg[]){

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("欢迎使用计算器系统");
        System.out.println("请输入第一个数字：");
        Double num1 = s.nextDouble();
        System.out.println("请输入运算符：");
        String operator = s.next();
        System.out.println("请输入第二个数字：");
        Double num2 = s.nextDouble();
        Double result = 0.0;

        switch (operator){
            case "+":
                result =  num1 +  num2;
                System.out.println("运算结果为：" +  num1 + operator +  num2 + "=" + result);
                break;
            case "-":
                result =  num1 -  num2;
                System.out.println("运算结果为：" +  num1 + operator +  num2 + "=" + result);
                break;
            case "*":
                result =  num1 *  num2;
                System.out.println("运算结果为：" +  num1 + operator +  num2 + "=" + result);
                break;
            case "/":
                result =  num1 /  num2;
                System.out.println("运算结果为：" +  num1 + operator +  num2 + "=" + result);
                break;
            case "%":
                result =  num1 %  num2;
                System.out.println("运算结果为：" +  num1 + operator +  num2 + "=" + result);
                break;
            default:
                System.out.println("该系统只支持+ - * / %的运算！");

        }
    }

}
