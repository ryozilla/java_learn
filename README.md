# java_learn

作为一个初学者跟着《java从入门到精通》及其他资料敲的练习代码。

## 尚未解决的问题

- Math 计算阶乘数值错误的问题
- train3.Complex5 题目没看懂

## 其中一些可以运行来玩玩的小实例

- 细胞分裂实验 -> train4.Training3
- 斐波那契数列 -> train4.Training4
- 查找素数 -> train4.Complex5
- 判断int[3][3]数组每行每列以及每个对角线的值相加是否都相同 -> train5.Complex1
- 矩阵转置 -> train5.Complex2（未完成）
- 输出杨辉三角 -> train5.Complex3

## methods包里的类方法

### Math

- public static int factorial(int x) -> 计算阶乘
- public static int arrangement(int n, int m) -> 计算排列数
- public static int combination(int n, int m) -> 计算组合数

### Array

- printArray() -> 打印数组
    - public static void printArray(int[] arr)
    - public static void printArray(String[] arr)
    - public static void printArray(double[] arr)
    - public static void printArray(char[] arr)
    - public static void printArray(int[][] arr)
    - public static void printArray(String[][] arr)

- exchangeRowAndList() -> 矩阵转置,交换二维数组的行和列
    - public static void exchangeRowAndList(int[][] arr)
    - public static void exchangeRowAndList(String[][] arr)
