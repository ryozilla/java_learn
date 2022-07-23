package train.t9;

/*
 * 引发越界异常
 * 编写一个简单的程序，使之产生越界异常(IndexOutOfBoundsException)。
 * */
public class Complex1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[3] = 1;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("已执行catch语句中的代码");
            e.printStackTrace();
        }
    }
}
