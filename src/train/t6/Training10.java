package train.t6;

/*
 * 创建数学工具类
 * 编写一个数学工具类，类中有一个pow()方法。
 * 当为 pow() 方法传入一个 dooble 值时，该方法会返回这个值的4次幂。
 * 利用这个工具类，计算45.6和0.35的4次幂。
 * */
public class Training10 {
    public static void main(String[] args) {
        MathTool.pow(45.6);
        MathTool.pow(0.35);
    }
}

class MathTool {
    public static double pow(double num) {
        double result = num * num * num * num;
        System.out.println(num + "的4次方为：" + result);
        return result;
    }
}
