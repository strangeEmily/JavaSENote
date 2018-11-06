package basic;

public class Test004_IF {
    public static void main(String args[]){
//       布尔型数据的if语句
        boolean sex = true;
        if (sex){
            System.out.println("男");
        }else {
            System.out.println("女");
        }

//        当一个分支中的java语句只有一行时，大括号可以省略不写
        boolean sex2 = false;
        if (sex2) System.out.print("男");else System.out.print("女");
    }
}
