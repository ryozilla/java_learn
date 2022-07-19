package train7;

/*
 * 景区游客人数
 * 创建3个接口，分别表示可增加的接口 Addable ，可减少的接口 Reducible 和可变化的接ロ Changeable ，
 * 其中接ロ Changeable 同时继承接口 Addable 和接口 Reducible 。
 * 接口 Addable 中有一个表示增加的抽象方法add()，
 * 接口 Reducible 中有一个表示减少的抽象方法reduce()，
 * 接ロ Changeable 中有一个表示均匀变化30个单位的常量 UNITS 。
 * 创建一个人数类 Number ,使之实现接ロ Changeable 。
 * 编写一个程序模拟如下场景：
 * 某景区只允许*满载*30人的大巴车进出，当天自景区开放起，已驶入景区的大巴车有7辆，驶出景区的大巴车有4辆，
 * 计算景区里还有多少人？
 * */
public class Complex8 {
    public static void main(String[] args) {
        Number peopleNum = new Number(7, 4);
        System.out.println("此时景区人数为：" + peopleNum.number + "人");
    }
}

interface Addable {
    void add();
}

interface Reducible {
    void reduce();
}

interface Changeable extends Addable, Reducible {
    int UNITS = 30;    //大巴车的容量
}

class Number implements Changeable {
    //人数类
    int number = 0;

    @Override
    public void add() {
        number += UNITS;
    }

    @Override
    public void reduce() {
        if (number - UNITS <= 0) {
            System.out.println("人数不够被大巴车运出啦");
            return;
        }
        number -= UNITS;
    }

    protected Number(int add, int reduce) {
        //初始化人数
        int num = add - reduce;
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                this.add();
            }
        } else if (num < 0) {
            for (int i = 0; i < -num; i++) {
                this.reduce();
            }
        }
    }

    protected Number() {
        this(0, 0);
    }
}