package train3;

import java.util.Scanner;

/*
 * 求解二元一次方程组
 *  21.8x + 2y =  28;
 *  7x + 8y = 62
 * */
public class Training6 {
    static Scanner scan = new Scanner(System.in);

    protected static void TwoYuanFunction(double a, double b, double c, double d, double e, double f) {
        // ax + by = c;
        // ex + fy = g;
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        System.out.println("ax + by = c;");
        System.out.println("ex + fy = g;");

        //输入
        System.out.println("输入 a :");
        double a = scan.nextDouble();
        System.out.println("输入 b :");
        double b = scan.nextDouble();
        System.out.println("输入 c :");
        double c = scan.nextDouble();
        System.out.println("输入 d :");
        double d = scan.nextDouble();
        System.out.println("输入 e :");
        double e = scan.nextDouble();
        System.out.println("输入 f :");
        double f = scan.nextDouble();

        //执行
        TwoYuanFunction(a, b, c, d, e, f);
    }
}
