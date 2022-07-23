package train.t4;

import java.lang.Math;

/*
 *查找素数
 * 使用 for 循环，判断1~100有多少个素数，并在控制台上输出所有素数。
 * */
public class Complex5 {
    public static boolean isPrime(int n) {
        //1、0和负数不是质数。
        if (n == 1) {
            return false;
        } else if (n <= 0) {
            System.out.println("0和负数不是质数,请重新输入");
            System.exit(1);
        }

        //计算只用 1 < n < 根号n 取余的方式节省时间
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int result = n % i;
            if (result == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (isPrime(i)) {
                System.out.println(i + "是质数");
                sum++;
            } else {
                System.out.println(i + "不是质数");
            }
        }

        System.out.println("1~100中共有" + sum + "个质数");
    }
}