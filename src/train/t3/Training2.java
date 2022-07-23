package train.t3;

/*
 * 谁该缴税
 * 员工a月薪4500元，员工b月薪5500元，判断哪位员工需要缴纳个人所得税，哪位员工不需要缴纳个人所得税。
 * （假设工资、薪金的个税起征点为5000元）
 */
public class Training2 {
    public static void main(String[] args) {
        int salaryA = 4500;
        int salaryB = 5500;

        //判断a是否缴税
        if (salaryA > 5000) System.out.println("员工a需要缴税");
        else System.out.println("员工a不需要缴税");

        //判断b是否缴税
        if (salaryB > 5000) System.out.println("员工b需要缴税");
        else System.out.println("员工b不需要缴税");

        System.out.println("执行完毕");
    }
}
