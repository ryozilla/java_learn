package train.t12;

import java.util.ArrayList;
import java.util.StringJoiner;

/*
 * 给图书排序
 * 书桌上有两本书分别是《西游记》和《水浒传》，
 * 书架上有3本书分别息《三国演义》《莎士比亚诗选》《红楼梦》。
 * 现要将中国的四大名著按照《水浒传》《三国演义》《西游记）《红楼梦》的顺序放到一起。
 * */
public class Training2 {
    static String[] bookTable = new String[]{"《西游记》", "《水浒传》"};
    static String[] bookcase = new String[]{"《三国演义》", "《莎士比亚诗选》", "《红楼梦》"};

    public static void main(String[] args) {
        ArrayList<String> takeOutBook = new ArrayList<>();
        takeOutBook.add(bookTable[1]);
        takeOutBook.add(bookcase[0]);
        takeOutBook.add(bookTable[0]);
        takeOutBook.add(bookcase[2]);
        printArrayList(takeOutBook);
    }

    public static String printArrayList(ArrayList<String> list) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (String str : list) {
            sj.add(str);
        }
        System.out.println(sj);
        return sj.toString();
    }
}
