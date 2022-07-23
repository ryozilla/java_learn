package train.t4;

/*
 * 百钱买百鸡
 * 5文钱可以买一只公鸡，3文钱可以买1只母鸡，1文钱可以买3只雏鸡
 * 现在用100文钱买100只鸡，那么公鸡、母鸡、雏鸡各有多少只？
 * */
public class Complex8 {
    public static void main(String[] args) {
        // x + y + z = 100;
        // 5x + 3y + (1/3)z = 100;
        // 即 7x + 4y = 100

        /*
        // x -> 公鸡 , y -> 母鸡 , z -> 雏鸡
        for (int x = 0; x < 20; x++) {
            double yy = (100 - 7 * x) * 0.25;
            int y = (int) yy;
            int z = 100 - x - y;
            if (y != yy) {
                continue;
            } else if (y < 0) {
                break;
            }
            System.out.println("x = " + x + " ; y = " + y + " ; z = " + z);
            int money = 5 * x + 3 * y + z / 3;
            System.out.println("所花费用为：" + money);
        }
        */

        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 33; y++) {
                for (int z = 0; z < 99; z += 3) {
                    if (x + y + z == 100) {
                        if (5 * x + 3 * y + z / 3 == 100) {
                            System.out.println("x = " + x + " ; y = " + y + " ; z = " + z);
                        }
                    }
                }
            }
        }
    }
}
