package train.t6;

/*
 * 购买电影票
 * 购买电影票有优惠：
 * 满18周岁的付40元，未满18周岁的享受半价。
 * 更用成员变量、成员方法、构造方法和 this 关键字，控制台输出如下所示的姓名、年龄、票价等信息。
 * */
public class Complex2 {
    static String blank = "    ";   //打印信息用

    public static void main(String[] args) {
        CinemaPeople people1 = new CinemaPeople("李明", 20);
        CinemaPeople people2 = new CinemaPeople("钱丽", 16);
        CinemaPeople people3 = new CinemaPeople("周刚", 8);
        CinemaPeople people4 = new CinemaPeople("吴红", 32);

        //打印信息到控制台
        System.out.println("姓名" + blank + "年龄" + blank + "票价");
        people1.printInfo();
        people2.printInfo();
        people3.printInfo();
        people4.printInfo();
    }
}

class CinemaPeople {
    static String blank = "     ";   //打印信息用
    String name;
    int age;
    int fare;

    public CinemaPeople(String name, int age) {
        //构造方法
        this.name = name;
        this.age = age;
        if (age < 18) {
            fare = 20;
        } else {
            fare = 40;
        }
    }

    public void printInfo() {
        //打印对象信息
        System.out.print(name + blank);
        System.out.print(age + blank);
        System.out.println(fare);
    }
}
