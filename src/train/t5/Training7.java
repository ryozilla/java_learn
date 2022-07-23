package train.t5;
/*
 * 成绩排名（一）
 * 10名学生在一次英语竞赛中的成绩分别为71、89、67、53、78、64、92、56、74和85，
 * 使用冒泡排序编写一个程序，将这10名学生的英语竞赛成绩由小到大进行排序。
 * */

import methods.Array;

public class Training7 {
    public static void main(String[] args) {
        int[] score = new int[]{71, 89, 67, 53, 78, 64, 92, 56, 74, 85};
        sort(score);
        Array.printArray(score);
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                //比较相邻的两个元素
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
