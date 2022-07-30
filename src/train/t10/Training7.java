package train.t10;

/*
 * 截取 QQ 号
 * 截取任意 QQ 邮箱地址中的 QQ 号。
 * */
public class Training7 {
    public static void main(String[] args) {
        String qqEmall = "1145141919810@qq.com";
        System.out.println(getQQID(qqEmall));
    }

    protected static String getQQID(String qqEmall) {
        if (!qqEmall.endsWith("@qq.com")) {
            System.out.println("这不是QQ邮箱！");
            return null;
        }
        int num = qqEmall.indexOf("@");
        return qqEmall.substring(0, num);
    }
}
