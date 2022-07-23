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
            System.out.println(Maths.calcGCD(3, 5));
            System.out.println(Maths.calcGCD(4, 8));
            System.out.println(Maths.calcGCD(9, -6));
        } catch (NumberErrorException e) {
            e.printStackTrace();
        }
    }
}