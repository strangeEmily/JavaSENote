package basic;

public class Test007_For {
    /**
     * 使用for循环输出九九乘法表
     * 1*1=1
     * 2*1=2 2*2=4
     * 3*1=3 3*2=6 3*3=9
     * 4*1=4 4*2=8 4*3=12 4*4=16
     * 5*1=5 5*2=10 5*3=15 5*4=20 5*5=25
     * ...
     * 9*1=9 ......................................................9*9=81
    * */
    public static void main(String[] arg){
//     自己写的[不简洁]
       for (int i = 1; i <= 9; i++){
           for (int j = 1; j <= i; j++){
               if (j == i){
                   if (i == 1){
                       System.out.println( i + "*" + j + "=" + i*j);
                   }else {
                       System.out.println( " " + i + "*" + j + "=" + i*j);
                   }
               }else if (j == 1){
                   System.out.print( i + "*" + j + "=" + i*j);
               }else {
                   System.out.print( " " + i + "*" + j + "=" + i*j);
               }
           }
       }
//     视频模板
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print( i + "*" + j + "=" + i*j + " ");
            }
            System.out.println();
        }
    }
}
