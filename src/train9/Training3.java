package train9;

/*
 * 模拟老师上课前的点名过程
 * 将旷课的学生作为异常抛出：张三、李四、王五（老师在点名册上记下了“王五旷课”)。
 * */
class AbsentClass extends Exception {
    public AbsentClass(String message) {
        super(message);
    }
}

public class Training3 {
    static boolean zhangsan = true;
    static boolean lisi = true;
    static boolean wangwu = false;

    static class Student {
        String name;
        boolean isInClass;

        public Student(String name, boolean isInClass) {
            this.name = name;
            this.isInClass = isInClass;
        }
    }

    public static void main(String[] args) {
        try {
            //模拟点名
            isInClass(new Student("张三",true));
            isInClass(new Student("李四",true));
            isInClass(new Student("王五",false));
        } catch (AbsentClass e) {
            e.printStackTrace();
        }
    }

    private static void isInClass(Student student) throws AbsentClass {
        if (student.isInClass) {
            System.out.println(student.name + "正常上课");
        } else {
            throw new AbsentClass(student.name + "没来上课");
        }
    }
}
