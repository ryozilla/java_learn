package train.t9;

import MyException.NumberErrorException;
import methods.Maths;   //计算最大公约数方法所在处

/*
 * 计算最大公约数
 * 创建 computer 类，该类中有一个计算两个数的最大公约数的方法，
 * 如果向该方法传递负整数，该方法就会抛出自定义异常。
 * */
public class Complex8 {
    public static void main(String[] args) {
        try {
            System.out.println(calcGCD(3, 5));
            System.out.println(calcGCD(4, 8));
            System.out.println(calcGCD(9, -6));
        } catch (NumberErrorException e) {
            e.printStackTrace();
        }
    }

    private static int calcGCD(int x, int y) throws NumberErrorException {
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
        } else if (Maths.isPrime(x) && Maths.isPrime(y)) {
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
            int a, b;
            if (x > y) {
                a = x;
                b = y;
            } else {
                a = y;
                b = x;
            }
            return GCD(a, b);
        }
    }

    private static int GCD(int a, int b) {
        int c = a % b;
        if (c == 0) {
            return b;
        }

        return GCD(b,c);
    }
}