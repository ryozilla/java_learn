package train5;

/*
 * 矩阵转置
 * 交换二维数组“int[][] array = {{91,25,8},{56,14,2},{47,3,67}};”的行、列数据。
 * */

import methods.Array;

public class Complex2 {
    public static void main(String[] args) {
        int[][] array = {{91, 25, 8}, {56, 14, 2}, {47, 3, 67}};
        System.out.println("原数组：");
        Array.printArray(array);

        System.out.println("新数组：");
        exchangeRowAndList(array);
        Array.printArray(array);
    }

    public static int[][] exchangeRowAndList(int[][] arr) {
        for (int i = 0; i <= arr.length / 2; i++) {
            for (int j = 0; j <= arr[i].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
}
