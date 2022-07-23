package train.t9;

/*
 * 没带车钥匙
 * 使用 throws 关键字模拟一个生活场景：
 * 有位车主想打开车门，不巧的是，他发现自己没带车钥匙，
 * 引发了空指针异常（ NullPointerException )。
 * */
public class Training5 {
    static boolean keyTake = false;

    protected static void openCarDoor(boolean keyTake) throws NullPointerException {
        if (keyTake) {
            System.out.println("打开车门");
        } else {
            throw new NullPointerException("没带车钥匙，打不开车门");
        }
    }

    public static void main(String[] args) {
        System.out.println("有位车主想打开车门");
        System.out.println("不巧的是，他发现自己没带车钥匙");
        System.out.println("引发了空指针异常");
        try {
            openCarDoor(keyTake);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
