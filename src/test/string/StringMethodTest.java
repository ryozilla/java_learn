package test.string;

import mytry.MethodsTry;

public class StringMethodTest {
    public static void main(String[] args) {
        //获取字符串长度
        String str1 = "new String()";
        System.out.println("str1 = " + str1);
        System.out.println("长度为：" + str1.length());

        MethodsTry.line();

        //字符串查找
        //indexOf() 和 lastIndexOf()
        System.out.println("查找str1中第一个 ( 的位置");
        System.out.println(str1.indexOf("("));
        //字符串的索引位置和数组下标相似，可以把字符串理解成数组
        //如果搜索的字符没有出现在字符串内，indexOf()将返回-1
        System.out.println("str1.indexOf(\"a\") : " + str1.indexOf("a"));
        //如果indexOf()传入的是空字符串，则返回值为0
        //如果lastIndexOf()传入的是空字符串，则返回值与length()一致
        System.out.println("str1.indexOf(\"\") : " + str1.indexOf(""));
        System.out.println("str1.lastIndexOf(\"\") : " + str1.lastIndexOf(""));

        MethodsTry.line();

        //获取指定索引位置的字符
        //chatAt()
        System.out.println("str1.charAt(8) : " + str1.charAt(8));

        MethodsTry.line();

        //获取子字符串 / 截取字符串
        String str2 = "I have a pen";
        System.out.println("str2 = " + str2);
        System.out.println("str2.substring(2) : " + str2.substring(2));
        System.out.println("str2.substring(2, 8) : " + str2.substring(2, 8));   //还是[beginIndex,endIndex)的范围

        MethodsTry.line();

        //去除空格
        //trim() 忽略前部空格和尾部空格
        String originalStr = "           public sta tic void main (String[] args)            ";
        System.out.println("originalStr = " + "\"" + originalStr + "\"");
        String nowStr = originalStr.trim();
        System.out.println("nowStr = " + nowStr);
    }
}
