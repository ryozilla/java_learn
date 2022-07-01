package test;

public class TwoArrayTest {
    public static void printArray(String[][] arr) {
        //打印二维数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j + 1 == arr[i].length) continue;
                System.out.print(" ");
            }
            System.out.print("]");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //二维数组

        //声明二维数组
        int[][] arr1 = new int[3][4];
        double[][] arr2 = new double[][]{{2.0, 3.0, 3.0}, {3.0, 4.5, 5.3}};
        String[][] arr3 = new String[2][4];
        arr3[0][0] = "I";
        arr3[0][1] = "have";
        arr3[0][2] = "a";
        arr3[0][3] = "pen";
        arr3[1][0] = "I";
        arr3[1][1] = "have";
        arr3[1][2] = "an";
        arr3[1][3] = "apple";

        //System.out.println(Arrays.toString(arr3));
        //System.out.println(Arrays.toString(arr3[0]));
        //System.out.println(Arrays.toString(arr3[1]));
        printArray(arr3);

        //输出3行4列的矩阵
        int[][] arr4 = new int[3][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }
    }
}
