package test;

import java.util.Scanner;

public class switchTest {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //switch
        //switch后的表达式必须是"整型" -> (case后面不能写小数)、字符型、字符串、枚举类型。

        //整型
        int num1 = 2;
        switch (num1) {
            case 1:
                System.out.println("223");
                break;
            //break用于跳出switch语句
            //不加break程序会继续向下执行
            //知道遇到break或运行完整个语句
            case 2:
                System.out.println("233");
                break;
            default:
                System.out.println("0");
                break;
        }

        //字符型
        char cha = 'c';
        switch (cha) {
            case 97:
                System.out.println(cha);
                break;
            case 'c':
                System.out.println("it's 'c'!");
                break;
            default:
                System.out.println("Unexpected value: " + cha);
                break;
        }

        //字符串
        System.out.println("请输入\"密码\"");
        String str = scan.nextLine();
        switch (str){
            case "114514":
                System.out.println("这是密码1（臭码1）");
                break;
            case "1919810":
                System.out.println("这是密码2（臭码2）");
                break;
            case "12553322":
                System.out.println("这是密码3（kano）");
                break;
            case "mahoro":
                System.out.println("这是密码4（mahoro）");
                break;
            default:
                System.out.println("不包含在其中（can't find）");
                break;
        }

        //switch增强型
        /*
        * 使用 "->"
        * 由于需要返回值，故需要确保在所有的情况下都有返回值，所以"需要涵盖所有可能的情况"
        * 不再需要 break
        * 可以进行 case 的合并，之间以逗号分隔
        * */
        int tag = 1;
        String result = switch (tag){
            case 1 -> "401";
            case 2 -> "402";
            case 3 -> "403";
            default -> "404";
        };
        //声明变量后带的分号
        System.out.println(result);
    }
}
