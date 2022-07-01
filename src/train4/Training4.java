package train4;
/*
 * 斐波那契数列
 * 1、1、2、3、5、8、13、21、34、…是一组典型的斐波那契数列，前两数相加等于第三个数。
 * 那么请问这组数中的第 n 个数的值是多少？
 * */

import java.util.Scanner;

public class Training4 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入你想查看斐波那契数列中的哪一位：");
        int in = scan.nextInt();

        double num1 = 1, num2 = 1;
        double result;
        if (in == num1) {
            result = num1;
        } else if (in == num2) {
            result = num2;
        } else {
            for (int i = 2; i < in; i++) {
                double temp = num1;
                num1 += num2;
                num2 = temp;
                // 计算第三位数时，temp暂存num1（第一个数）的数值，num1加上num2结果第三个数，num2再获得temp（也就是第一个数）的数值。
                // num1 = 三; num2 = 一; result = 三;
                // 计算第四位数时，temp暂存num1（第三个数）的数值，num1加上num2结果第四个数，num2再获得temp（也就是第三个数）的数值。
                // num1 = 四; num2 = 三; result = 四;
                // 计算第五位数时，temp暂存num1（第四个数）的数值，num1加上num2结果第五个数，num2再获得temp（也就是第四个数）的数值。
                // num1 = 五; num2 = 四; result = 五;
            }
            result = num1;
        }

        System.out.println("值为： " + result);
    }
}
