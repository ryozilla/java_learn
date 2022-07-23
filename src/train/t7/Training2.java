package train.t7;

/*
 * 水果售价
 * 使用继承展示经过人工包装的水果与普通水果在价格上的区别。
 * */
public class Training2 {
    public static void main(String[] args) {
        System.out.println("本应为5元一斤的某水果");
        System.out.println(new fruit(5));
        System.out.println(new DecoratedFruit(5));
    }
}

class fruit {
    double price;

    protected fruit(double price) {
        this.price = price;
    }

    public String toString() {
        return "普通水果的价格：" + price + "元/斤";
    }
}

class DecoratedFruit extends fruit {
    double nowPrice;

    protected DecoratedFruit(double price) {
        super(price);
        nowPrice = price * 1.2;
    }

    public String toString() {
        return "人工包装后的水果价格：" + nowPrice + "元/斤";
    }
}