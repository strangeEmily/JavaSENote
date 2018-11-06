package basic;

public class Test002_KeyInput {
    public static void main(String[] args){
        //*******接收用户键盘输入练习**********
        //第一步：创建键盘扫描器对象
        java.util.Scanner s = new  java.util.Scanner(System.in);
        //第二步：调用Scanner对象的next()方法开始接受用户键盘输入
        //        程序停在这里，等待用户输入
        //        当用户输入并且敲回车键的时候，将输入信息自动赋值给userInputContent
        //        此时用户输入值已被写入内存
        //String userInputContent = s.next();
        System.out.print("请输入用户年龄：");
        int userInputContent = s.nextInt();
        //第三步：将内存中的数据输出到控制台
        System.out.println("您输入的年龄为：" + userInputContent);

        //********if语句练习**************
        /*
        * 写一个if语句判断一个人正处于生命的哪个阶段，年龄必须在[0 - 150]之间
        * [0,5]幼儿,[6,10]少年,[11,18]青少年,[19,35]青年,[36,55]中年,[56,150]老年
        * */

        String str = null;
        int age = userInputContent;
        if (age < 0 || age > 150){
            System.out.println("输入年龄必须在[0,150]之间，请检查输入");
        }else {
            if ( age <= 5){
                str = "幼儿";
            }else if ( age <= 10){
                str = "少年";

            }else if ( age <= 18 ){
                str = "青少年";
            }else if ( age <= 35 ){
                str = "青年";
            }else if ( age <= 55 ){
                str = "中年";
            }else{
                str = "老年";
            }
            System.out.println("您现在正处于生命周期的" + str + "阶段");
        }
    }
}
