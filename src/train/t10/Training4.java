package train.t10;

/*
 * 拼接古诗
 * 用3种方法将“白日依山尽”和“黄河入海流”两句古诗拼接成一个字符串（每个诗句后要加标点）。
 * */
public class Training4 {
    public static void main(String[] args) {
        String str1 = "白日依山尽";
        String str2 = "黄河入海流";

        // 1 字符串拼接
        String str3 = str1 + "，" + str2 + "。";

        // 2 StringBuilder类创造字符串(也可以用StringBuffer类)
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append("，").append(str2).append("。");
        String str4 = sb.toString();

        //3 用char型数组创造字符串
        char[] chars = new char[12];
        for (int i = 0; i < str1.length(); i++) {
            chars[i] = str1.charAt(i);
        }
        chars[5] = '，';
        for (int i = 0; i < str2.length(); i++) {
            chars[i + 6] = str2.charAt(i);
        }
        chars[11] = '。';
        String str5 = new String(chars);
    }
}
