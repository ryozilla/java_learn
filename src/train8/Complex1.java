package train8;

/*
 * 划火柴
 * 定义一个点燃接口，再定义一个火柴类实现点燃接口，
 * 每根火柴对象只能调用一次点燃方法，这种对象该如何创建？
 * */
public class Complex1 {
    public static void main(String[] args) {
        new Match() {
            @Override
            public void ignite() {
                if (!ignited) {
                    System.out.println("火柴划燃");
                    ignited = true;
                } else {
                    System.out.println("火柴已经被划燃了");
                }
            }
        }.ignite();
    }
}

interface IgniteAble {
    void ignite();
}

abstract class Match implements IgniteAble {
    boolean ignited = false;
}