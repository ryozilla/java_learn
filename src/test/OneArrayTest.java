package test;


import java.util.Arrays;

public class OneArrayTest {
    public static void printArray(String[] arr) {
        //打印一维数组
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i + 1 == arr.length) continue;
            System.out.print(" ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        //一维数组
        int[] arr1 = new int[]{1, 3, 5};
        String arr2[] = new String[4];      // C/C++语言的声明风格
        arr2[0] = "I";
        arr2[1] = "have";
        arr2[2] = "a";
        arr2[3] = "pen";
        boolean[] arr3 = {true, false};

        //遍历数组
        printArray(arr2);
        System.out.println();

        //使用foreach语句遍历数组
        for (int x : arr1) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();

        //使用java.util.Array的toString方法输出数组
        System.out.println(Arrays.toString(arr3));

        System.out.println("\n");
        //输出"几月有几天" (不管闰年)
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month.length; i++) {
            System.out.println((i + 1) + "月有" + month[i] + "天");
        }

    }
}
