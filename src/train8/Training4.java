package train8;

/*
 * 猫吃鱼，狗吃肉。
 * 参照下面的代码，创建 Animal 类的匿名子类对象，
 * 重写 eat()方法，执行方法后会在控制台打印“猫吃鱼，狗吃肉”字样。
 * */
public class Training4 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("猫吃鱼，狗吃肉");
            }
        };
        animal.eat();
    }
}

abstract class Animal {
    abstract void eat();
}