package train.t3;

/*
 * 输出个人信息控制台
 * 输出如下所示的个人基本信息。
 * 个人基本信息
 * ------------------------
 * 姓名：    李四
 * 性别：    男
 * 年龄：    25
 * 身高：    1.76m
 * 是否已婚：    false
 * */
public class Complex3 {
    public static void main(String[] args) {
        String name = "李四";
        String sex = "男";
        short age = 25;
        double height = 1.76;
        boolean married = false;

        //输出
        System.out.println("个人基本信息");
        System.out.println("------------------------");
        System.out.println("姓名：    " + name);
        System.out.println("性别：    " + sex);
        System.out.println("年龄：    " + age);
        System.out.println("身高：    " + height + "m");
        System.out.println("是否已婚：    " + married);
    }
}
