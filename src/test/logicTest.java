package test;

public class logicTest {
    public static void main(String[] args){
        boolean boo1 = true, boo2 = false;

        //六种逻辑运算符
        {/*
            & 逻辑与
            && 短路与
            | 逻辑或
            || 短路或
            ^ 逻辑异或
            ！ 逻辑非
         */
            System.out.println("boo1 & boo2 = " + (boo1 & boo2));
            System.out.println("boo1 && boo2 = " + (boo1 && boo2));
            System.out.println("boo1 | boo2 = " + (boo1 | boo2));
            System.out.println("boo1 || boo2 = " + (boo1 || boo2));
            System.out.println("boo1 ^ boo2 = " + (boo1 ^ boo2));
            System.out.println("!boo1 = " + (!boo1) + "\n");
        }

        //单与和双与的区别
        {
            boolean boo3 = boo2 && boo1 && (1%0 == 1);
            System.out.println("boo3 = " + boo3);
            //boolean boo4 = boo2 & boo1  &(1%0 == 1);
            //System.out.println("boo4 = " + boo4);
            System.out.println();
            //短路与&& 和逻辑与&的不同点在于：
            //当第一个元素为假时，短路与不再对第二个元素进行判断，即执行“有假则假”原则，提高了执代码效率。
            //当第一个元素为假时，逻辑与仍会对第二个元素进行判断，即执行“全真为真”原则，效率较低。
        }

        //单或和双或的区别
        {
            boolean boo3 = boo2 || boo1 || (1%0 == 1);
            System.out.println("boo3 = " + boo3);
            //boolean boo4 = boo2 | boo1 | (1%0 == 1);
            //System.out.println("boo4 = " + boo4);
            //短路或|| 和逻辑或| 的不同点在于：
            //当第一个元素为假时，短路或不再对第二个元素进行判断，即执行“有真则真”原则，提高了执代码效率。
            //当第一个元素为假时，逻辑或仍会对第二个元素进行判断，即执行“全假则假”原则，效率较低。
        }
    }
}
