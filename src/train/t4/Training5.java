package train.t4;

/*
 * 蜗牛爬井
 * 一只蜗牛从井底向井口爬，白天向上爬2米，晚上向下滑1米，井深10m。
 * 问多少天可以爬到井口？
 * */
public class Training5 {
    public static void main(String[] args) {
        int top = 10;
        int height = 0;
        int day = 0;
        while (height <= top) {
            day++;
            height += 2;
            if (height >= top) {
                System.out.println("蜗牛爬出去了！在第 " + day + " 天");
                break;
            }
            height--;
        }
    }
}
