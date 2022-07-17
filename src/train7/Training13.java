package train7;

/*
 * 教师与学生
 * 使用多态编写一个程序，控制台输出如下内容。
 * 其中，人类（ People )既是教师类（ Teacher ）的父类，也是学生类（ Student ）的父类。
 * --------------
 * 每个人都要工作
 * 教师要认真授课
 * 学生要好好学习
 * */
public class Training13 {
    public static void main(String[] args) {
        People people = new People();
        people.work();
        people = new Teacher();
        people.work();
        people = new Students();
        people.work();
    }
}

class People {
    protected void work() {
        System.out.println("每个人都要工作");
    }
}

class Teacher extends People {
    @Override
    protected void work() {
        System.out.println("教师要认真授课");
    }
}

class Students extends People {
    @Override
    protected void work() {
        System.out.println("学生要好好学习");
    }
}