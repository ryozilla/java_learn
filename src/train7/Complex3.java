package train7;

/*
 * 餐馆点菜
 * 编写一个程序，使用向下转型模拟如下场景：
 * 餐馆里有3位客人，一位老师、一位学生和一位医生；
 * 老师点了“香辣肉丝”，学生点了“火腿炒面”，医生点了“麻辣香锅”。
 * */
public class Complex3 {
    public static void main(String[] args) {
        System.out.println("这里是餐馆");
        People2 people1 = new Teacher2();
        Teacher2 teacher = (Teacher2) people1;
        People2 people2 = new Student2();
        Student2 student = (Student2) people2;
        People2 people3 = new Doctor();
        Doctor doctor = (Doctor) people3;
        teacher.order();
        student.order();
        doctor.order();
    }
}

class People2 {
    void order() {
    }
}

class Teacher2 extends People2 {
    @Override
    void order() {
        System.out.println("老师点了\"香辣肉丝\"");
    }
}

class Student2 extends People2 {
    @Override
    void order() {
        System.out.println("学生点了\"火腿炒面\"");
    }
}

class Doctor extends People2 {
    @Override
    void order() {
        System.out.println("医生点了\"麻辣香锅\"");
    }
}