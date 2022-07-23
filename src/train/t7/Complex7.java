package train.t7;

/*
 * USB / TypeC 充电接口
 * 首先，创建一个表示 USB 充电的接口 USBRechargeable ，
 * 接口中有一个表示充电的抽象方法 charge()。
 * 然后，创建一个表示 TypeC 充电的接口 TypeCRechargeable ,
 * 接口中也有一个表示充电的抽象方法charge()。
 * 接着，创建一个汽车类 Car ，使之同时实现接口 USBRechargeable 和接口 TypeCechargeable 。
 * 最后，创建测试类 Test ，并在控制台上输出“汽车上的 USB 和 TypeC 接口都能用于给手机充电”。
 * */
public class Complex7 {
    public static void main(String[] args) {
        Car car = new Car();
        car.charge();
    }
}

interface USBRechargeable {
    void charge();
}

interface TypeCRechargeable {
    void charge();
}

class Car implements USBRechargeable, TypeCRechargeable {
    @Override
    public void charge() {
        // 一个类从两个接口得到的同名接口可以被一次重写实现
        System.out.println("汽车上的 USB 和 TypeC 接口都能用于给手机充电");
    }
}