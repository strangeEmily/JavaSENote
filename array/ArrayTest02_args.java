package array;
/**
 * 1.main方法中的参数列表  String[] args
 *   - String[] args是专门用来接收命令行参数的
 * 2.数组拷贝
 *   - 直接调用java.lang.System类中的arrayCopy方法实现
 * */
public class ArrayTest02_args {
    /**
     * String[] args参数应用test
     * 需求：在程序运行时要求输入用户名和密码，并校验用户名为admin，密码为123
     * 命令行代码为：java ArrayTest02_args admin 123
     *          - 注意：命令行中的参数admin 123会被JVM以空格截断作为不同元素存储在args[]数组中
    * */
    public static void main(String[] args){
        /*
        通过main方法的参数args进行登录校验
        * */
        if (args.length != 2){
            System.out.println("登录系统的命令为：java ArrayTest02_args username password");
//            return;
        }


//        if ("admin".equals(args[0]) && "123".equals(args[1])){
//            System.out.println("登录成功，欢迎回来");
//        }else {
//            System.out.println("登录失败，用户名或密码有误");
//        }

        /*
        数组拷贝
        * */
        int[] i01 = {33,32,56,65,98,92,47};
        int[] i02 = new  int[4];
        // 参数含义：原数组，原数组起始下标，目标数组，目标数组起始下标，拷贝长度
        System.arraycopy(i01, 2, i02, 2, 2);
        m1(i02);
        System.out.println("======================================");

        //方法调用时直接给数组参数赋值
        m1(new int[]{12,54,61,98});
    }

    private static void m1(int[] x){
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }
}
