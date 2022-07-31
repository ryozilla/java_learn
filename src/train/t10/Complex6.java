package train.t10;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 检索图书（一）
 * 书架上存放着《明史讲义》《明代社会生活史》《紫禁城的黄昏》《中国的黄金时代》《国史十六讲》《停滞的帝国》《唐朝定居指南》《明史简述》《明史十讲》《大明风物志》《西方眼中的中国》《皇帝与秀オ》，
 * 通过关键字或书名索出相应的书籍。
 * */
public class Complex6 {
    static Scanner scan = new Scanner(System.in);
    static String[] bookNames = new String[]{"《明史讲义》", "《明代社会生活史》", "《紫禁城的黄昏》", "《中国的黄金时代》", "《国史十六讲》", "《停滞的帝国》", "《唐朝定居指南》", "《明史简述》", "《明史十讲》", "《大明风物志》", "《西方眼中的中国》", "《皇帝与秀オ》",};

    public static void main(String[] args) {
        while (true) {
            // 用循环进行多次搜索
            System.out.println("请在此输入搜索的书名（可以不完整）:");
            String input = scan.next();
            if (input.equals("exit")) {
                System.exit(114514);
            }
            searchBookName(input);
        }
    }

    protected static void searchBookName(String name) {
        ArrayList<String> names = new ArrayList<>();
        for (String str : bookNames) {
            if (str.contains(name)) {
                names.add(str);
            }
        }
        System.out.println("搜索结果：" + names);
    }
}
