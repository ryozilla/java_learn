package train.t10;

/*
 * 获得最中间的字符
 * 如何获得任意字符串里最中间的字符
 * (如果字符个数为偶数，则取中间两个字符中索引值较小的字符)
 * */
public class Training6 {
    public static void main(String[] args) {
        System.out.println(toMidString("12345"));
        System.out.println(toMidString("你好世界"));
    }

    protected static int midNumber(int num) {
        if (num % 2 == 0) {
            //如果字符个数为偶数，则取中间两个字符中索引值较小的字符
            return (num - 1) / 2;
        } else {
            return num / 2;
        }
    }

    protected static char toMidString(String str) {
        return str.charAt(midNumber(str.length()));
    }
}
