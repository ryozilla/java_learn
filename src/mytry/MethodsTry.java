package mytry;

import methods.Maths;
import MyException.NumberErrorException;

public class MethodsTry {
    public static void main(String[] args) throws NumberErrorException {
        /*
        //矩阵转置
        String[][] strArr1 = new String[5][5];

        for (int row = 0; row < strArr1.length; row++) {
            for (int list = 0; list < strArr1[row].length; list++) {
                strArr1[row][list] = "(" + row + "," + list + ")";
            }
        }
        Array.printArray(strArr1);
        line();
        Array.exchangeRowAndList(strArr1);
        Array.printArray(strArr1);
        line();
         */

        /*
        //探究了一下train5.Complex4答案怎么让&移动
        String[][] strArr2 = new String[5][5];
        for (int i = 0; i < strArr2.length; i++) {
            Arrays.fill(strArr2[i], "　");
        }
        int x = 1, y = 1;// &坐标
        strArr2[x][y] = "&";
        Array.printArray(strArr2);
        line();
        strArr2[x][y] = "　";    //&离开旧位置
        x += 2;
        y++;
        strArr2[x][y] = "&";    //&新位置
        Array.printArray(strArr2);
         */

        try {
            System.out.println(Maths.factorial(-1));
        } catch (NumberErrorException e) {
            e.printStackTrace();
        }
    }

    private static void line() {
        //图个方便
        System.out.println("----------------------------");
    }
}
