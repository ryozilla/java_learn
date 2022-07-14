package test.chapter7;

public class TurnObject {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        Bird bird2 = new Pigeon();      //向下转型是安全的
        Pigeon pigeon1 = (Pigeon) bird2;   //向上转型
        //进行强制转型

        //只有用来赋值的对象是用子类方法创建的才能进行强制转换，否则会报错
        // (没有继承关系的两个类更是不能互相转换)
        //比如这句
        //Pigeon pigeon = (Pigeon) bird1;

        //Pigeon pigeon2 = bird2;
        Pigeon pigeon2 = (Pigeon) bird2;
        //即使父类对象声明是用的是子类的构造方法，也不能直接被赋在子类对象上

        //子类方法可以调用父类方法和自己的方法
        pigeon1.fly();
        pigeon1.gugugu();
        //用子类构造方法创建的父类方法不能调用子类独有的方法
        //bird2.gugugu();
        ((Pigeon) bird2).gugugu();

    }
}

class Bird {
    //鸟类
    protected void fly() {
        System.out.println("这只鸟在飞");
    }
}

class Pigeon extends Bird {
    //鸽子类
    protected void gugugu() {
        System.out.println("这只鸽子在咕咕叫");
    }
}
