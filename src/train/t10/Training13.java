package train.t10;

/*
 * 给字符串加标点
 * 给字符串“熊出没小心”加上标点符号（熊出没，小心；熊出，没小心）。
 * */
public class Training13 {
    public static void main(String[] args) {
        StringBuilder bear = new StringBuilder("熊出没小心");
        System.out.println(bear.insert(3, ","));
        bear.deleteCharAt(3);
        System.out.println(bear.insert(2, ","));
    }
}
