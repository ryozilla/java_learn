package train.t11;

/*
 * 计算字符串数字的平方值
 * 将字符串“351”转换成 int 值，并计算该值的平方。
 * */
public class Training1 {
    public static void main(String[] args) {
        String numStr = "351";
        int num = Integer.parseInt(numStr);
        System.out.println("351^2:" + num * num);
    }
}
