package train.t9;

import MyException.NumberErrorException;

import java.util.Scanner;

/*
 * 超市限购
 * 超市经常会对定价较市场价低的产品实施限购：
 * 超市里的鲜鸡蛋每500克3.98元，每人限购1500克。
 * 现将超过1500克的作为异常抛出，而对于满足条件的，计算出应付款。
 * */
public class Training4 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入购买鸡蛋的克数（3.98/500g）:");
        try {
            int cost = scan.nextInt();
            double money = buyEgg(cost);
            if (money != 0) {
                System.out.println("价格为：" + money);
            }
        } catch (NumberErrorException e) {
            e.printStackTrace();
        }
    }

    protected static double buyEgg(int g) throws NumberErrorException {
        if (g < 0) {
            System.out.println("谢谢你送我鸡蛋，但我不要");
        } else if (g > 1500) {
            throw new NumberErrorException("鸡蛋限购1500克");
        } else if (g % 500 != 0) {
            System.out.println("鸡蛋要500克一买");
        } else {
            return g / 500 * 3.98;
        }
        return 0;
    }
}
