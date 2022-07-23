package train.t6;

/*
 * 判断是否存在运行时参数
 * 编写一个类，将 main 方法的所有运行参数输出到控制台，
 * 如果没有运行时参数则输出“无运行参数”提示。
 * */
public class Complex7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("无运行参数");
        } else {
            for (String str : args) {
                System.out.println(str);
            }
        }
    }
}
