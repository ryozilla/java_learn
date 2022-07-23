package train.t7;

/*
 * 打印水果类价格
 * 重写toString0方法，将如下信息输出在控制台上：
 * 红色的苹果被称为“糖心富士”，每500克4.98元，买了2500克“糖心富士”，需支付多少元。
 * */
public class Training3 {
    public static void main(String[] args) {
        System.out.println(new Apple(2.5));
    }
}

class Apple {
    static final double price = 4.98;
    double kg;
    double sumPrice;

    protected Apple(double kg) {
        this.kg = kg;
        double temp = price * 2 * kg;
        sumPrice = (double) Math.round(temp * 100) / 100;     //500克4.98元
        System.out.println("这是”唐心富士“红苹果，每500克4.98元。");
    }

    public String toString() {
        return "你买了" + kg + "千克苹果，共花了" + sumPrice + "元。";
    }
}
