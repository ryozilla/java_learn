package train.t11;

import java.util.Scanner;

/*
 * 模拟用户登录
 * 如果用户输入的用户名为 mr ，输入的密码为123456，则提示登录成功。
 * */
public class Training8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入账号: ");
        String account = scan.next();
        System.out.print("请输入密码: ");
        String psw = scan.next();
        login(account, psw);
    }

    private static void login(String account, String psw) {
        if (account.equals("mr") && psw.equals("123456")) {
            System.out.println("登陆成功");
        } else {
            System.out.println("账号或密码输入错误");
        }
    }
}
