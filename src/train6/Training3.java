package train6;

/*
 * 买可乐
 * 张三去 KFC 买可乐，商家默认不加冰块，但是张三可以要求加3个冰块。
 * 请利用构造方法实现上述功能。
 * */
public class Training3 {
    public static void main(String[] args) {
        Cola zhangsan = new Cola(3);
    }
}

class Cola {
    int iceNum;     //加冰块数

    public Cola(int iceNum) {
        //有形参的构造方法
        this.iceNum = iceNum;
        System.out.println("商家加了" + this.iceNum + "个冰块");
    }

    public Cola() {
        //无形参的构造方法
        this(0);
    }
}