package train.t10;

import java.util.Date;

/*
* 格式化当前时间
* 按照"HH : MM : SS PM"格式（12时制）格式化当前时间。
* */
public class Training9 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%tr%n",date);
    }
}
