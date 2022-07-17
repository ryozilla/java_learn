package train7;

/*
 * 交通灯亮几秒？
 * 使用 instanceof 关键字模拟交通红绿灯的点亮时间，控制台输出如下内容：
 * ------------
 * 红灯亮45秒
 * 黄灯亮5秒
 * 绿灯亮30秒
 * */
public class Training14 {
    public static void main(String[] args) {
        light(new RedLight());
        light(new YellowLight());
        light(new GreenLight());
    }

    protected static void light(TrafficLight light) {
        //使用静态方法实现多态效果
        if (light instanceof RedLight) {
            System.out.println("红灯亮45秒");
        } else if (light instanceof YellowLight) {
            System.out.println("黄灯亮5秒");
        } else if (light instanceof GreenLight) {
            System.out.println("绿灯亮30秒");
        } else {
            System.out.println("？");
        }
    }
}

class TrafficLight {

}

class RedLight extends TrafficLight {

}

class GreenLight extends TrafficLight {

}

class YellowLight extends TrafficLight {

}