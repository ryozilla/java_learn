package train.t11;

/*
 * 计算圆面积
 * 尝试开发一个程序，定义一个求圆面积的方法，其中以圆半径作为参数，并将计算结果保留5位小数。
 * */
public class Training4 {
    static final double PI = Math.PI;

    public static void main(String[] args) {
        System.out.println(calcCircleAcreage(11.4514));
    }

    protected static double calcCircleAcreage(double r) {
        double result = r * r * PI;                         //计算圆面积
        return (double) Math.round(result*10000)/10000;     //保留五位小数
    }
}
