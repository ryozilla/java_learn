package train9;

import MyException.NumberErrorException;

import java.util.Scanner;

/*
 * 价格调控
 * 当某种商品的价格过高时，国家会对这种商品采取宏观调控，进而使得这种商品的价格趋于稳定。
 * 编写一个程序，使用 throw 关键字模拟上述生活场景：
 * 规定西红柿单价不得超过7元，超过7元的情况作为异常抛出
 * */
public class Training6 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("西红柿单价：");
        double price = scan.nextDouble();
        try {
            isPriceCorrect(price);
        } catch (NumberErrorException e) {
            throw new RuntimeException(e);
        }
    }

    protected static void isPriceCorrect(double price) throws NumberErrorException {
        if (price <= 0) {
            throw new NumberErrorException("价格不能小于0");
        } else if (price > 7) {
            throw new NumberErrorException("国家规定西红柿单价不得超过7元");
        } else {
            System.out.println("价格为" + ((double) Math.round(price * 100) / 100));
        }
    }
}
