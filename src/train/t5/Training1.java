package train.t5;

/*
 * 使用一维数组存储键盘字母
 * 分别把键盘上每一排字母按键都保存成一个一维数组，利用数组长度分别输出键盘中3排字母键的个数。
 * */
public class Training1 {
    public static void main(String[] args) {
        String[] row1 = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"};
        String[] row2 = {"A", "S", "D", "F", "G", "H", "J", "K", "L"};
        String[] row3 = {"Z", "X", "C", "V", "B", "N", "M"};

        System.out.println("第一排有" + row1.length + "个字母");
        System.out.println("第二排有" + row2.length + "个字母");
        System.out.println("第三排有" + row3.length + "个字母");
    }
}
