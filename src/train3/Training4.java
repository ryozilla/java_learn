package train3;

//输出"ABCDEFG"
public class Training4 {
    public static void main(String[] args) {
        char cha = 'A';
        //System.out.println(cha);
        while (cha <= 71) {
            System.out.print(cha);
            int num = cha + 1;
            cha = (char) num; //强制类型转换
        }
        System.out.println();
        System.out.println("执行完成");
    }
}
