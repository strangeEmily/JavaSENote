package basic;

public class Test012_sushu {
    /**找出0-100中的所有素数
    * */
    public static void main(String[] args){
        int num = 0;
        for (int i = 2;i <= 100;i++){
            boolean isSuShu = true;
            for (int j = 2;j <= 7; j++){
                if (i % j == 0 && i != j){
                    isSuShu = false;
                    break;
                }
            }
            if (isSuShu == true){

                System.out.print(i + " ");

                num++;
                if (num % 5 == 0){
                    System.out.println();
                }

            }
        }
        System.out.println("num：" + num);
    }
}
