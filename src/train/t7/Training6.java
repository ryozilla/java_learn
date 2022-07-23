package train.t7;

/*
 * 动物分类
 * 创建动物类，动物类有3个子类：鹰、青蛙和蝗虫。
 * 创建3个动物类，分别强制转成3个子类，执行3个子类吃食物的方法。
 * */
public class Training6 {
    public static void main(String[] args) {
        //创建三个动物类
        AnimalT6 animal1 = new Eagle();
        AnimalT6 animal2 = new Frog();
        AnimalT6 animal3 = new Locust();

        //将动物类强制转换成子类
        Eagle eagle = (Eagle) animal1;
        Frog frog = (Frog) animal2;
        Locust locust = (Locust) animal3;

        //执行子类方法
        eagle.eat();
        frog.eat();
        locust.eat();
    }
}

class AnimalT6 {
    //动物类
    protected void eat() {
        System.out.println("动物吃东西");
    }
}

class Eagle extends AnimalT6 {
    //鹰类
    @Override
    protected void eat() {
        System.out.println("鹰吃东西");
    }
}

class Frog extends AnimalT6 {
    //青蛙类
    @Override
    protected void eat() {
        System.out.println("青蛙吃东西");
    }
}

class Locust extends AnimalT6 {
    //蝗虫类
    @Override
    protected void eat() {
        System.out.println("蝗虫祸害苗子");
    }
}