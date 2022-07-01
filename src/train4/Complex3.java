package train4;

/*
 * 计算1~20的阶乘的倒数之和
 * 编写 Java 程序，使用 while 循环语句计算 1+1/2!+1/3!+…+1/20！之和。
 *
 * */
public class Complex3 {
    public static int factorial(int x) {
        if (x < 0) {
            System.out.println("输入数值有误，请重新输入");
            System.exit(1);
        }

        //计算阶乘
        int i = 0;
        int result = 1;
        while (i < x) {
            i++;
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        //计算1~20的阶乘的倒数之和
        int i = 0;
        double sum = 0;
        while (i < 20) {
            i++;
            double temp = factorial(i);
            sum += 1 / temp;
        }
        System.out.println("1+1/2!+1/3!+…+1/20！= " + sum);
    }
}
