package train.t11;

import java.util.Arrays;
import java.util.Random;

/*
 * 求偶教和
 * 尝试开发一个程序，获取2~32（不包括32）的6个偶数，并求得这6个偶教和
 * */
public class Training3 {
    static Random random = new Random();

    public static void main(String[] args) {
        //获取6个偶数
        int[] nums = new int[6];
        for (int i = 0; i < 6; i++) {
            while (true) {
                int num = random.nextInt(2,32);
                if (num % 2 == 0) {
                    nums[i] = num;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(sumArray(nums));
    }

    public static int sumArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
