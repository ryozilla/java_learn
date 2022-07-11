package train6;

import java.util.Arrays;

/*
 * 交换数组元素
 * 现有一个整型数组 int[] a = {1, 3, 5, 7};
 * 编写一段代码，将这个数组的第一个元素值与第三个元素值进行交换，第二个元素值与第四个元素值进行交换，
 * 最后输出数组交换后的结果。
 * */
public class Training2 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        //交换第一个元素和第三个元素
        int temp = a[0];
        a[0] = a[2];
        a[2] = temp;
        //交换第二个元素和第四个元素
        temp = a[1];
        a[1] = a[3];
        a[3] = temp;
        //打印数组
        System.out.println(Arrays.toString(a));
    }
}
