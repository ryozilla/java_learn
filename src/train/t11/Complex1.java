package train.t11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

/*
 * 使用Calender类打印本月日历
 * */
public class Complex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, 1);     //避免31号的影响
        System.out.print("请输入年份：");
        calendar.set(Calendar.YEAR, scan.nextInt());
        System.out.print("请输入月份(1~12)：");
        calendar.set(Calendar.MONTH, scan.nextInt() - 1);
        printCalendar(calendar);

        /*
        System.out.println("遍历整年");
        for (int i = 0; i < 12; i++) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DATE, 1);     //避免31号的影响
            calendar.set(Calendar.MONTH, i);
            printCalendar(calendar);
        }*/
    }

    public static void printCalendar(Calendar calendar) {
        // 头部
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
        String nowMonth = dateFormat.format(calendar.getTime());
        System.out.println("---------" + nowMonth + "---------");
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        // 日历
        String[][] cal = new String[6][7];
        for (String[] strings : cal) {
            Arrays.fill(strings, " ");
        }

        //计算日历
        switch (calendar.get(Calendar.MONTH) + 1) {
            case 1, 3, 5, 7, 8, 10, 12 -> setCalendar(calendar, cal, 31);
            case 2 -> {
                int year = calendar.get(Calendar.YEAR);
                if (year % 100 != 0 && year % 4 == 0) {
                    setCalendar(calendar, cal, 29);
                } else {
                    setCalendar(calendar, cal, 28);
                }
            }
            case 4, 6, 9, 11 -> setCalendar(calendar, cal, 30);
        }

        //打印日历
        for (String[] strs : cal) {
            for (String str : strs) {
                System.out.print(str + "\t");
            }
            System.out.println();
        }
    }

    private static void setCalendar(Calendar c, String[][] cal, int days) {
        Calendar calendar = (Calendar) c.clone();
        calendar.set(Calendar.DATE, 1);
        int num = calendar.get(Calendar.DAY_OF_WEEK) - 2;
        for (int i = 1; i - 1 < days; i++) {
            calendar.set(Calendar.DATE, i);
            cal[(i + num) / 7][calendar.get(Calendar.DAY_OF_WEEK) - 1] = String.valueOf(i);
        }
    }
}
