package train.t10;

/*
 * 字节码转字符串
 * 已知﹣60、-29、-70、-61这4个数字是一段文字的字节码，请将这段文字内容打印出来。
 * */
public class Training2 {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{-60, -29, -70, -61};
        System.out.println(new String(bytes));
        //咋只会出���啊
        //又是UTF-8和GBK的编码问题/_ \
    }
}
