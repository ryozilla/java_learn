package train.t10;

/*
 * 常规转换符
 * 在控制台上输出“玩家1连续完成5次击杀后，获得了‘已超神’的称号”。
 * 其中，“玩家1”“5”“已超神”为变量的值
 * */
public class Training10 {
    public static void main(String[] args) {
        String player = "玩家1";
        int number = 5;
        String achievement = "已超神";

        String sentence = String.format("%s",player) + "连续完成" + String.format("%d",number) + "次击杀后，获得了\"" + String.format("%s",achievement) + "\"的称号";
        System.out.println(sentence);
    }
}
