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

        //对数组进行排序
        int[] arr3 = {32, 81, 98, 27};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        //复制数组
        //copyOf() copyOfRange()
        String[] arr4 = arr1;
        String[] arr5 = Arrays.copyOf(arr1, 3);
        String[] arr6 = Arrays.copyOfRange(arr1, 0, 2);
        /* copyOf()方法从开头选到指定的位置构成新数组
         * copyOfRange()方法可以选择原数组其中一段构成新数组
         * 两者同样都是包含前者不包含后者 -> [from,to)
         */
        System.out.println(Arrays.toString(arr6));

        //如果修改新数组，原数组arr1是否有改变
        arr4[1] = "machigai";
        System.out.println(Arrays.toString(arr1));
        //原数组被修改代表arr4,arr1两个变量指向同一数组
        arr5[1] = "atari";
        System.out.println(Arrays.toString(arr5));
        System.out.println();

        //查询数组
        System.out.println(Arrays.binarySearch(arr3, 81));
        System.out.println(Arrays.binarySearch(arr3, 83));
        System.out.println(Arrays.binarySearch(arr1, "83"));
        /* 使用binarySearch()方法会返回查询值的位置信息。
         * 如果key在查询数组内即返回相应位置数值
         * 否则返回-1或“-”（插入点） -> 范围内第一个大于此键的元素索引
         */
        System.out.println();

        int[] arr7 = new int[]{32, 61, 49, 73, 64, 33, 81, 35, 99, 64, 82};
        Arrays.sort(arr7);
        System.out.println("arr7 : " + Arrays.toString(arr7));
        //binarySearch()方法也可以选择区间查询数组。
        System.out.println(Arrays.binarySearch(arr7, 2, 5, 36));
        //元素不在查询范围内的元素插入位置的输出和不加范围查询的输出结果应该是一样的。
        System.out.println(Arrays.binarySearch(arr7, 2, 5, 33));
        //本来在数组中的元素不在查询范围内，方法输出的值也是"-"（插入点）
    }
}
