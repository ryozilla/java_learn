package train.t11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 毫秒转时间
* 分别输出以下毫秒数对应的时间：1000,100000,1000000以及10000000。
* */
public class Training9 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(df.format(new Date(1000L)));
        System.out.println(df.format(new Date(100000L)));
        System.out.println(df.format(new Date(1000000L)));
        System.out.println(df.format(new Date(10000000L)));
    }
}
