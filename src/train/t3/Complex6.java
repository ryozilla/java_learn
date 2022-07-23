package train.t3;

/*
 * 判断成绩会否及格
 * 当分数大于等于60时，成绩及格，否则不及格。
 * 现一学生的分数是80分，使用三元运算符判断这名学生的成绩能否及格。
 * */
public class Complex6 {
    public static void main(String[] args) {
        int score = 80;
        boolean pass = (score >= 60) ? true : false;
        if (pass == true) {
            System.out.println("该生及格");
        } else {
            System.out.println("该生不及格");
        }
    }
}
