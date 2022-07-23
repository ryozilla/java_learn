package train.t7;

import java.util.Scanner;

/*
 * 购物车
 * 某商品单价580元，购买两件或多于两件的该商品享8折优惠。
 * 在控制台上输入购买商品的数量，编写两个同名的 pay() 方法，
 * 一个方法用于输出购买一件商品的应付金额；另一个方法用于输出购买两件或多于两件商品的应付金额。
 * 折扣
 * */
public class Training9 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int price = 580;
        double discount = 0.8;
        System.out.println("请输入你想购买的件数");
        int input = scan.nextInt();

        if (input == 1) {
            System.out.println("价格为：" + pay(input, price));
        } else {
            System.out.println("价格为：" + pay(input, price, discount));
        }
    }

    protected static double pay(int amount, int price) {
        return amount * price;
    }

    protected static double pay(int amount, int price, double discount) {
        return amount * price * discount;
    }

}
