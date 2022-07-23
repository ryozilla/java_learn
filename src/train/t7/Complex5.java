package train.t7;

/*
 * 抽象的图形
 * 创建一个抽象的图形类，图形类中有一个表示“颜色”的属性、一个有参构造方法和一个抽象的“获得面积”的方法。
 * 让长方形类继承图形类，先在长方形类的构造方法中调用图形类的构造方法，再在长方形类中声明表示“长”和“宽”的两个属性，
 * 接着在长方形类中重写图形类中的抽象方法。
 * 控制台输出如下内容：
 * -----------------------------------
 * 长为6.0、宽为2.0的黄色长方形的面积是12.0
 * */
public class Complex5 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle("黄色", 6.0, 2.0);
        rec.getArea();
    }
}

abstract class Shape {
    String color;

    protected Shape(String color) {
        this.color = color;
    }

    protected Shape() {
        this("无色");
    }

    abstract double getArea();
}

class Rectangle extends Shape {
    //长方形类
    double lone;
    double width;

    protected Rectangle(String color, double lone, double width) {
        super(color);
        this.lone = lone;
        this.width = width;
    }

    @Override
    double getArea() {
        double area = lone * width;
        System.out.println("长为" + lone + "，宽为" + width + "的" + color + "长方形面积是" + area);
        return area;
    }
}
