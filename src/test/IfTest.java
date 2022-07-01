package test;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入成绩以查看奖励：");
        int score = scan.nextInt();

        //114514 && 1919810 --> （-∞,0) && (100,+∞) --> 100 --> [80,99] --> [60,79] --> 不及格
        if (score == 114514 || score == 1919810) {
            System.out.println("考试成绩范围为[0,100],不是什么奇怪的数值");
            System.out.println("这种数值让人十分不满意甚至九分不满意罢");
        } else if (score < 0 || score > 100) {
            System.out.println("考试成绩范围为[0,100]，请重新输入");
        } else if (score == 100) {
            System.out.println("奖励一把MP5");
        } else if (score >= 80) {
            System.out.println("奖励一个mp3");
        } else if (score >= 60) {
            System.out.println("奖励一个苹果（吃的）");
        } else {
            System.out.println("屁都没有");
        }
    }
}
