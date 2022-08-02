package methods;

public class Array {
    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] arr) {
        for (double v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static <T> void printArray(T[][] arr) {
        for (T[] ts : arr) {
            for (T t : ts) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(boolean[] arr) {
        //打印一维数组
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i + 1 == arr.length) continue;
            System.out.print(" ");
        }
        System.out.println("]");
    }

    public static <T> void exchangeRowAndList(T[][] arr) {
        //交换二维数组的行和列
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                T temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
