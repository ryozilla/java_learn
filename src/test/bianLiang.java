package test;

public class bianLiang {
    public static void main(String[] args) {
        //数值运算

        //int + int
        int num1 = 114, num2 = 514;
        int kekka = num1 + num2;
        //System.out.println("1: " + kekka);

        //float + double
        float flo1 = (float) 114.514;
        //System.out.println(flo1);
        double flo2 = 1919.810;
        double flo3 = flo1 + flo2;
        //System.out.println("2: " + flo3);
        //1919.810位数太多导致运算结果对不上了

        double flo4 = 38.611, flo5 = 30.084;
        double flo6 = flo4 + flo5;
        //System.out.println("3: " + flo6);

        double num3 = num1 + flo1;
        //System.out.println("4: " + num3);

        //char + int
        char cha1 = '1';
        int num4 = 3;
        int num5 = cha1 + num4;
        char cha2 = (char) (cha1 + num4);
        //System.out.println("int: " + num5);
        //System.out.println("char: " + cha2);

        //byte + short
        byte num6 = 64;
        short num7 = 128;
        int num8 = num6 + num7;
        byte num9 = (byte) (num6 + num7);
        //System.out.println("int: " + num8);
        //System.out.println("byte: " + num9); // byte范围：-128 ~ 127,
    }
}
