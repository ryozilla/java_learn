package train.t7;

import methods.Array;

import java.util.Random;

/*
 * 老虎机
 * 老虎机有3个玻璃框，每个玻璃框中都有红、黄、蓝3张卡片。
 * 拉下拉杆后，每个玻璃框中的3张卡片同时开始转动。
 * 编写一个程序，使用 instanceof 关键字实现上述过程，并将每个玻璃框停止转动时的结果输出在控制台上。
 * 例如，“黄黄红”“蓝黄黄”“黄红黄”等。
 * */
public class Complex4 {
    public static void main(String[] args) {
        Slot slot = new Slot();
        Array.printArray(slot.getResult());
    }
}

class Slot {
    static Random random = new Random();
    String[] result = new String[3];

    //老虎机
    protected static String doIt() {
        //生成老虎机的结果
        int num = random.nextInt(0, 3);
        if (num == 0) {
            return "红";
        } else if (num == 1) {
            return "黄";
        } else if (num == 2) {
            return "蓝";
        }
        return null;
    }

    protected Slot() {
        //给结果赋值
        for (int i = 0; i < 3; i++) {
            result[i] = doIt();
        }
    }

    public String[] getResult() {
        return result;
    }
}