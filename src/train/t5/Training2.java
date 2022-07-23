package train.t5;

import methods.Array;

/*
 * 寻找空储物箱
 * 超市有20个储物箱，现第2、3、5、8、12、13、16、19、20号尚未使用，
 * 使用数组的长度分别输出尚未使用的储物箱个数以及已经使用的储物箱个数。
 * */
public class Training2 {
    public static void main(String[] args) {
        boolean[] used = new boolean[20];
        Array.printArray(used);  //boolean数组初始值为false
        used[1] = used[2] = used[4] = used[7] = used[11] = used[12] = used[15] = used[18] = used[19] = true;
        int count = 0;
        for (int i = 0; i < used.length; i++) {
            if (used[i]) count++;
        }
        System.out.println("有" + count + "个储物箱尚未使用");
    }
}
