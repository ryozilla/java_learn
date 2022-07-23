package train.t5;

import java.util.Scanner;

public class Complex8 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        char[] right = {'B', 'A', 'D', 'C', 'C', 'B', 'C', 'A', 'D', 'B'};
        char[][] choice = {
                {'B', 'A', 'D', 'C', 'A', 'B', 'C', 'C', 'D', 'B'},
                {'B', 'A', 'D', 'B', 'A', 'B', 'C', 'A', 'C', 'B'},
                {'A', 'A', 'D', 'C', 'B', 'A', 'C', 'A', 'D', 'B'},
                {'B', 'C', 'D', 'C', 'A', 'B', 'C', 'B', 'D', 'A'},
                {'B', 'C', 'D', 'A', 'C', 'B', 'D', 'A', 'D', 'A'},
                {'B', 'A', 'D', 'A', 'C', 'B', 'D', 'A', 'C', 'B'},
                {'A', 'B', 'A', 'C', 'D', 'B', 'C', 'A', 'D', 'B'},
                {'B', 'A', 'D', 'C', 'D', 'B', 'A', 'C', 'D', 'B'}};

        while (true) {
            //选择学生
            System.out.println("您想调取第几位学生的答题结果"
                    + "(有效数字为1至8)：");
            int id = scan.nextInt();

            //计数学生答案对了几题
            int count = 0;
            for (int ans = 0; ans < right.length; ans++) {
                if (choice[id - 1][ans] == right[ans]) {
                    count++;
                }
            }

            System.out.println("该学生对了" + count + "题");
        }
    }
}
