package train.t4;

import java.util.Scanner;

/*
 * 划分成绩等级
 * 将一、二年级学生的学生成绩划分等级，等级划分标准如下：
 * “优秀”，大于等于90分。
 * “良好”，大于等于80分，小于90分。
 * “合格”，大于等于60分，小于80分。
 * “不合格”，小于60分。
 * 使用 if .. else if 语句判断成绩等级并输出与该成绩对应的等级。
 * */
public class Training1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //输入
        System.out.println("请输入成绩");
        System.out.print("→ ");
        int score = scan.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("成绩输入有误，请重新输入");
        } else if (score >= 90) {
            System.out.println("成绩优秀");
        } else if (score >= 80) {
            System.out.println("成绩良好");
        } else if (score >= 60) {
            System.out.println("成绩合格");
        } else {
            System.out.println("成绩不合格");
        }
    }
}
