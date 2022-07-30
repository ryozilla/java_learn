package train.t10;
/*
* 判断"ABAB"形式的数字
* 在控制台上输入一个4位数字，判断其是否为"ABAB"形式的数字。
* */
public class Training11 {
    public static void main(String[] args) {
        String regex = "([0-9])([0-9])\\1\\2";
        // 记得要把转义符号\转义成正常字符
        isRight(2323, regex);
        isRight(2343, regex);
    }

    protected static void isRight(int num, String regex) {
        if (Integer.toString(num).matches(regex)) {
            System.out.println(num + "符合条件");
        } else {
            System.out.println(num + "不符合条件");
        }
    }
}
