package test;

public class ariTest {
    public static void main(String[] args) {
        //运算符
        // + - * / % ++ --
        int a = +3, b = -5;
        System.out.println("a:" + a + " , " + "b:" + b);

        //加减乘除
        {
            int c = a + b;
            int d = a - b;
            int e = a * b;
            double f = (double) a / b;
            //double f = a / (b + 0.0);
            System.out.println("c:" + c);
            System.out.println("d:" + d);
            System.out.println("e:" + e);
            System.out.println("f:" + f);
            System.out.println();
        }

        //取模，取余
        {
            int g1 = 12, h1 = 8;
            System.out.println("g1:" + g1 + " , " + "h1:" + h1);
            System.out.println("g1 % h1 = " + g1 % h1);

            int g2 = 12, h2 = -8;
            System.out.println("g2:" + g2 + " , " + "h2:" + h2);
            System.out.println("g2 % h2 = " + g2 % h2);

            int g3 = -12, h3 = 8;
            System.out.println("g3:" + g3 + " , " + "h3:" + h3);
            System.out.println("g3 % h3 = " + g3 % h3);

            int g4 = -12, h4 = -8;
            System.out.println("g4:" + g4 + " , " + "h4:" + h4);
            System.out.println("g4 % h4 = " + g4 % h4);
            System.out.println();
        }

        //++ , --
        {
            int i1 = 1, j1 = i1++; //给i1++加括号ji也会等于1
            System.out.println("i1:" + i1 + " , " + "j1: " + j1);

            int i2 = 1, j2 = ++i2;
            System.out.println("i2:" + i2 + " , " + "j2: " + j2);

            //++,--不会改变数据类型
            byte k = 2;
            k++;
            System.out.println("k: " + k);
        }
    }
}
