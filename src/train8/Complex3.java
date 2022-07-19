package train8;

/*
 * 吃水果
 * 创建一个抽象的水果类，类中有一个获取水果名称的抽象方法。
 * 创建人类，人类有个吃的方法，参数类型为水果类型，并可以在控制台打印吃了什么。
 * 请用匿名类创建吃方法的参数，让人类吃苹果和香蕉。
 * */
public class Complex3 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit() {
            @Override
            String getFruitName() {
                return "苹果和香蕉";
            }
        };
        new People().eat(fruit);
    }
}

abstract class Fruit {
    abstract String getFruitName();
}

class People {
    protected void eat(Fruit fruit) {
        System.out.println("人类吃" + fruit.getFruitName());
    }
}