package test;

public class logicTest2 {
    public static void main(String[] args) {
        //no.1
        {
            int x = 1, y = 1;
            if (x++ == 2 & ++y == 2) {
                x = 7;
            }
            System.out.println("x = " + x + ";y = " + y);
        }

        //no.2
        {
            int x = 1, y = 1;
            if (x++ == 2 && ++y == 2) {
                x = 7;
            }
            System.out.println("x = " + x + ";y = " + y);
        }

        //no.3
        {
            int x = 1, y = 1;
            if (x++ == 1 | ++y == 1) {
                x = 7;
            }
            System.out.println("x = " + x + ";y = " + y);
        }

        //no.4
        {
            int x = 1, y = 1;
            if (x++ == 1 || ++y == 1) {
                x = 7;
            }
            System.out.println("x = " + x + ";y = " + y);
        }
    }
}
