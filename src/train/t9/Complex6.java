package train.t9;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 校验年龄格式
 * 编写一个信息录入程序，获取用户输入的姓名和年龄。
 * 如果用户输入的年龄不是正确的年龄数字（如0.5)，则抛出异常并让用户重新输入；
 * 如果年龄正确，则打印用户输入的信息。
 * */
public class Complex6 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        User user1 = new User("张三", 24);
        user1.printUser();
        User user2 = new User("李四", 48);
        user2.printUser();
        try {
            //输入信息
            System.out.print("请输入姓名: ");
            String name = scan.next();
            System.out.print("请输入年龄: ");
            int age = scan.nextInt();
            //创建对象
            User user3 = new User(name, age);
            //打印信息
            System.out.println("信息如下: ");
            user3.printUser();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    static class User {
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        protected void printUser() {
            System.out.println("姓名：" + name);
            System.out.println("年龄: " + age);
            System.out.println("---------------");
        }
    }
}
