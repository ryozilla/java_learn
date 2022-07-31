package train.t10;

import java.util.Scanner;

/*
 * 转置字符串
 * 在控制台上输入一个字符串，将此字符串转置输出，如：“故事”转置后变为“事故”。
 * */
public class Complex5 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scan.next();
        System.out.println(stringTranspose(str));
    }


    protected static String stringTranspose(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(str.length() - 1 - i));
        }
        return sb.toString();
    }
}
