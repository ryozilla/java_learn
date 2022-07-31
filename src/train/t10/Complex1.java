package train.t10;

/*
 * 判断数宇共有多少位
 * 现有如下 long 值： long 1=1234567890987654321L;，请问这个超大的数字共有多少位？
 * */
public class Complex1 {
    public static void main(String[] args) {
        long num = 1234567890987654321L;
        System.out.println("有" + Long.toString(num).length() + "位");
    }
}
