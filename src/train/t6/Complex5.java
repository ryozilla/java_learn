package train.t6;

/*
 * 多种权限的工具类
 * 创建一个类，该类中getRandomNumber()方法可以被所有人使用，
 * setNumber()方法只可以被同包下的类使用，
 * sort()方法只能自己使用。
 * */
public class Complex5 {
    public static void getRandomNumber() {
        System.out.println("这个方法可以被所有人使用");
    }

    protected static void setNumber() {
        System.out.println("这个方法可以被同包下的类使用");
    }

    private static void sort() {
        System.out.println("这个方法只能本类使用");
    }

    public static void main(String[] args) {
        //因为懒得在不同位置新建类就摆了
        //想看效果随便找一个类写一下就是了
        getRandomNumber();
        setNumber();
        sort();
    }
}
