package train.t11;

import mytry.MethodsTry;

/*
 * 对比执行效率
 * 比较“+=”运算符和 String 类的 concat()方法哪一个拼接字符串的执行效率更高。
 * */
public class Training6 {
    public static void main(String[] args) {
        //1
        long time1 = System.currentTimeMillis();
        String str1 = "";
        for (int i = 0; i < 1000; i++) {
            str1 += i;
        }
        long time2 = System.currentTimeMillis();
        System.out.println("+=操作符用时为" + (time2 - time1));

        MethodsTry.line();

        //2
        long time3 = System.currentTimeMillis();
        String str2 = "";
        for (int i = 0; i < 1000; i++) {
            str1 = str1.concat(Integer.toString(i));
        }
        long time4 = System.currentTimeMillis();
        System.out.println("concat()用时为" + (time4 - time3));

        MethodsTry.line();

        //3
        long time5 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
        long time6 = System.currentTimeMillis();
        System.out.println("StringBuilder用时为" + (time6 - time5));
    }
}
