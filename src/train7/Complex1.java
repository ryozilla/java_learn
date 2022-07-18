package train7;

import java.awt.Color;

/*
 * 创建猫类
 * 创建 Cat 类，类中包含表示名字的属性 name 、表示年龄的属性 age 、表示重量的属性 weight 和表示颜色的属性 color 。
 * 重写toString()方法。
 * */
public class Complex1 {
    public static void main(String[] args) {
        //猫咪1号
        Cat cat1 = new Cat("Java", 12, 21.0, new Color(0, 0, 0));
        System.out.println(cat1);
        //猫咪2号
        Cat cat2 = new Cat("C++", 12, 21.0, new Color(255, 255, 255));
        System.out.println(cat2);
        //猫咪3号
        Cat cat3 = new Cat("Java", 12, 21.0, new Color(0, 0, 0));
        System.out.println(cat3);
    }
}

class Cat {
    static int count = 1;   //计数，给编号赋值用
    int num;        //猫咪编号
    String name;    //名字
    int age;        //年龄
    double weight;  //重量
    Color color;    //颜色

    protected Cat(String name, int age, double weight, Color color) {
        num = count;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        count++;
    }

    @Override
    public String toString() {
        String str1 = "猫咪" + num + "号：" + name;
        String str2 = "年龄：" + age;
        String str3 = "重量：" + weight;
        String str4 = "颜色：" + color.getClass().getName() + getRGBNum(color);
        return str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n";
    }

    public static String getRGBNum(Color color) {
        return "[r=" + color.getRed() + ",g=" + color.getGreen() + ",b=" + color.getBlue() + "]";
    }
}