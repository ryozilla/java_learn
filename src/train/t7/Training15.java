package train.t7;

/*
 * 汽车厂、鞋厂都是工厂
 * 创建抽象的工厂类，工厂类中有一个抽象的生产方法。
 * 让汽车厂和鞋厂都继承工厂类，汽车厂生产的是汽车，鞋厂生产的是鞋。
 * */
public class Training15 {
    public static void main(String[] args) {
        Factory car = new CarFactory();
        car.produce();
        Factory shoes = new ShoesFactory();
        shoes.produce();
    }
}

abstract class Factory {
    abstract void produce();
}

class CarFactory extends Factory {
    @Override
    void produce() {
        System.out.println("汽车厂生产汽车");
    }
}

class ShoesFactory extends Factory {
    @Override
    void produce() {
        System.out.println("鞋子厂生产鞋子");
    }
}