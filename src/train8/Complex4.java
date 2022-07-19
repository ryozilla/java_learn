package train8;

/*
 * 匿名类实现让小狗跑
 * 参照下面的代码，创建 Moveable 接口的匿名子类对象，重写run()方法，
 * 执行该方法后会在控制台打印“小狗向前跑”字样。
 * -------------------------
 * interface Moveable {
 *      void run ();
 * }
 * */
public class Complex4 {
    public static void main(String[] args) {
        new Dog() {
            @Override
            public void run() {
                System.out.println("小狗向前跑");
            }
        }.run();
    }
}

interface MoveAble {
    void run();
}

abstract class Dog implements MoveAble {

}