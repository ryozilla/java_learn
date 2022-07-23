package train.t9;

/*
 * 数据类型转换异常
 * 编写一个简单程序，使之产生数据类型转换异常(NumberFormatException)。
 * */
public class Complex2 {
    public static void main(String[] args) {
        try {
            String str = "0 ";
            int num = Integer.parseInt(str);    //将字符串转换成int型
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("已执行catch语句中的代码");
            e.printStackTrace();
        }
    }
}
