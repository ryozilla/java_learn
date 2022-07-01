package test;

import java.util.Scanner;

public class WhileTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //while语句
        int num1 = 0;
        while (num1 < 10) {
            //System.out.println("num1 = " + num1);
            num1++;
        }

        //do while语句
        int pwd = 887629;
        int input;
        do {
            System.out.println("请输入6位数密码：");
            input = scan.nextInt();
            if (input != pwd) {
                System.out.println("密码错误，请重新登陆");
            } else {
                System.out.println("登陆成功");
            }
        } while (input != pwd);

    }
}
