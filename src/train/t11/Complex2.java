package train.t11;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 找出1~100内都有哪些数符合勾股数
 * */
public class Complex2 {
    static ArrayList<int[]> pythagoreanNumbers = new ArrayList<>();    //储存勾股数

    public static void main(String[] args) {
        findPythagoreanNumbers();
        //遍历Arraylist,将里面的数组打印出来
        System.out.println("----------------勾股数----------------");
        for (int[] ints : pythagoreanNumbers) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private static void findPythagoreanNumbers() {
        //找出勾股数
        for (int i = 1; i < 101; i++) {
            for (int j = i + 1; j < 101; j++) {
                for (int k = j + 1; k < 101; k++) {
                    if (i * i + j * j == k * k) {
                        pythagoreanNumbers.add(new int[]{i, j, k});
                    }
                }
            }
        }
    }
}
