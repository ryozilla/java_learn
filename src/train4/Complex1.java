package train4;

import java.util.Scanner;

/*
 * 判断奇偶数
 * 编写 Java 程序，实现判断变量 x 是奇数还是偶数。
 *
 * */
public class Complex1 {
    static Scanner scan = new Scanner(System.in);

    public static String whatOdd(int x) {
        int valve = x % 2;
        return (valve == 0) ? "此数是偶数" : "此数是奇数";
//        if (valve == 0) {
//            return "此数是偶数";
//        } else {
//            return "此数是奇数";
//        }
    }

    public static void main(String[] args) {
        System.out.println("判断数的奇偶");
        System.out.println("请在下面输入一个整数：");
        int input = scan.nextInt();
        String result = whatOdd(input);
        System.out.println(result);
    }
}
