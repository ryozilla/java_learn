package train.t8;

/*
 * 让心脏成为内部类
 * 创建一个人类，人类中包含一个内部类——心脏类。当人类执行走路方法时、心脏方法也会同时执行。
 * */
public class Training3 {
    public static void main(String[] args) {
        Human human = new Human();
        human.walk();
    }
}

class Human {
    Heart heart = new Heart();

    protected void walk() {
        System.out.println("人在走路");
        heart.heart();
    }

    static class Heart {
        protected void heart() {
            System.out.println("心脏跳动");
        }
    }
}