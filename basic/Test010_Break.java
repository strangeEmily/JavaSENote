package basic;

public class Test010_Break {
/**
 * break语句
 * 1.语法结构： break;
 * 2.使用场景：
 *   2.1 用在switch中，终止switch语句的执行
 *   2.2 用在循环语句for,while,do...while中，终止循环
 *       注意：break只终止当前循环
 *
* */
  public static void main(String args[]){
      /**
       *Test01 - 测试break只终止当前循环,不影响外层for循环
      * */
      for (int i = 1; i <= 3; i++){
          for (int j = 1; j <= 10; j++){
              if (j == 5){
                  break;
              }
              System.out.println("j = " + j);
          }
      }

      System.out.println("========================================");

      /**
       * Test02 - 当为break指定循环名时，break中断的是指定的循环
       * 注： 此语法使用场景较少
       * */
      for1 : for (int i = 1; i <= 3; i++){
          for2 : for (int j = 1; j <= 10; j++){
              if (j == 5){
                  break for1;
              }
              System.out.println("j = " + j);
          }
      }
  }
}
