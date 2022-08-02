package train.t11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 中文格式日期改英文格式
 * 将“现在是2021年08月08日13点20分05秒”的日期字符串转为“2021/08/08 13:20:05”的格式。
 * (2021年08月08日13点20分05秒 -转时间戳--> 1628400005000(毫秒))
 * */
public class Training10 {
    public static void main(String[] args) {
        DateFormat df1 = new SimpleDateFormat("现在是yyyy年MM月dd日HH点mm分ss秒");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            //df.parse() 将一定格式的字符串转换为Date对象
            Date date = df1.parse("现在是2021年08月08日13点20分05秒");
            System.out.println(df2.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
