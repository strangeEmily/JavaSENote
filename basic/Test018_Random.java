package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Random 生成随机数
 * */
public class Test018_Random {
    public static void main(String[] args){
        // 创建一个随机数生成器
        Random random = new Random();

        // 生成一个int类型的随机数
        int i1 = random.nextInt(101);//101指代生成的随机数在0-100之间
        System.out.println(i1);

        // 循环生成5个0-100之间的随机数
        int i2 = 0;
        while (i2 < 5){
            i2++;
            System.out.println(random.nextInt(101));
        }

        // 循环生成5个1-9之间的不重复的随机数
        Integer[] ar = new Integer[5];

        int i3= 0;
        while (i3 < 5){
            int temp = random.nextInt(9);
            //***注意！！！ 此处有坑
            // contains的入参是object类型，所以当int类型的temp被传进去时会被自动装箱为一个Integer类型的对象，如果
            // 将数组定义为int型就意味着在int[]中寻找Integer类型的元素 无论如何结果都会是false
            if (!Arrays.asList(ar).contains(temp) && temp != 0) {
                ar[i3] = temp;
                i3++;
            }
        }
        for (int i = 0;i < ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
