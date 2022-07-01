package test;

public class stringTest {

    public static void main(String[] args){
        String nn = "\n";

        String str1 = "你好";
        System.out.println(str1 + nn);

        String str2 = "1";
        //String str3 = "";
        System.out.print(str2 + nn);

        char c = 'a';
        int num = 10;
        String str = "Hello";
        System.out.println(c + num + str);
        System.out.println(c + (num + str));
        //跟数学运算类似，从左往右，括号内先算

        int num1 = 0x15a;
        System.out.println(num1);
        String str4 = num1 + "";
        System.out.println(str4);
    }

}
