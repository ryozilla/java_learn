package train7;

/*
 * 创建昆虫类
 * 首先，创建一个表示飞行的接ロ Flyable ，接口中有一个表示飞行的抽象方法fly()。
 * 然后，创建一个抽象的昆虫类 Insect ，类中有一个 int 型、表示昆虫有多少条腿的变量 legs ,
 * 有一个有参的构造方法，还有一个表示繁殖的抽象方法 reproduce ()。
 * 接着，创建一个苍蝇类，使之继承昆虫类 Insect ，并实现接口 Flyable 。
 * 最后，创建测试类 Test ,并在控制台上输出如下内容：
 * ---------------------
 * 苍蝇有6条腿。
 * 苍蝇可以在空中飞行。
 * 苍蝇的繁殖方式是产卵。
 * */
public class Complex2 {
    public static void main(String[] args) {
        Housefly hfly = new Housefly();
        hfly.getHousefly();
    }
}

interface Flyable {
    void fly();
}

abstract class Insect implements Flyable {
    int legs;

    protected Insect(int legs) {
        this.legs = legs;
    }

    protected Insect() {
        this(6);
    }

    abstract void reproduce();
}

class Housefly extends Insect {
    @Override
    public void fly() {
        System.out.println("苍蝇嗡嗡飞，很吵人睡觉＞︿＜");
    }

    @Override
    void reproduce() {
        System.out.println("苍蝇产卵");
    }

    protected void getHousefly() {
        System.out.println("苍蝇有" + legs + "条腿");
        this.fly();
        this.reproduce();
    }
}