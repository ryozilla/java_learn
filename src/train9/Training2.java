package train9;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 校验银行取款金額
 * 使用 try - catch 語句块和 finally 语句块模拟一个取款过程。
 * 某个银行账号现有余额1023.79元，且银行规定每次取款金额必须是整数，
 * 当在控制台上输入的取款金额不是整数时，会捕捉到数字格式转换异常。
 * */
public class Training2 {
    static Scanner scan = new Scanner(System.in);
    static double overage = 1023.79;

    public static void main(String[] args) {
        System.out.println("取款");
        System.out.println("余额：" + overage);
        System.out.print("请输入取款金额: ");
        try {
            int money = scan.nextInt();
            if (money < 0) {
                System.out.println("数值错误！");
            } else if (money > 1028) {
                System.out.println("余额不足");
            } else {
                overage -= money;
                System.out.println("余额：" + overage);
            }
        } catch (InputMismatchException e) {
            System.out.println("已执行catch语句中的代码");
            System.out.println("发生数字格式转换异常");
            e.printStackTrace();
        }
    }
}
