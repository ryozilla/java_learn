package train.t3;

/*
 * 货车装箱子
 * 一辆货车运输箱子，载货区宽2米、长4米，一个箱子宽1.5米、长1.5米,
 * 请问载货区一层可以放多少个箱子?
 * */
public class Training8 {
    public static void main(String[] args) {
        int area = 2 * 4;
        double box = 1.5 * 1.5;

        int result = (int) (area / box);
        System.out.println(result);
    }
}
