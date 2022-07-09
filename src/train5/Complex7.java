package train5;

import methods.Array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 模拟大车售票
 * 9排4列
 * 1代表有票，0代表没票
 * */
public class Complex7 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] car = new int[9][4];
        for (int i = 0; i < car.length; i++) {
            Arrays.fill(car[i], 1);
        }
        printCar(car);

        System.out.println("请输入你想预约的排数：");
        int line = scan.nextInt();
        System.out.println("请输入你想预约的列数：");
        int row = scan.nextInt();
        car[line - 1][row - 1] = 0;
        System.out.println("预约成功");
        printCar(car);
    }

    private static void printCar(int[][] car) {
        System.out.println("简单客车售票系统");
        System.out.println("9排4列客车开始卖票");
        System.out.println("---------------");
        Array.printArray(car);
    }
}
