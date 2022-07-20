package methods;

import MyException.NumberErrorException;

// 排列 组合
public class Math {
    public static double factorial(int x) throws NumberErrorException {
        if (x < 0) {
            throw new NumberErrorException("x不能小于0");
        }

        //计算阶乘
        int i = 0;
        double result = 1;
        while (i < x) {
            i++;
            result *= i;
        }
        return result;
    }

    public static double arrangement(int n, int m) throws NumberErrorException {
        //排列数
        if (n < m) {
            throw new NumberErrorException("n不能小于m");
        }

        double result = 1;
        for (int i = 0; i < m; i++) {
            result *= n - i;
        }

        //return factorial(n) / factorial(n - m);
        return result;
    }

    public static double combination(int n, int m) throws NumberErrorException {
        //组合数
        return arrangement(n, m) / factorial(m);
    }
}
