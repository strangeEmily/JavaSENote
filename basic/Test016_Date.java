package basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 日期相关操作
* */
public class Test016_Date {
    public static void main(String[] args){
        // 获取系统当前时间
        Date nowTime = new Date();
        System.out.println(nowTime);
        /**
         * 日期格式化
         * - 类  java.text.simpleDateFormat
         * - 格式定义规则
         *   y   年
         *   M   月
         *   d   日
         *   H   小时
         *   m   分
         *   s   秒
         *   S   毫秒
         * */
        // Date 转为 String
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss SSSS");
        //格式化调用SimpleDateFormat类中的format方法，格式化之后日期由Date类型转换为String类型
        String sDate = dateFormat.format(nowTime);
        System.out.println(sDate);

        //String 转为 Datec
        String sDate2 = "2019-07-07 11:11:11 111";
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss SSS");
        Date date1 = new Date();

        try {
            date1 = dateFormat2.parse(sDate2);
        }catch (Exception e){
            System.out.println("时间转换异常 " + new Date() + e);
        }
        System.out.println(date1);

        /*获取系统当前时间的前10分钟时间
        * Date的构造方法可以传一个long类型的入参，指代1970-01-01 00:00:00 000之后的毫秒数
        * System.currentTimeMillis()方法可获得系统当前时间对应的毫秒数
        * */
        Date date2 = new Date(System.currentTimeMillis() - 1000 * 60 * 10);
        System.out.println(dateFormat2.format(date2));
        System.out.println(dateFormat2.format(new Date()));
        /**
         * 日历的操作
         * - 类：java.util.Calendar
         * */
        // 获取指定日期当天的日历
        Date date3 = new Date();
        try {
            date3 = new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-11");
        }catch (Exception e){
            System.out.println("时间转换异常 " + new Date() + e);
        }
        // 获取系统当前日历
        Calendar c = Calendar.getInstance();
        // 获取date3的日历
        c.setTime(date3);

        System.out.println(date3.toString() + "是一周中的第" + c.get(Calendar.DAY_OF_WEEK) + "天");
        System.out.println(date3.toString() + "是第" + c.get(Calendar.DAY_OF_MONTH) + "天");

    }

}
