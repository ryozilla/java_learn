package train.t5;

import test.TwoArrayTest;

import java.util.Arrays;

/*
 * 模拟书柜放书
 * 一个私人书柜有3层2列，分别向该书柜第1层第1列放入历史类读物，向该书柜第2层第1列放入经济类读物，向该书柜第2层第2列放入现代科学类读物。
 * 创建一个二维数组，并给该二维数组赋值。
 * */
public class Training3 {
    public static void main(String[] args) {
        //图个方便
        String history = "历史类读物";
        String economy = "经济类读物";
        String science = "现代科学类读物";
        String otherBook = "其它类书籍";

        //bookcase数组初始化
        String[][] bookcase;
        bookcase = new String[2][3];
        Arrays.fill(bookcase[0], otherBook);
        Arrays.fill(bookcase[1], otherBook);

        //赋值
        bookcase[0][0] = history;
        bookcase[1][0] = economy;
        bookcase[1][1] = science;
        TwoArrayTest.printArray(bookcase);
    }
}
