package train.t10;

/*
 * 校验密码复杂程度
 * 密码校验：8~20位，要求至少包含小写字母、大写字母或数字中的两种。
 * 判断密码“dave1234”是否符合要求。
 * 如果符合，控制台输出“此密码符合要求！”；
 * 反之，控制台输出“请按要求重新设置密码………”。
 * */
public class Training12 {
    public static void main(String[] args) {
        String psw = "dave1234";
        isRegular(psw, "");
        //这题对我来说是否有点难了（；´д｀）ゞ
    }

    protected static void isRegular(String psw, String regex) {
        if (psw.matches(regex)) {
            System.out.println("此密码符合要求！");
        } else {
            System.out.println("请按要求重新设置密码………");
        }
    }
}
