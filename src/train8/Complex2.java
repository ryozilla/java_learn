package train8;

/*
 * 跳动的心脏
 * 心脏是动物的重要器官，不断跳动的心脏就意味着鲜活的生命力。
 * 现在创建一个人类，把心脏类设计为人类里面的一个成员内部类。
 * 心脏类有一个跳动的方法，在一个人被创建时，心脏就开始不断地跳动。
 * */
public class Complex2 {
    public static void main(String[] args) {
        new Human2();
    }
}

class Human2 {
    public Human2() {
        System.out.println("生成一个人类");
        new Heart().startBeat();
    }

    class Heart {
        protected void startBeat() {
            System.out.println("心脏开始跳动");
        }
    }
}

