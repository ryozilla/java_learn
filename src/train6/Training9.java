package train6;

/*
 * 创建猫类
 * 编写一个猫类，然后分别创建3只猫的对象，分别是黑猫、白猫和黄猫，
 * 让3只猫都去抓老鼠。
 * */
public class Training9 {
    public static void main(String[] args) {
        Cat blackCat = new Cat("黑");
        Cat whiteCat = new Cat("白");
        Cat yellowCat = new Cat("黄");
        blackCat.catchMice();
        whiteCat.catchMice();
        yellowCat.catchMice();
    }
}

class Cat {
    String color;

    public Cat(String color) {
        //构造方法
        this.color = color;
    }

    public Cat() {
        //无参构造方法
        this("无色(?)");
    }

    public void catchMice() {
        System.out.println(this.color + "猫去抓老鼠");
    }
}