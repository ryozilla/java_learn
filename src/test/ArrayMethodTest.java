package test;

import java.util.Arrays;

public class ArrayMethodTest {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"EQ", "Compressor", "De-noise"};
        String[][] arr2 = new String[][]{{"no.1", "no.2", "no.9"}, {"①", "②", "⑨"}};

        //遍历数组
        OneArrayTest.printArray(arr1);
        TwoArrayTest.printArray(arr2);
        System.out.println();

        //填充 -> fill()
        {
            Arrays.fill(arr1, "error");
            OneArrayTest.printArray(arr1);
            Arrays.fill(arr2[1], 1, 2, "⑧");   //填充时fromIndex包含，toIndex不包含
            TwoArrayTest.printArray(arr2);
        }
        OneArrayTest.printArray(arr1);      //在作用域内填充过的外部数组（相对）在过了这个作用域后也是被填充之后的数组

    }
}
