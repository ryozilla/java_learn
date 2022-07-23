package train.t3;

/*
 * 货车装西瓜
 * 一货车的车厢长400厘米、宽160厘米、高30厘米，
 * 现有100个直径约为23厘米的西瓜。
 * 问：这辆货车满载时能装多少个西瓜？实际能装多少个西瓜？
 * */
public class Complex8 {
    public static void main(String[] args) {
        int l = (int) (400 / 23);
        int w = (int) (160 / 23);
        int h = (int) (30 / 23);
        int result = l * w * h;
        System.out.println("最多可以装 " + result + " 个西瓜");
        System.out.println((result >= 100) ? "实际可以装 100 个西瓜" : "实际可以装 " + result + " 个西瓜");
    }
}
