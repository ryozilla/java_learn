package train6;

import java.util.Scanner;

/*
 * 水池放水
 * 创建一个水池类，在类中先定义一个静态变量表示水池中的水量，并初始化为0；
 * 再定义两个静态方法，即注水（一次注入3个单位）方法和放水（一次放出2个单位）方法。
 * 通过调用这两个静态方法，控制水池中的水量。
 * */
public class Training6 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Pool.getWaterVolume();
        while (true) {
            System.out.println("你可以控制抽水(t)还是放水(f)");
            String input = scan.next();
            switch (input) {
                case "t" -> Pool.inwater();
                case "f" -> Pool.outwater();
                case "getWaterVolume" -> Pool.getWaterVolume();     //只要你愿意打就可以只一直查看水池有多少水（
                case "exit" -> System.exit(114514);
                default -> System.out.println("输入有误，请重新输入");
            }
        }

    }
}

class Pool {
    static int waterVolume = 0;

    public static void inwater() {
        int num = waterVolume + 3;      //用来判断水会不会溢出的变量
        if (num > 30) {
            System.out.println("水要漫出来啦！");
        } else {
            waterVolume += 3;
            getWaterVolume();
        }
    }

    public static void outwater() {
        int num = waterVolume - 2;      //用来判断水够不够放的变量
        if (num < 0) {
            System.out.println("没法再放水啦！");
        } else {
            waterVolume -= 2;
            getWaterVolume();
        }
    }

    public static void getWaterVolume() {
        System.out.println("现在的水量为：" + waterVolume + "个单位。");
    }
}
