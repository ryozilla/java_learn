package train5;

import methods.Array;

import java.util.Scanner;

/*
 * 数独
 * 将1~9的数字放入一个3×3的数组中，判断数组每行每列以及每个对角线的值相加是否都相同。
 * ----------------
 * 8 1 6
 * 3 5 7
 * 9 4 2
 * 上述二维数组满足条件
 * */
public class Complex1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] sodoku = new int[3][3];
        for (int i = 0; i < sodoku.length; i++) {
            for (int j = 0; j < sodoku[i].length; j++) {
                System.out.println("请输入第" + (i + 1) + "行，第" + (j + 1) + "列的数");
                sodoku[i][j] = scan.nextInt();
            }
        }

        Array.printArray(sodoku);

        //计算和
        int[] sum = new int[8];
        sum[0] = sodoku[0][0] + sodoku[1][1] + sodoku[2][2];
        sum[1] = sodoku[0][2] + sodoku[1][1] + sodoku[2][0];
        //横向
        sum[2] = sodoku[0][0] + sodoku[0][1] + sodoku[0][2];
        sum[3] = sodoku[1][0] + sodoku[1][1] + sodoku[1][2];
        sum[4] = sodoku[2][0] + sodoku[2][1] + sodoku[2][2];
        //纵向
        sum[5] = sodoku[0][0] + sodoku[1][0] + sodoku[2][0];
        sum[6] = sodoku[0][1] + sodoku[1][1] + sodoku[2][1];
        sum[7] = sodoku[0][2] + sodoku[1][2] + sodoku[2][2];

        //判断相等
        for (int i = 1; i < sum.length; i++) {
            if (sum[0] == sum[i]) {

            } else {
                System.out.println("数组每行每列以及每个对角线的值相加不相同");
                break;
            }
            if (i == 7) {
                System.out.println("数组每行每列以及每个对角线的值相加相同");
                break;
            }
        }
    }
}
