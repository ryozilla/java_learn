package train.t7;

import java.util.Arrays;

/*
 * 判断3条给定长度的边能否构成三角形
 * 创建一个抽象的图形类，图形类中有一个抽象的“计算周长”的方法。
 * 让三角形类继承图形类，先在三角形类中声明三角形的3条边，再判断这3条边能否构成三角形，接着重写图形类中的抽象方法。
 * 现有长为3、4、5的3条边和长为1、4、5的3条边，控制台分别输出这两组边能否构成三角形。
 * 如果能，计算三角形的周长。
 * 控制台输出如下内容：
 * -------------------------------------------------------------
 * 长为3.0、4.0、5.0的3条边能构成三角形，这个三角形的周长为12.0
 * 长为1.0、4.0、5.0的3条边不能构成三角形，因为三角形两边之和必须大于第三边
 * */
public class Complex6 {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle(3.0, 4.0, 5.0);
        tri1.isTriangle();
        Triangle tri2 = new Triangle(1.0, 4.0, 5.0);
        tri2.isTriangle();
    }
}

abstract class Shape2 {
    abstract protected double calcPerimeter();
}

class Triangle extends Shape2 {
    double a;       //第1条边
    double b;       //第2条边
    double c;       //第3条边

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double calcPerimeter() {
        return a + b + c;
    }

    protected void isTriangle() {
        double[] arr = new double[]{a, b, c};
        Arrays.sort(arr);   //给三条边排序，简化判定条件
        //三角形两短边和大于最长边，两长边之差的绝对值小于最短边
        if (arr[0] + arr[1] > arr[2] && Math.abs(arr[2] - arr[1]) < arr[0]) {
            System.out.println("长为" + a + "、" + b + "、" + c + "的三角形能构成一个三角形，这个三角形的周长为" + this.calcPerimeter());
        } else {
            System.out.println("长为" + a + "、" + b + "、" + c + "的三角形不能构成一个三角形,因为三角形两边之和必须大于第三边");
        }
    }
}
