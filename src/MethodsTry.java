import methods.Array;
// 列
public class MethodsTry {
    public static void main(String[] args){
        String[][] strArr= new String[5][5];

        for (int row = 0; row < strArr.length; row++) {
            for (int list = 0; list < strArr[row].length; list++) {
                strArr[row][list] = "(" + row + "," + list + ")";
            }
        }
        Array.printArray(strArr);
        System.out.println("----------------------------");
        Array.exchangeRowAndList(strArr);
        Array.printArray(strArr);
    }
}
