package train3;

/*
 * 话费充值
 * 向手机中充值10元。
 * 通话0.2元／分钟，通话时长已有30分钟；
 * 流量己使用10MB，流量费用为0.3元／ MB 。
 * 计算话费余额还可以通话的时长。
 * */
public class Complex7 {
    public static void main(String[] args) {
        double calls = 10.0;
        calls = calls - (0.2 * 30 + 0.3 * 10);
        int time = (int) (calls / 0.2);
        System.out.println("还可拨打" + time + "分钟。");
    }
}
