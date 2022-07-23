package train.t6;

/*
 * 从运行时参数中读取用户账号、密码
 * 在 Run Configrations 对话框中选择 Arguments 选项卡，
 * 在 Program arguments 文本框中输入字符串“张三”和“123456”，
 * 利用 main 函数参数给程序添加权限判断。
 * 如果用户名、密码正确，控制台输出“开始执行……”；否则，输出“您的权限无法运行此程序”。
 * */
public class Training7 {
    public static void main(String[] args) {
        //判断权限
        if (args[0].equals("张三") && args[1].equals("123456")) {
            System.out.println("开始执行……");
        } else {
            System.out.println("您的权限无法运行此程序");
        }
    }
}
