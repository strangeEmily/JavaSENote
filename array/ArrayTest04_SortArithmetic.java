package array;

import java.util.Scanner;
import java.util.Arrays;

/**
 * ******冒泡排序*************
 * 1.原理
 *   - 比较两个相邻的元素，将值大的元素交换至右端。
 *   - 排除最右边的元素对其他元素重新进行以上对比直到全部排序完成
 * 2.缺点
 *   - 效率低【因为每次比较都需要交换一次位置】
 * ******选择排序*************
 * 原理
 *   - 每趟从待排序序列中挑出最小的元素，放在已排序列表的末尾
 *   - 排除末尾元素对其他元素重复以上操作直到全部记录排序完成
 * ******二分法查找************
 * 1.原理
 *   - 假设数据是按升序排序的，对于给定值 x，从序列的中间位置开始比较，如果当前位置值等于 x，则查找成功；
 *   - 若 x 小于当前位置值，则在数列的前半段中查找；若 x 大于当前位置值则在数列的后半段中继续查找，直到找到为止
 * 2.条件
 *   - 数列已排序
 *   - 数列无重复值
 * */
public class ArrayTest04_SortArithmetic {
    public static void main(String[] args){
        /**
         * 冒泡排序
        * */
        int[] a = {3, 6, 2, 7, 9, 0};

        for (int i = a.length - 1;i > 0; i--){
            for (int j = 0;j < i; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length;i++){
            System.out.println(a[i]);
        }
        /**
         * 选择排序
        * */
        int[] b = {3, 6, 2, 7, 9, 0, 13, 52, 64, 35};
        for(int i = b.length -1; i > 0;i--){
            int max = 0;
            int temp = b[i];
            for(int j = 0; j < i;j++){
                if (b[max] < b[j+1]){
                    max = j+1;
                }
            }
            b[i] = b[max];
            b[max] = temp;

        }

        System.out.println("======================");

        for (int i = 0; i < b.length;i++){
            System.out.println(b[i]);
        }

        /**
         * 二分法查找
        * */
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你要查找的数字：");
        int x = s.nextInt();

        int begin = 0;
        int end = b.length - 1;
        while (begin <= end){
            int mid = ( begin + end ) / 2;
            if (b[mid] == x){
                System.out.println("该数字在数组中的下标为："+ mid);
                return;
            }else if (b[mid] > x){
                end = mid - 1;
            }else if (b[mid] < x){
                begin = begin + 1;
            }
        }
        System.out.println("该数字在数组中不存在");

        /**
         * 使用java.util.Arrays工具类进行排序和二分查找的操作
        * */
        int[] c =  {54, 65, 32, 78, 61, 4, 23, 69};
        //排序
        System.out.println("========================");
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
        System.out.println("请输入要查找的数字：");
        int y = s.nextInt();
        int index =  Arrays.binarySearch(c,y);
        System.out.println("数字" + y + "的下标为："+index);
    }
}
