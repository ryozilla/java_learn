package train.t4;

/*
 * 无重复组合
 * 使用 for 循环，在控制台输出由4、5、6、7能组成多少个互不相同且无重复数字的三位数？都是多少？
 * */
public class Complex4 {
    public static void main(String[] args) {
        for (int a = 4; a <= 7; a++) {
            for (int b = 4; b <= 7; b++) {
                if (b == a) {
                    continue;
                }
                for (int c = 4; c <= 7; c++) {
                    if (c == a || c == b) {
                        continue;
                    }
                    System.out.println("数为" + a + b + c);
                }
            }
        }
    }
}
