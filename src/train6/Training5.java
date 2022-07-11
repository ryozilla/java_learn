package train6;

/*
 * 信用卡消费记录
 * 使用静态变量定义使用信用卡消费的总次数，
 * 控制台先输出使用信用卡消费时的每一条交易信息，
 * 再输出使用信用卡消费的总次数。
 * */
public class Training5 {
    static int num = 0;

    public static void main(String[] args) {
        //大额消费
        Cost cost1 = new Cost(1555.0);
        Cost cost2 = new Cost(1920.0);
        Cost cost3 = new Cost(1979.0);
        Cost cost4 = new Cost(2259.0);
        Cost cost5 = new Cost(1835.0);
        Cost cost6 = new Cost(1799.0);
        Cost cost7 = new Cost(2688.0);

        //输出消费次数
        System.out.println("\n您最近有" + num + "笔交易");
    }
}

class Cost {
    double cost;

    public Cost(double cost) {
        this.cost = cost;
        System.out.println("您有一笔大额消费，交易金额：" + this.cost + "元。");
        Training5.num++;
    }

    public Cost() {
        System.out.println("金额错误！");
    }
}
