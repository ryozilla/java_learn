package train3;

/*
 * 计算月收入小李每月的工资是4500元，每月的奖金是1000元，每月要缴纳的五险﹣金合计是500元，
 * 计算小李每月的最终收入是多少？
 * */
public class Complex4 {
    public static void main(String[] args) {
        int salary = 4500;
        int bonus = 1000;
        int tax = 500;

        //计算结果
        int money = salary + bonus - tax;
        System.out.println(money);
    }
}
