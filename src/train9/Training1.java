package train9;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 简易计算器
 * 模拟一个简单的计算器（只能计算两个整数的加减乘除）
 * 使用try-catch块捕捉InputMismatchException（控制台输入的不是整数）异常
 * */
public class Training1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入三个参数：字符串type,和两个整数x,y");
        System.out.println("%+为加，%-为减，%*为乘，%/为除");
        for (int i = 0; i < 10; i++) {
            //for循环持续计算
            try {
                //接收参数
                System.out.print("type: ");
                String type = scan.next();
                System.out.print("x: ");
                int x = scan.nextInt();
                System.out.print("y: ");
                int y = scan.nextInt();
                //计算方法
                simpleCalculator(type, x, y);
            } catch (InputMismatchException e) {
                System.out.println("已执行catch语句中的代码");
                throw new RuntimeException(e);
            }
        }
    }

    protected static void simpleCalculator(String type, int x, int y) throws InputMismatchException {
        switch (type) {
            case "%+" ->
                /*加*/
                    System.out.println("x + y = " + plus(x, y));
            case "%-" ->
                /*减*/
                    System.out.println("x - y = " + subtract(x, y));
            case "%*" ->
                /*乘*/
                    System.out.println("x * y = " + multiply(x, y));
            case "%/" ->
                /*除*/
                    System.out.println("x / y = " + division(x, y));
            default -> System.out.println("?");
        }
    }

    private static int plus(int x, int y) {
        return x + y;
    }

    private static int subtract(int x, int y) {
        return x - y;
    }

    private static int multiply(int x, int y) {
        return x * y;
    }

    private static double division(int x, int y) {
        double result = (double) x / y;
        return Math.round(result * 100) / 100.0;    //保留两位小数
    }
}
