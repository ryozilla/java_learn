package test.string;

import java.util.Date;

public class StringFormat {
    public static void main(String[] args) {
        //日期、时间格式化
        MyDate date = new MyDate();
        System.out.println(date);
        System.out.println(date.getTimeIncludeMillisecond());

        //常规类型格式化
        System.out.println("0o" + String.format("%o", 25));             //十进制转八进制
        System.out.println("0x" + String.format("%x", 320));            //十进制转十六进制
        System.out.println(String.format("%e", 123123123123.321));      //数字转科学计数法
        System.out.println(String.format("%B", 1));                     //格式化为布尔类型
        System.out.println(String.format("%H", 114514));                //格式化为散列码

    }

    static class MyDate extends Date {
        public MyDate() {
            super();
        }

        @Override
        public String toString() {
            return "今年：" + String.format("%tY", this) + "\n" +
                    "今月：" + String.format("%tB", this) + "\n" +
                    "今日：" + String.format("%te", this) + "\n" +
                    "星期：" + String.format("%tA", this) + "\n" +
                    "此时：" + String.format("%tT", this) + "\n" +
                    "一年中的第" + String.format("%tj", this) + "天" + "\n";
        }

        public String getTimeIncludeMillisecond() {
            return "此时：" + String.format("%tT", this) + ":" + String.format("%tL", this) + "\n";
        }
    }
}