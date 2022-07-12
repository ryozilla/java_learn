package train6;

/*
 * 计算平均分
 * 使用成员变量、成员方法、构造方法和 this 关键字，
 * 先记录4名学生的语文、数学、英语这3科成绩，再计算每个人的平均分。s
 * */
public class Complex3 {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "张三", 91.5, 98.0, 89.0);
        Student stu2 = new Student(2, "李四", 96.0, 98.5, 93.0);
        Student stu3 = new Student(3, "王五", 97.0, 100.0, 98.5);
        Student stu4 = new Student(4, "钱六", 77.0, 83.0, 81.0);
        stu1.printStudent();
        stu2.printStudent();
        stu3.printStudent();
        stu4.printStudent();
    }
}

class Student {
    static String blank = "    ";   //打印学生信息用
    int id;
    String name;
    double ch;
    double math;
    double en;
    double averageScore;

    public Student(int id, String name, double ch, double math, double en) {
        //构造方法
        this.id = id;
        this.name = name;
        this.ch = ch;
        this.math = math;
        this.en = en;
        this.averageScore = averageScore(ch, math, en);
    }

    public static double averageScore(double ch, double math, double en) {
        //计算平均成绩
        double result = (ch + math + en) / 3.0;
        return (double) Math.round(result * 100) / 100;
    }

    protected void printStudent() {
        //打印学生信息
        System.out.print(this.id + blank);
        System.out.print(this.name + blank);
        System.out.print(this.ch + blank);
        System.out.print(this.math + blank);
        System.out.print(this.en + blank);
        System.out.println(this.averageScore + blank);
    }
}