package train.t10;

import java.util.Scanner;

/*
 * 用户名校验
 * 用户注册某网站账号，该网站已注册的用户名为 mrsoft、mr、miss和Admin 。
 * 如果用户申请的用户名已被他人注册，则注册失败并给予用户提示。
 * */
public class Complex8 {
    static Scanner scan = new Scanner(System.in);
    static String[] account = new String[]{"mrsoft", "mr", "miss", "Admin"};

    public static void main(String[] args) {
        System.out.println("申请账号\n请输入账号：");
        String input = scan.next();
        createAccount(input);
    }

    private static void createAccount(String acc) {
        for (String str : account) {
            if (acc.equals(str)) {
                System.out.println("账号名重复，请重新输入");
                return;
            }
        }
        System.out.println("申请成功");
    }
}
