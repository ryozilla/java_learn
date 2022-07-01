package xiaozhe;

public class Math {
    public static double[] twoYuanFunction(double a, double b, double c, double d, double e, double f) {
        // ax + by = c;
        // ex + fy = g;
        //double x = (e * d - b * f) / (a * d - b * c);
        //double y = (a * f - e * c) / (a * d - b * c);
        double x = (c * e - f * b) / (a * e - d * b);
        double y = (c * d - a * f) / (b * d - a * e);
        return new double[]{x, y};
    }

    public static boolean isPrimeNum(int n) {
        //1、0和负数不是质数。
        if (n == 1) {
            return false;
        } else if (n <= 0) {
            System.out.println("0和负数不是质数,请重新输入");
            System.exit(1);
        }

        //计算只用 1 < n < 根号n 取余的方式节省时间
        for (int i = 2; i <= java.lang.Math.sqrt(n); i++) {
            int result = n % i;
            if (result == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int x) {
        if (x < 0) {
            System.out.println("输入数值有误，请重新输入");
            System.exit(1);
        }

        //计算阶乘
        int i = 0;
        int result = 1;
        while (i < x) {
            i++;
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
