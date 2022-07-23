package train.t9;

import java.util.Arrays;

/*
 * 数组发生的异常
 * 在控制台上简述一个整型数组(如int[] arr = {1, 2, 3, 4})遍历的过程：
 * 并体现出当 i 的值为多少时，会产生异常，异常的种类是什么？
 * */
public class Complex3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length + 1; i++) {
            try {
                System.out.println("此时i的值为：" + i);
                System.out.println("此时遍历出arr[i] = " + arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("当 i = " + i + "时，产生了异常（数组下标越界）");
                e.printStackTrace();
            }
        }
    }
}
