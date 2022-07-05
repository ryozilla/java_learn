package train5;
/*
 * 成绩排名（二）
 * 将“训练7”中的10名学生的英语竞赛成绩由大到小进行排序。
 * */

import methods.Array;

public class Training8 {
    public static void main(String[] args) {
        //获得Training7一致的数组
        int[] score = new int[]{71, 89, 67, 53, 78, 64, 92, 56, 74, 85};
        Training7.sort(score);
        Array.printArray(score);

        reverseSort(score);
        Array.printArray(score);
    }

    public static void reverseSort(int[] arr) {
        //反转数组顺序
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
    }
}
