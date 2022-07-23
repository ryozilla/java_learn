package train.t6;

/*
 * 汽车加油
 * 一辆汽车的油箱为30L，油箱里现剩余6L汽油。
 * 加油站每5秒为这辆汽车加2L汽油直至加满，控制台输出加油过程和加油时间。
 * */
public class Training1 {
    public static void main(String[] args) {
        int maxOil = 30;    //油箱容积
        int nowOil = 6;     //剩余汽油量
        int time = 5;      //加油2L时间
        System.out.println("汽车加了0秒油，油箱内还有6L油。");
        for (int i = 1; nowOil < maxOil; i++) {
            nowOil += 2;
            System.out.println("汽车加了" + (i * time) + "秒油，油箱内还有" + nowOil + "L油。");
        }
        System.out.println("汽车加油完毕，油箱内还有" + nowOil + "L油。");
    }
}