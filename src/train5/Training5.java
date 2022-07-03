package train5;

import java.util.Arrays;

/*
 * 鸡蛋装箱（一）
 * 某鸡蛋公司准备好10个包装箱，每箱装60枚鸡蛋。
 * 由于机器故障，每箱少装了2枚鸡蛋，使用数组的相关知识体现该过程。
 * */
public class Training5 {
    public static void main(String[] args) {
        int[] boxes = new int[10];
        Arrays.fill(boxes, (60 - 2));
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("第" + (i + 1) + "箱装了" + boxes[i] + "枚鸡蛋");
        }
    }
}
