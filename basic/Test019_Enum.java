package basic;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 枚举类
 * - 用于定义一个有限序列
 * - 优点： 简洁
* */
/*Test:定义一个枚举类指代一星期中的七天*/
public class Test019_Enum {
    public static void main(String[] args){
        System.out.println(WeekdayEnum.FRI.getName());
        System.out.println(WeekdayEnum.SUN.getValue());
    }

}
enum WeekdayEnum{
    MON(1,"星期一"),
    TUS(2,"星期二"),
    WED(3,"星期三"),
    THU(4,"星期四"),
    FRI(5,"星期五"),
    SAT(6,"星期六"),
    SUN(7,"星期天");


    private int value;
    private String name;

    /*
    * 枚举类在类加载阶段就会示例化，为保证枚举类中的元素是唯一的，不允许重新创建对象，因此构造方法用private修饰
    * */
    private WeekdayEnum(int value, String name){
            this.value = value;
            this.name  = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
