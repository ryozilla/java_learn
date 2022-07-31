package train.t10;
/*
* 屏蔽手机号中间四位的值
* 屏蔽手机号中间四位的值，例如“133****9865”
* */
public class Training14 {
    public static void main(String[] args) {
        StringBuilder telephoneNumber = new StringBuilder("13313339865");
        telephoneNumber.delete(3,7).insert(3,"****");
        System.out.println(telephoneNumber);
    }
}
