package train.t11;

import MyException.NumberErrorException;

import java.util.Scanner;

/*
 * 边长可变的正方形
 * 根据用户输入的数字，打印出对应边长的由“*”字符组成的正方形。
 * */
public class Training7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入想打印的正方形边长：");
        int input = scan.nextInt();
        try {
            printSquare(input);
        }catch (NumberErrorException e){
            e.printStackTrace();
        }
    }

    protected static void printSquare(int length) throws NumberErrorException {
        if (length <= 0) {
            throw new NumberErrorException("边长不能为0或负数");
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
