package train5;

import methods.Array;

import java.util.Scanner;

/*
 * 统计学生成绩
 * 学号 语文、数学、英语成绩 平均成绩 总成绩
 * 3个学生，第三个学生需用户输入信息
 * 3 96 99 95
 * */
public class Complex6 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String blank = "    ";

        String[][] score = new String[4][6];
        //初始化表头
        score[0][0] = "学号";
        score[0][1] = "语文成绩";
        score[0][2] = "数学成绩";
        score[0][3] = "英语成绩";
        score[0][4] = "平均成绩";
        score[0][5] = "总成绩";

        //第一位学生
        score[1][0] = "1" + blank;
        score[1][1] = "97" + blank;
        score[1][2] = "92" + blank;
        score[1][3] = "99" + blank;
        score[1][4] = "96.00" + blank;
        score[1][5] = "288" + blank;

        //第二位学生
        score[2][0] = "2" + blank;
        score[2][1] = "91" + blank;
        score[2][2] = "97" + blank;
        score[2][3] = "92" + blank;
        score[2][4] = "93.33" + blank;
        score[2][5] = "280" + blank;

        System.out.println("请输入第三名学生的学号：");
        int id = scan.nextInt();
        String idStr = id + "";
        System.out.println("请输入语文成绩：");
        int ch = scan.nextInt();
        String chStr = ch + "";
        System.out.println("请输入数学成绩：");
        int math = scan.nextInt();
        String mathStr = math + "";
        System.out.println("请输入英语成绩：");
        int en = scan.nextInt();
        String enStr = en + "";
        int sumScore = ch + math + en;
        String sumScoreStr = sumScore + "";
        String averageScore = (double) Math.round((sumScore / 3.0) * 100 / 100) + "";

        //第三位学生
        score[3][0] = idStr + blank;
        score[3][1] = chStr + blank;
        score[3][2] = mathStr + blank;
        score[3][3] = enStr + blank;
        score[3][4] = averageScore + blank;
        score[3][5] = sumScoreStr + blank;

        System.out.println("学生成绩结果如下");
        System.out.println("----------------------------------------");
        Array.printArray(score);
    }
}
