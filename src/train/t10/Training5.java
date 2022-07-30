package train.t10;

/*
 * 判断某文字只出现一次
 * 设计一个方法，判断某段文字是否在指定字符串中只出现一次。
 * */
public class Training5 {
    public static void main(String[] args) {
        String str = "Hello";
        isOnceAppear(str,"H");
        isOnceAppear(str,"l");
    }

    protected static boolean isOnceAppear(String str, String index) {
        boolean result = str.indexOf(index) == str.lastIndexOf(index);
        if (result){
            System.out.println(index + "确实只存在一个");
        }else {
            System.out.println(index + "不止一个");
        }
        return result;
    }
}
