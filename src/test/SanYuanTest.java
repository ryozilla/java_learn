package test;

public class SanYuanTest {
    public static void main(String[] args) {
        int num = 10086;

        //三元运算符
        {
            num = (3 > 4) ? 1 : 0;
            System.out.println(num);
        }

        System.out.println(num);

        //if else语句
        {
            if (3 > 4) num = 1;
            else num = 0;
            System.out.println(num);
        }
    }
}
