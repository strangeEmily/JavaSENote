package array;

import java.util.Scanner;

/**
 * 二维数组
 * 1.特点：是一种特殊的一维数组，特殊在于数组中的每个元素都是一个一维数组
 * */
public class ArrayTest03_TwoDimension {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("Hi,"+name);
        //静态初始化
        int[][] a1 = {
                {1,3,5},
                {7,9,2},
                {2,6,8}
        };
        //动态初始化
        int[][] a2 = new int[3][4];
        //获取二维数组的第一个数组和第一个数组中的第一个元素
        System.out.println(a1[1]);
        System.out.println(a1[1][1]);
        //获取二维数组的最后一个数组和其中的最后一个元素
        System.out.println(a1[a1.length-1]);
        System.out.println(a1[a1.length-1][a1[a1.length-1].length-1]);
        //循环遍历二维数组
        for (int i = 0;i < a1.length;i++){
            for (int j = 0;j < a1[i].length;j++){
                System.out.println(a1[i][j]);
            }
        }

        System.out.println("=========================");
        for (int i = 0;i < a2.length;i++){
            for (int j = 0;j < a2[i].length;j++){
                System.out.println(a2[i][j]);
            }
        }

        //方法调用时的二维数组传参
        m1(new int[][]{{1,1,1},{2,2,2},{3,3,3}});

    }
    private static void m1(int[][] a){
        System.out.println("===========");
        for (int i = 0;i < a.length;i++){
            for (int j = 0;j < a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
