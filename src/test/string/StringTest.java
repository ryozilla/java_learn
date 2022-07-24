package test.string;

import mytry.MethodsTry;

public class StringTest {
    public static void main(String[] args) {
        //创建String对象的三种方法
        String str1 = "Hello World";
        char[] cha = {'j', 'a', 'v', 'a'};
        String str2 = new String(cha);
        String str3 = new String(cha, 1, 2);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        MethodsTry.line();

        String str4 = "Hello World";
        String str5 = new String(cha);
        System.out.println("str4 = " + str4);
        System.out.println("str5 = " + str5);
        System.out.println("str4 == str1 : " + (str4 == str1));
        System.out.println("str5 == str2 : " + (str5 == str2));
        System.out.println("str5.equals(str2) : " + str5.equals(str2));
        System.out.println("使用==判断new出来的字符串会比较两者的地址，自然会返回false");
        System.out.println("虽然直接赋值的字符串不会出问题，但还是建议用equals()比较字符串");

        MethodsTry.line();
    }
}
