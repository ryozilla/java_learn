package train.t4;

/*
 * 细胞分裂实验
 * 生物实验室做单细胞细菌繁殖实验，每一代细菌数量都会成倍数增长，
 * 一代菌落中只有一个细菌，二代菌落中分裂成两个细菌，三代菌落中分裂成4个细菌，以此类推，
 * 请算第十代菌落中的细菌数量。
 * */
public class Training3 {
    public static void main(String[] args) {
        int num = 1;
        int i = 0;
        while (i < 10) {
            num *= 2;
            i++;
        }
        System.out.println("第十代菌落中的细菌有 " + num + " 个。");
    }
}
