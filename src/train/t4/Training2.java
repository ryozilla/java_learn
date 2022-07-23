package train.t4;

import java.util.Scanner;

/*
 * 判断月份对应的季节
 * 使用 switch 多分支语句判断某个月份属于哪个季节。
 * */
public class Training2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入月份以查看月份（阿拉伯数字）");
        int month = scan.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("春");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬");
                break;
            default:
                System.out.println("月份输入错误");
                break;
        }
    }
}
