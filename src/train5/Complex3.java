package train5;

import methods.Math;
import MyException.NumberErrorException;

import java.util.Scanner;

/*
 * 输出杨辉三角
 * */
public class Complex3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws NumberErrorException {
        System.out.println("请输入想打印的杨辉三角的行数：");
        int input = scan.nextInt();
        /*if (input < 0 || input > 14) {
            throw new NumberErrorException("数值过大");
        }*/

        //准备输出杨辉三角
        double[][] yanghui = new double[input][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new double[i + 1];
            for (int j = 0; j < yanghui[i].length; j++) {
                yanghui[i][j] = Math.combination(i, j);
            }
        }
        printYanghui(yanghui);
    }

    public static void printYanghui(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "：");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
