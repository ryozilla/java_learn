package test.chapter7;

// 抽象类
public class AbstractClass {
    public static void main(String[] args) {
        Animal animal = new Ostrich("不知名的小鸵鸟", "淡粉红色");
        animal.getAnimal();

        System.out.println();

        animal = new Chicken("不知名的小鸡", "黄色");   //多态的做法
        animal.getAnimal();
    }
}

abstract class Animal {
    String name;

    protected Animal(String name) {
        this.name = name;
    }

    abstract protected void eat();

    abstract public void getAnimal();   //打印Animal对象信息
}

abstract class Bird2 extends Animal {
    String feather;  //羽毛

    protected Bird2(String name, String feather) {
        super(name);
        this.feather = feather;
    }

    abstract protected void fly();

    public String getFeather() {
        return feather;
    }

    @Override
    public void getAnimal() {
        System.out.println("它是" + this.getFeather() + "的");
        this.fly();
        this.eat();
    }
}

class Chicken extends Bird2 {
    protected Chicken(String name, String feather) {
        super(name, feather);
    }

    @Override
    protected void eat() {
        System.out.println("小鸡啄米");
    }

    @Override
    protected void fly() {
        System.out.println("能飞，但只能飞一点点");
    }

    public void getAnimal() {
        System.out.println("这是一只小鸡，是" + name);
        super.getAnimal();
    }
}

class Ostrich extends Bird2 {
    //鸵鸟类
    protected Ostrich(String name, String feather) {
        super(name, feather);
    }

    @Override
    protected void fly() {
        System.out.println("一般不能飞");
    }

    @Override
    protected void eat() {
        System.out.println("不知道驼鸟吃什么(●'◡'●)");
    }

    @Override
    public void getAnimal() {
        System.out.println("这是一只鸵鸟，是" + name);
        super.getAnimal();
    }
}