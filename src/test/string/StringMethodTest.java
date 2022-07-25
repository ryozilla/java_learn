package test.string;

import mytry.MethodsTry;

public class StringMethodTest {
    public static void main(String[] args) {
        //获取字符串长度
        String str1 = "new String()";
        System.out.println("长度为：" + str1.length());

        MethodsTry.line();

        //字符串查找
        //indexOf() 和 lastIndexOf()
        System.out.println("查找str1中第一个 ( 的位置 : " + str1.indexOf("("));
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
        System.out.println("str2.substring(2) : " + str2.substring(2));
        System.out.println("str2.substring(2, 8) : " + str2.substring(2, 8));   //还是[beginIndex,endIndex)的范围

        MethodsTry.line();

        //去除空格
        //trim() 忽略前部空格和尾部空格
        String originalStr = "           public sta tic void main (String[] args)            ";
        System.out.println("originalStr = " + "\"" + originalStr + "\"");
        String nowStr = originalStr.trim();
        System.out.println("nowStr = " + nowStr);

        MethodsTry.line();

        //替换字符串
        String str3 = "mikumiku515";
        System.out.println("str3.replace(\"u\", \"o\") : " + str3.replace("u", "o"));
        System.out.println("str3.replace(\"u\", \"oi\") : " + str3.replace("u", "oi"));
        //replace()方法会把在字符串中找到的所有符合第一个字符串的位置都替换成第二个字符串

        MethodsTry.line();

        //判断字符串的开始和结尾
        String str4 = "1298561943";
        String str5 = "7923959789";
        System.out.println("str4.startsWith(\"12\") : " + str4.startsWith("12"));
        System.out.println("str5.endsWith(\"89\") : " + str5.endsWith("89"));

        MethodsTry.line();

        //按字典顺序比较两个字符
        /*
         * 来源：runoob.com
         * 1.如果第一个字符和参数的第一个字符不等，结束比较，返回第一个字符的ASCII码差值。
         * 2.如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，以此类推,直至不等为止，返回该字符的ASCII码差值。
         * 3.如果两个字符串不一样长，可对应字符又完全一样，则返回两个字符串的长度差值。
         * */
        String str6 = "a";
        String str7 = "b";
        System.out.println("str6.compareTo(str7) : " + str6.compareTo(str7));
        String str8 = "b114514";
        System.out.println("str6.compareTo(str8) : " + str6.compareTo(str8));
        System.out.println("str7.compareTo(str8) : " + str7.compareTo(str8));   //只要长度可以取绝对值
        System.out.println("str8.compareTo(str7) : " + str8.compareTo(str7));

        MethodsTry.line();

        //字符串转大小写
        String str9 = "asdfghjkl";
        String newStr9 = str9.toUpperCase();
        System.out.println("str9 = " + str9);
        System.out.println("newStr9 = " + newStr9);
        String str10 = "AddrEss";
        String newStr10 = str10.toLowerCase();
        System.out.println("str10 = " + str10);
        System.out.println("newStr10 = " + newStr10);

        MethodsTry.line();

        //分割字符串
        String str11 = "ka ke ga e no na i mo no";
        String[] arr1 = str11.split(" ");
        printArray(arr1);
        String[] arr2 = str11.split(" ",5);     //limit：限制分割次数
        printArray(arr2);
    }

    protected static void printArray(String[] str) {
        for (String s : str) {
            System.out.print("[" + s + "]");
        }
        System.out.println();
    }
}
