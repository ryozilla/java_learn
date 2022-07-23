package train.t6;

/*
 * 简易计算器
 * 使用静态方法模拟一个只能进行加减乘除的简易计算器
 * 乘法 除法
 * */
public class Complex1 {
    public static void main(String[] args) {
        Calculator.add(4.4, 7.11);
        Calculator.minus(8.9, 2.28);
        Calculator.multiplication(5.2, 13.14);
        Calculator.division(92, 89);
    }
}

class Calculator {
    public static double add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println(num1 + " + " + num2 + "的计算结果是：" + result);
        return result;
    }

    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        System.out.println(num1 + " - " + num2 + "的计算结果是：" + result);
        return result;
    }

    public static double multiplication(double num1, double num2) {
        double result = num1 * num2;
        System.out.println(num1 + " × " + num2 + "的计算结果是：" + result);
        return result;
    }

    public static double division(double num1, double num2) {
        double result = num1 / num2;
        System.out.println(num1 + " ÷ " + num2 + "的计算结果是：" + result);
        return result;
    }
}