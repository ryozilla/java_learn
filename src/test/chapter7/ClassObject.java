package test.chapter7;

public class ClassObject {
    public static void main(String[] args) {
        Methods mt = new Methods("class");
        System.out.println(mt.getClass());      //getClass()方法 返回对象执行时的Class实例
        System.out.println(mt.getClass().getName());    //getName()方法 获取类名
        System.out.println(mt);     //自动调用toStrong()方法
    }
}

class Methods {
    //所有类都继承了Object类
    //也都可以调用Object类的方法
    String input;

    protected Methods(String input) {
        this.input = input;
    }

    public String toString() {
        //toString()方法通常被重写后使用
        return "input => " + input;
    }
}