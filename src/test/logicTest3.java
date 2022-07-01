package test;

public class logicTest3 {
    public static void main(String[] args) {
        boolean x = true, y = false;
        short z = 42;
        //if(y == true)
            if ((z++ == 42) && (y = true)) {
                z++;
            }

        if ((x = false) || (++z == 45)) {
            z++;
        }
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}