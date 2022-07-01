import xiaozhe.Math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] arr = Math.twoYuanFunction(1, 1, 10, 3, 4, 34);
        System.out.println("x = " + arr[0]);
        System.out.println("y = " + arr[1]);

        System.out.println("请输入一个大于0的数");
        int input = scan.nextInt();
        Math.isPrimeNum(input);
        if (Math.isPrimeNum(input)) {
            System.out.println(input + "是质数");
        } else {
            System.out.println(input + "不是质数");
        }

        System.out.println("8! = " + Math.factorial(8));
    }
}
