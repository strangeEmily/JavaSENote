package basic;

public class Test011_Continue {
    /**
     * continue语句
     * 1.continue表示：继续，下一个
     * 2.continue的语法结构:  continue;
     * 3.continue的执行原理：
     *   结束当前循环，继续执行下一个循环
     *
    * */
    public static void main(String args[]){
        for (int i = 1; i <= 10; i+=2){
            if (i == 3){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
