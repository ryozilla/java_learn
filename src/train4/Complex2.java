package train4;

/*
 * 输出菱形
 * 编写 Java 程序，使用 for 循环打印菱形
 * */
public class Complex2 {
    public static void main(String[] args) {
        String str1 = "  ";
        String str2 = "* ";

        //上半部分菱形
        for (int i = 0; i < 10; i++) {
            int j = 0;
            int k = 0;
            while (j < (10 - i)) {
                System.out.print(str1);
                j++;
            }
            while (k < (i * 2 - 1)) {
                System.out.print(str2);
                k++;
            }
            System.out.println();
        }

        //下半部分菱形
        for (int i = 8; i > 0; i--) {
            int j = 0;
            int k = 0;
            while (j < (10 - i)) {
                System.out.print(str1);
                j++;
            }
            while (k < (2 * i - 1)) {
                System.out.print(str2);
                k++;
            }
            System.out.println();
        }
    }
}
