package mytry;

import java.util.ArrayList;
/*
* 粗暴解决了一个北大强基数学题
* 相对应的知乎文章：[关于我不想自己算于是交给计算机暴力穷举求和这件事](https://zhuanlan.zhihu.com/p/543732386)
* */
public class QuestionSolve {
    public static void main(String[] args) {
        QSMethod qs = new QSMethod();
        qs.getNum();                      //调用用遍历解决问题的方法
        System.out.println(qs.result);    //输出满足条件的六位数集合
        System.out.println(qs.getSum());  //输出满足条件的六位数的和
    }
}

class QSMethod {
    ArrayList<Integer> result = new ArrayList<>();      //储存符合的六位数

    protected void getNum() {
        //找出所有六位数中有哪几个是符合条件的
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            for (int n = 0; n < 10; n++) {
                                //六次循环嵌套构成六位数
                                int numAll = i * 100000 + j * 10000 + k * 1000 + l * 100 + m * 10 + n;
                                int numFront = i * 100 + j * 10 + k;
                                int numAfter = l * 100 + m * 10 + n;
                                double division = numAll / (double) numAfter;
                                if (division == Math.pow(1 + numFront, 2)) {
                                    result.add(numAll);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    protected int getSum() {
        //求和
        int sum = 0;
        for (int tmp : result) {
            sum += tmp;
        }
        return sum;
    }
}