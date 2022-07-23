package train.t7;

/*
 * 大写转小写
 * 定义一个值为66的整数，编写两个同名的 print()方法，
 * 一个方法用于输出在 ASCⅡ 表中这个整数对应的大写字母，
 * 另一个方法用于输出这个大写字母对应的小写字母。
 * 运行结果如下：
 * 在 ASCⅡ 表中，66对应的大写字母是 B 。
 * B 的小写字母是 b 。
 */
public class Training10 {
    public static void main(String[] args) {
        char B = print(66);
        String b = print(B);
    }

    protected static char print(int num) {
        char result = (char) num;
        System.out.println("在ASCⅡ表中，" + num + "对应的大写字母是" + result);
        return result;
    }

    protected static String print(char cha) {
        String result = (cha + "").toLowerCase();
        System.out.println(cha + "的小写字母是:" + result);
        return result;
    }
}
