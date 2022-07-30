package train.t10;

/*
 * 3种形式创建字符串
 * 用上述3种方式创建内容为:"要么你主宰生活，要么你被生活主宰。﹣吉姆·罗恩"的字符串对象。
 * */
public class Training1 {
    public static void main(String[] args) {
        String str1 = "要么你主宰生活，要么你被生活主宰。﹣吉姆·罗恩";
        char[] cha1 = new char[]{'要', '么', '你', '主', '宰', '生', '活', '，', '要', '么', '你', '被', '生', '活', '主', '宰', '。', '﹣', '吉', '姆', '·', '罗', '恩',};
        String str2 = new String(cha1);
        String str3 = new String(cha1, 0, cha1.length);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
