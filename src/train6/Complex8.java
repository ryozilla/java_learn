package train6;

/*
 * 单例模式
 * 创建一个类，该类无法通过构造方法创建对象，只能通过该类提供的getInstance()静态方法获得该类对象。
 * */
public class Complex8 {
    public static void main(String[] args) {
        //NoName obj = new NoName();    //无法执行，会报错
        NoName obj = NoName.getInstance("NoName");
        System.out.println(obj.name);
    }
}

class NoName {
    String name;

    private NoName(String name) {
        System.out.println("构造函数被调用了");
        this.name = name;
    }

    protected static NoName getInstance(String name) {
        System.out.println("getInstance()方法被调用了");
        return new NoName(name);
    }
}
