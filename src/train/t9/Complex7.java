package train.t9;

import MyException.NumberErrorException;

/*
 * 中断循环
 * 编写使用 for 循环在控制台上输出0~9的代码。
 * 代码要实现以下两个功能：
 * 当循环变量的值为2时，抛出异常，循环中断;
 * 当循环变量的值为2时，虽然会抛出异常，但是循环不会中断。
 * */
public class Complex7 {
    public static void main(String[] args) {
        circulation1();
        System.out.println("-----------------");
        circulation2();
    }

    protected static void circulation1() {
        //当循环变量的值为2时，抛出异常，循环中断
        try {
            for (int i = 0; i < 10; i++) {
                if (i == 2) {
                    throw new NumberErrorException("本题规定循环数字不能为2！");
                }
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected static void circulation2() {
        //当循环变量的值为2时，虽然会抛出异常，但是循环不会中断
        for (int i = 0; i < 10; i++) {
            try {
                if (i == 2) {
                    throw new NumberErrorException("本题规定循环数字不能为2！");
                }
                System.out.println(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
