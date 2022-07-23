package train.t3;

/*
 * 输出连续的英文字母
 * 使用 char 型声明 'a'~'g' ，然后输出它们相加后的结果。
 * */
public class Training7 {
    public static void main(String[] args) {
        char a = 'a';

        int sum = 0;
        while (a < 104) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
