package train5;

import methods.Array;
import methods.Math;

import java.util.Scanner;

/*
 * 输出杨辉三角
 * */
public class Complex3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入想打印的杨辉三角的行数：");
        int input = scan.nextInt();
        if (input < 0 || input > 10) {
            System.out.println("请重新输入数值");
            System.exit(1);
        }

        //准备输出杨辉三角
        int[][] yanghui = new int[input][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            for (int j = 0; j < yanghui[i].length; j++) {
                yanghui[i][j] = Math.combination(i, j);
            }
        }
        Array.printArray(yanghui);
    }
}
