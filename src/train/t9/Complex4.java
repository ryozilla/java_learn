package train.t9;

/*
 * 乘法引发的异常
 * 创建 Number 类，通过类中的方法 count() 可得到两个数据类型为 int 型的整数相乘后的结果，
 * 在调用该方法的主方法中使用 try - catch 语句捕捉12315乘以57876876可能发生的异常。
 * */
public class Complex4 {
    public static void main(String[] args) {
        try {
            System.out.println(count(12315, 57876876));
        } catch (Exception e) {
            System.out.println("已执行catch语句中的代码");
            throw new RuntimeException(e);
        }
    }

    protected static int count(int x, int y) throws Exception {
        long lo = (long) x * y;
        int result = x * y;
        if ((result + "").equals(lo + "")) {
            return result;
        } else {
            throw new Exception("not true result");
        }
    }
}
