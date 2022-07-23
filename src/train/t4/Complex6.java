package train.t4;

import java.util.Scanner;

/*
 * 判断生肖
 * 使用 switch 多分支语句判断某一年对应的中国生肖。
 * 鼠、牛、虎、兔、龙、蛇、马、羊、猴、鸡、狗、猪
 * */
public class Complex6 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入年份以查看对应生肖：");
        int year = scan.nextInt();
        String result = switch (Math.abs(year % 12)) {
            case 0 -> "猴";
            case 1 -> "鸡";
            case 2 -> "狗";
            case 3 -> "猪";
            case 4 -> "鼠";
            case 5 -> "牛";
            case 6 -> "虎";
            case 7 -> "兔";
            case 8 -> "龙";
            case 9 -> "蛇";
            case 10 -> "马";
            case 11 -> "羊";
            default -> throw new IllegalStateException("Unexpected value: " + year % 12);
        };
        System.out.println(year + "年为" + result + "年");
    }
}
