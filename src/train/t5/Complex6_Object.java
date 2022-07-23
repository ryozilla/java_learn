package train.t5;

import java.util.Scanner;

/*
 * 统计学生成绩
 * 学号 语文、数学、英语成绩 平均成绩 总成绩
 * 3个学生，第三个学生需用户输入信息
 * 用对象的知识解决
 * */
public class Complex6_Object {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //创建前两位同学的成绩数据
        Student stu1 = new Student(1, 97, 92, 99);
        Student stu2 = new Student(2, 91, 97, 92);

        System.out.println("请输入第三名学生的学号：");
        int id = scan.nextInt();
        System.out.println("请输入语文成绩：");
        int ch = scan.nextInt();
        System.out.println("请输入数学成绩：");
        int math = scan.nextInt();
        System.out.println("请输入英语成绩：");
        int en = scan.nextInt();

        Student stu3 = new Student(id, ch, math, en);

        System.out.println("学生成绩结果如下");
        Student.head();
        stu1.printStudent();
        stu2.printStudent();
        stu3.printStudent();
    }
}

class Student {
    int id;
    int ch;
    int math;
    int en;
    double averageScore;
    int sumScore;

    public Student(int id, int ch, int math, int en) {
        this.id = id;
        this.ch = ch;
        this.math = math;
        this.en = en;
        this.averageScore = averageScore(ch, math, en);
        this.sumScore = sumScore(ch, math, en);
    }

    public static int sumScore(int ch, int math, int en) {
        return ch + math + en;
    }

    public static double averageScore(int ch, int math, int en) {
        double result = sumScore(ch, math, en) / 3.0;
        return (double) Math.round(result * 100) / 100;
    }

    public static void head() {
        System.out.println("-------------------------------------------------------");
        System.out.println("学号    语文成绩    数学成绩    英语成绩    平均成绩    总成绩");
    }

    public void printStudent() {
        System.out.print(this.id + "        ");
        System.out.print(this.ch + "        ");
        System.out.print(this.math + "        ");
        System.out.print(this.en + "        ");
        System.out.print(this.averageScore + "        ");
        System.out.println(this.sumScore + "      ");
    }
}