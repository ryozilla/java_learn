package methods;

// 排列 组合
public class Math {
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

    public static int arrangement(int n, int m) {
        //排列数
        if (n < m) {
            System.out.println("输入数值有误，请重新输入");
            System.exit(1);
        }

        int result = 1;
        for (int i = 0; i < m; i++) {
            result *= n - i;
        }

        //return factorial(n) / factorial(n - m);
        return result;
    }

    public static int combination(int n, int m) {
        //组合数
        return arrangement(n, m) / factorial(m);
    }
}
