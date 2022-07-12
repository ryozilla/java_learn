package train6;

/*
 * 将运行时参数中的字母转为大写
 * 在 Run Configrations 对话框中选择 Arguments 选项卡，
 * 在 Program arguments 文本框中输入字符串 where 、 r 和 u ，
 * 利用 main 函数参数分别将字符串 where 、 r 和 u 转换为大写并输出“ WHERE R U ?”的结果。
 * */
public class Training8 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String str = args[i].toUpperCase();
            System.out.print(str + " ");
        }
    }
}
