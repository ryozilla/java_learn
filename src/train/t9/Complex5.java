package train.t9;

/*
 * 除数不能为0
 * 使用静态变量、静态方法以及 throws 关键字，
 * 实现当两个数相除且除数为0时，程序会捕获并处理抛出的 ArithmeticException 异常（算术异常）。
 * */
public class Complex5 {
    public static void main(String[] args) {
        try {
            System.out.println(division(3, 5, 5));
            System.out.println(division(233, 0, 3));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    protected static double division(double x, double y, int scale) throws ArithmeticException {
        //if (y == 0) {
        //    throw new ArithmeticException("0不能作除数");
        //}
        double result = x / y;
        if (Double.isInfinite(result)){
            // 浮点数除以0的结果是Infinity
            throw new ArithmeticException("result 为 Infinity");
        }
        return (double) Math.round(result * scale) / scale;
    }
}

