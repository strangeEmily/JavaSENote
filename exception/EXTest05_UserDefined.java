package exception;

/**
 * 自定义异常
 * - 步骤
 *   1. 新建一个异常类，若为编译时异常则继承Exception，若为运行时异常则继承RuntimeException
 *   2. 为该异常类定义两个构造方法，一个无参的构造方法，一个有参数的构造方法
 * */

public class EXTest05_UserDefined {
    // 自定义异常的调用
    public static void main(String[] args){
      EXTest05_UserDefined obj = new EXTest05_UserDefined();
      try {
          obj.passwordInput();
      }catch (Exception e){
          e.printStackTrace();
      }
    }

    public void passwordInput() throws Exception{
        java.util.Scanner s = new  java.util.Scanner(System.in);
        System.out.print("请输入密码：");
        String username = s.next();
        if (username.length() < 6){
            // 手动抛出异常
            // 注意：手动抛出异常的方法中一般使用throws关键字将异常信息抛给上一层调用而不进行捕获
            throw new UserDefinedException("密码不能少于6位");

        }
    }
}

// 自定义一一个编译时异常
class UserDefinedException extends Exception{
      //定义两个构造方法，一个无参一个有参

      UserDefinedException(){}

      UserDefinedException(String message){
          System.out.println(message);
      }
}
