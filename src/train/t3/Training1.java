package train.t3;

/*
 * 统计粮仓的粮食
 * 圆柱形粮仓，底面直径为10m,高3m,求体积;
 * 如果每立方米屯粮750kg,该粮仓一共可以储存多少千克粮食。
 */
public class Training1 {
    static final double PI = 3.14; //设置静态变量

    public static void main(String[] args) {
        //求体积
        int d = 10, h = 3;
        double V = (d / 2) * PI * h;
        System.out.println("粮仓体积为：" + V);

        //求储存空间
        double Vm = V * 750;
        System.out.println("粮仓能存 " + (int) Vm + "kg 粮食");
    }
}
