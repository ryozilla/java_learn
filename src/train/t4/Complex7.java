package train.t4;

/*
 * 摄氏度转华氏度
 * 使用 do .… while 循环，在控制台输出摄氏温度与华氏温度的对照表。
 * 对照表从摄氏温度﹣30℃到50℃，每行间隔10℃，
 * */
public class Complex7 {
    public static double fromCtoF(double x) {
        return (1.8 * x + 32);
    }

    public static void main(String[] args) {
        double temperature = -30.0;
        do {
            System.out.println("摄氏温度： " + temperature + "℃ 华氏温度： " + fromCtoF(temperature) + "℉");
            temperature += 10;
        } while (temperature <= 50);
    }
}
