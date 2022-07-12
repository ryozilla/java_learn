package train6;

/*
 * 设置信用卡密码
 * 创建信用卡类，有两个成员变量，分别是卡号和密码，
 * 如果用户开户时没有设置初始密码，则使用“123456”作为默认密码。
 * 设计两个不同的构造方法，分别用于用户设置密码和用户未设置密码两种构造场景。
 * */
public class Training4 {
    public static void main(String[] args) {
        //调用有形参的构造方法
        CreditCard user1 = new CreditCard("182739");
        //调用无形参的构造方法
        CreditCard user2 = new CreditCard();
        System.out.println("用户为 user1, " + user1.getPsw());
        System.out.println("用户为 user2, " + user2.getPsw());
    }
}

class CreditCard {
    String psw;

    public CreditCard(String psw) {
        this.psw = psw;
    }

    public CreditCard() {
        this("123456");
    }

    public String getPsw() {
        return "密码为" + psw;
    }
}