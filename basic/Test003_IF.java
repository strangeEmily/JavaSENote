package basic;

public class Test003_IF {
    /*
    * 需求：
    * 判断当前天气：
    *     下雨：
    *        判断性别：
    *            男：带一把大黑伞
    *            女：带一把小花伞
    *     晴天：
    *         判断温度：
    *             温度在30度以上
    *                判断性别：
    *                   男： 戴墨镜
    *                   女： 擦防晒霜
    *
    * 提示：1.一定会用到嵌套；2.天气，温度和性别都需要通过键盘输入;3.天气：1表示晴，0表示雨 性别：1表示男，0表示女
    * */
    public static void main(String args[]){
        System.out.println("欢迎使用本系统！");
        System.out.println("您可以使用本系统完成一些简单的判断，以下是几点使用说明，请仔细阅读：");
        System.out.println("说明1:1表示晴天，0表示下雨；");
        System.out.println("说明2:1表示男，0表示雨；");
        System.out.println("说明3:温度用数字表示");
        System.out.println();
//        创建键盘扫描器对象
        java.util.Scanner s = new java.util.Scanner(System.in);
//        调用Scanner对象的next方法
        System.out.print("请输入您的性别：");
        int sex = s.nextInt();
        System.out.print("请输入今天的天气：");
        int weather = s.nextInt();

        if (weather == 0){
            if (sex == 1){
                System.out.println("今天有雨，请在出门前携带一把大黑伞");
            }else if (sex == 0){
                System.out.println("今天有雨，请在出门前携带一把小花伞");
            }else {
                System.out.println("性别必须为0或1，请检查输入");
            }

        }else if (weather == 1){
            System.out.print("请输入今天的温度：");
            int temp = s.nextInt();

            if (temp < 0 || temp > 60){
                System.out.print("温度必须在0~60之间，请检查输入");
            }else if (temp <= 30){
                System.out.print("今天真是个好天气啊！");
            }else {
                if (sex == 1){
                    System.out.println("今天特别热，出门别忘了戴墨镜哦");
                }else if (sex == 0){
                    System.out.println("今天特别热，出门别忘了擦防晒霜哦");
                }else {
                    System.out.println("性别必须为0或1，请检查输入");
                }
            }
        }else {
            System.out.println("天气信息有误，请检查输入！");
        }

    }
}
