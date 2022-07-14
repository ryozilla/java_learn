package train7;

/*
 * 鸡是不是鸟？
 * 判断“鸡是不是鸟”并阐明依据（鸡是鸟的子类，所以鸡是鸟）。
 * */
public class Training7 {
    public static void main(String[] args) {
        boolean result = new Chicken() instanceof Bird;
        System.out.println("因为 result = " + result + "，所以鸡是鸟");
    }
}

class Bird {

}

class Chicken extends Bird {

}