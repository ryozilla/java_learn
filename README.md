# java_learn

作为一个初学者跟着《java从入门到精通》及其他资料敲的练习代码。

## 尚未解决的问题

- Math 将三个方法的返回值设成double了，等学了Integer类后再改
- train.t5.Complex5 现在是四子棋状态，还不知道有什么bug

## 其中一些可以运行来玩玩的小实例

- 细胞分裂实验 -> train.t4.Training3
- 斐波那契数列 -> train.t4.Training4
- 查找素数 -> train.t4.Complex5
- 判断int[3][3]数组每行每列以及每个对角线的值相加是否都相同 -> train.t5.Complex1
- 矩阵转置 -> train.t5.Complex2
- 输出杨辉三角 -> train.t5.Complex3（还有问题）
- 推箱子（固定地图） -> train.t5.Complex4
- 厘米与英寸互转 -> train.t6.Complex4

## methods包里的类方法

### Maths

- public static double factorial(int x) -> 计算阶乘
- public static double arrangement(int n, int m) -> 计算排列数
- public static double combination(int n, int m) -> 计算组合数
- public static boolean isPrime(int n) -> 判断一个整数是不是素数
- public static int calcGCD(int x, int y) -> 找出两个数的最大公因数

### Array

- printArray() -> 打印数组
    - public static void printArray(int[] arr)
    - public static void printArray(String[] arr)
    - public static void printArray(double[] arr)
    - public static void printArray(char[] arr)
    - public static void printArray(boolean[] arr)
    - public static void printArray(int[][] arr)
    - public static void printArray(String[][] arr)

- exchangeRowAndList() -> 矩阵转置,交换二维数组的行和列
    - public static void exchangeRowAndList(int[][] arr)
    - public static void exchangeRowAndList(String[][] arr)

### JapaneseTurn

- public static String romajiToKatakana(String romaji, String regex) -> 罗马字转平假名
  - 目前不支持长音连写、促音...