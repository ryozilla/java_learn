package methods;

import MyException.NumberErrorException;

// 排列 组合
public class Maths {
    public static double factorial(int x) throws NumberErrorException {
        if (x < 0) {
            throw new NumberErrorException("x不能小于0");
        }

        //计算阶乘
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static double arrangement(int n, int m) throws NumberErrorException {
        //排列数
        if (n < m) {
            throw new NumberErrorException("n不能小于m");
        }

        if (m == 0) {
            return 1;
        }
        return n * arrangement(n - 1, m - 1);
    }

    public static double combination(int n, int m) throws NumberErrorException {
        //组合数
        return arrangement(n, m) / factorial(m);
    }

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

    public static int calcGCD(int x, int y) throws NumberErrorException {
        //计算两个数的最大公因数
        //判断数字是否为负整数
        if (x < 0) {
            throw new NumberErrorException("输入的数不应该为负整数: x = " + x);
        } else if (y < 0) {
            throw new NumberErrorException("输入的数不应该为负整数: y = " + y);
        }

        //主方法
        if (x == y) {
            //两数相等
            return x;
        } else if (isPrime(x) && isPrime(y)) {
            //两数同为质数
            return 1;
        } else {
            /*
             * 辗转相除法
             * a ÷ b = num …… c
             * b -> a , c -> b;
             * 循环至c = 0为止
             * */
            //从大到小排序
            int a, b, c;
            if (x > y) {
                a = x;
                b = y;
            } else {
                a = y;
                b = x;
            }
            //循环求最大公因数
            while (true) {
                c = a % b;
                if (c == 0) {
                    return b;
                }
                a = b;
                b = c;
            }
        }
    }
}
