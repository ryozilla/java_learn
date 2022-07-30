package train.t10;
/*
* 拼接字符串
* 字符串没有支持 char 类型参数的方法，
* 如果想要将一个 char 类型变量转为字符串，最简单的方法就是拼接。
* 请将字符‘@’转成字符串。
* */
public class Training3 {
    public static void main(String[] args) {
        // 1 字符串拼接
        String str1 = '@' + "";
        // 2 使用Character类的toString方法
        String str2 = Character.toString('@');
    }
}
