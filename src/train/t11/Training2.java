package train.t11;

/*
 * 判断字符是数字还是字母
 * 判断字符串“ JDK 11.0.1”上每个字符是数字还是字母。
 * */
public class Training2 {
    public static void main(String[] args) {
        String str = "JDK 11.0.1";
        whatType(str);
    }

    protected static void whatType(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                System.out.println("第" + (i + 1) + "个字符是字母 ->'" + str.charAt(i) + "'");
            } else if (Character.isDigit(str.charAt(i))) {
                System.out.println("第" + (i + 1) + "个字符是数字 ->'" + str.charAt(i) + "'");
            } else {
                System.out.println("第" + (i + 1) + "个字符不是数字也不是字母 ->'" + str.charAt(i) + "'");
            }
        }
    }
}
