package test.chapter7;

// 多态
public class Polymorphism {
    public static void main(String[] args) {
        //多态 同一变量 同一方法 不同执行效果
        Shape shape = new Square();
        shape.draw();
        shape = new Circle();
        //使用父类类名创建子类对象可以在子类间来回切换，使同一个变量调用同一个方法做出不同操作
        shape.draw();
    }
}

abstract class Shape {
    //图形类
    protected void draw() {
    }
}

class Square extends Shape {
    //正方形类
    @Override
    protected void draw() {
        System.out.println("画一个正方形");
    }
}

class Circle extends Shape {
    //圆形类
    @Override
    protected void draw() {
        System.out.println("画一个圆形");
    }
}
