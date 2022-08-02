package train.t11;

import java.util.Arrays;

/*
 * 坐标移动
 * 一个小球在直角坐标系中的坐标位置是（15,4)，
 * 它向与竖直线成30角的东北方向移动了100个单位的距离，
 * 请问小球移动后的坐标是多少？
 * */
public class Complex3 {
    public static void main(String[] args) {
        double[] position = new double[]{15, 4};
        //计算现在的位置
        position[0] += 100 * Math.sin(Math.PI / 6);
        position[1] += 100 * Math.cos(Math.PI / 6);
        System.out.println("现在的位置：" + Arrays.toString(position));
    }
}
