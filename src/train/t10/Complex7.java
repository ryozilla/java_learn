package train.t10;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 检索图书（二）有两个小型书柜，
 * 其中第一个书柜依次有5本书，即《Java》《Java Web》《C语言》《C++》《Linux C》。
 * 第二个书柜依次也有5本书，即《论语》《资治通鉴》《四十二章经》《史记》《隋唐史》。
 * 控制台输入要搜索的书名或关键字（包括可忽略大小写的字母）后，输出书名以及书的位置
 * */
public class Complex7 {
    static Scanner scan = new Scanner(System.in);
    //书柜
    static String[] bookcase1 = new String[]{"《Java》", "《Java Web》", "《C语言》", "《C++》", "《Linux C》"};
    static String[] bookcase2 = new String[]{"《论语》", "《资治通鉴》", "《四十二章经》", "《史记》", "《隋唐史》"};

    public static void main(String[] args) {
        while (true) {
            System.out.println("请在此输入搜索的书名（可以不完整）:");
            String input = scan.next();
            if (input.equals("exit")) {
                System.exit(114514);
            }
            searchBookName(input);
            System.out.println("----------------------------------------");
        }
    }

    protected static void searchBookName(String name) {
        ArrayList<Book> search = new ArrayList<>();
        //找到符合的结果
        for (int i = 0; i < bookcase1.length; i++) {
            if (bookcase1[i].contains(name)) {
                search.add(new Book(bookcase1[i], 1, i + 1));
            }
        }
        for (int i = 0; i < bookcase2.length; i++) {
            if (bookcase2[i].contains(name)) {
                search.add(new Book(bookcase2[i], 2, i + 1));
            }
        }

        //打印结果
        System.out.println("-----------------搜索结果-----------------");
        if (search.size() == 0) {
            System.out.println("无结果");
        } else {
            for (Book book : search) {
                System.out.println(book);
            }
        }
    }

    static class Book {
        String bookName;        //书名
        int bookcaseId;         //书柜号
        int id;                 //书号

        public Book(String bookName, int bookcaseId, int id) {
            this.bookName = bookName;
            this.bookcaseId = bookcaseId;
            this.id = id;
        }

        @Override
        public String toString() {
            return bookName + ":第" + bookcaseId + "个书柜的第" + id + "本书";
        }
    }
}
