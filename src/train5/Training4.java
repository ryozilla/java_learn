package train5;

/*
 * 输出古诗
 * 创建 Poetry 类，声明一个字符型二维数组，
 * 将古诗《春晓》的内容赋值于二维数组，然后分别用横版和竖版两种方式输出。
 * */
public class Training4 {
    private static void printPoetryYoko(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void printPoetryTate(char[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {       //这样不能输出任意长度的诗
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String chunxiaoStr = "春眠不觉晓处处闻啼鸟夜来风雨声花落知多少";
        char[][] chunxiaoArr = new char[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                chunxiaoArr[i][j] = chunxiaoStr.charAt(j + i * 5);
            }
        }
        printPoetryYoko(chunxiaoArr);
        System.out.println();
        printPoetryTate(chunxiaoArr);
    }
}
