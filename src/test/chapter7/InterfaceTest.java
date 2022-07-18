package test.chapter7;

//接口测试
/*
 * 一个抽象类AudioOutput类有着两个子类Speaker和Earphone，Bilibili单独成类
 * 三个类都想用到stream()播放方法，但三个类没有公共的父类
 * 于是使用接口让三个类都能用到同名方法
 * */
public class InterfaceTest {
    public static void main(String[] args) {
        Speaker speak = new Speaker();
        speak.stream();
        Earphone ear = new Earphone();
        ear.stream();
        Bilibili bi = new Bilibili();
        bi.stream();
    }
}

interface activeInterface {
    //一个接口
    void stream();  //播放
}

class Bilibili implements activeInterface {
    @Override
    public void stream() {
        System.out.println("进入b站播放视频。");
    }

}

abstract class AudioOutput implements activeInterface {
    //音频输出设备
}

class Speaker extends AudioOutput implements activeInterface {
    //音响类
    //父类继承了接口，子类的继承接口可写可不写
    @Override
    public void stream() {
        System.out.println("将音响插上电源和电脑，准备进行播放。");
    }
}

class Earphone extends AudioOutput {
    //耳机类
    @Override
    public void stream() {
        System.out.println("将耳机插在了电脑/手机上，准备播放。");
    }
}

