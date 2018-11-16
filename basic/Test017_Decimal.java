package basic;

import javax.swing.plaf.basic.BasicIconFactory;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.math.BigDecimal;
/**
 * 1. 数字格式化  DecimalFormat
 *    - 类：java.text.DecimalFormat
 *    - 数字格式标识符
 *      #  任意数字
 *      ,  千分位
 *      .  小数点
 *      0  位数不够时补0
 * 2. 大数据 BigDecimal
 *    - 该类型数据精度很高，当运算所得数据精度double型无法满足时可使用此数据类型
 * */
public class Test017_Decimal {
    public static void main(String[] args){
        //创建数字格式化对象
        //加入千分位标识
        DecimalFormat df1 = new DecimalFormat("###,###");
        System.out.println(df1.format(1342357));
        //加入千分位并保留两位小数
        DecimalFormat df2 = new DecimalFormat("###,###.##");
        System.out.println(df2.format(4554237.566));
        //加入千分位并保留4位小数，在位数不够时补零
        DecimalFormat df3 = new DecimalFormat("###,###.0000");
        System.out.println(df3.format(899335435.64));
        // 注意：格式化之后数字类型的数据变成了String类型
        /**
         * 使用BigDecimal进行加减乘除运算
         * 注意：
         * */
         /*BigDecimal bd = new BigDecimal(3445.243344567).add(new BigDecimal(43545.45566576745));
         上面算出的结果会有精度丢失，因为3445.243344567和43545.45566576745会被当成double型数据处理，在加法运算之前就已经丢失了精度，
         需要先转换成string类型再作为入参传给BigDecimal的构造方法*/
        // 加法
        System.out.println(new BigDecimal("3445.243344567").add(new BigDecimal("43545.45566576745")));
        // 减法
        System.out.println(new BigDecimal("3445.243344567").subtract(new BigDecimal("43545.45566576745")));
        // 乘法
        System.out.println(new BigDecimal("3445.243344567").multiply(new BigDecimal("43545.45566576745")).setScale(10,BigDecimal.ROUND_DOWN));
        // 除法divide(数值，小数位保留位数，截断原则)
        System.out.println(new BigDecimal("3445.243344567").divide(new BigDecimal("43545.45566576745"),10,BigDecimal.ROUND_DOWN));
    }
}
