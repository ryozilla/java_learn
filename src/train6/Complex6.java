package train6;

/*
 * 计算矩形面积
 * 尝试编写一个矩形类，将长与宽作为矩形类的属性，在构造方法中将长、宽初始化，
 * 定义一个成员方法求此矩形的面积。
 * */
public class Complex6 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3, 5);
        System.out.println("矩形面积：" + rec.area);
    }
}

class Rectangle {
    double length;
    double width;
    double area;

    public Rectangle(double length, double width) {
        //构造方法
        this.length = length;
        this.width = width;
        this.area = areaCalc(this.length, this.width);  //面积通过计算得出后赋值
    }

    private static double areaCalc(double length, double width) {
        //计算矩形面积
        return length * width;
    }
}