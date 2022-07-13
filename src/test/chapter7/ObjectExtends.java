package test.chapter7;

public class ObjectExtends {
    public static void main(String[] args) {
        new Children();
        System.out.println();
        new Grandson();
    }
}

class Parents {
    //一个父类
    protected Parents() {
        System.out.println("调用父类构造方法");
    }
}

class Children extends Parents {
    //一个子类继承父类
    protected Children() {
        System.out.println("调用子类构造方法");
        //子类的构造方法在调用的同时会先调用父类构造方法
        //孙子
    }
}

class Grandson extends Children {
    //这是孙子类
    //孙子类可以间接继承父类
    protected Grandson() {
        System.out.println("调用孙子类构造方法");
        //同理，调用此方法同时也会执行父类的构造方法
    }
}