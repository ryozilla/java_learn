package train.t7;

/*
 * 五颜六色的接口
 * 创建一个表示五颜六色的接口 Colorful ，接口中有一个表示点亮的抽象方法shine()。
 * 编写一段代码，实现红灯发红光，黄灯发黄光，绿灯发绿光。
 * */
public class Training16 {
    public static void main(String[] args) {
        Colorful col1 = new RedShine();
        col1.shine();
        Colorful col2 = new YellowShine();
        col2.shine();
        Colorful col3 = new GreenShine();
        col3.shine();
    }
}

interface Colorful {
    void shine();      //发光
}

class RedShine implements Colorful {
    @Override
    public void shine() {
        System.out.println("红灯发红光");
    }
}

class YellowShine implements Colorful {
    @Override
    public void shine() {
        System.out.println("黄灯发黄光");
    }
}

class GreenShine implements Colorful {
    @Override
    public void shine() {
        System.out.println("绿灯发绿光");
    }
}