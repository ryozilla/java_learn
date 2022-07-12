package train6;

import java.util.Scanner;

/*
 * 厘米与英寸互转
 * */
public class Complex4 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("厘米与英寸互转工具");
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入想转换的数字：");
            double num = scan.nextDouble();
            System.out.println("这个数字的单位是英寸(1)还是厘米(2)?");
            int type = scan.nextInt();

            Tools tool = new Tools(num, type);
        }
    }
}

class Tools {
    double in;
    double cm;

    protected Tools(double num, int type) {
        //构造方法
        //同时通过构造方法调用英寸厘米转换方法
        if (type == 1) {
            this.in = num;
            this.cm = inchToCenti(in);
            System.out.println(in + "英寸 = " + cm + "厘米");
        } else if (type == 2) {
            this.cm = num;
            this.in = centiToInch(cm);
            System.out.println(cm + "厘米 = " + in + "英寸");
        } else {
            System.out.println("type值错误！");
        }
    }

    private static double inchToCenti(double in) {
        return in * 2.54;
    }

    private static double centiToInch(double cm) {
        return cm / 2.54;
    }
}
