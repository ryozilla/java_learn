package train7;

/*
 * 模拟轿车驾驶
 * 对于轿车而言，至少有油门踏板和剩车踏板。
 * 模拟自动挡车型的正确驾驶方式。
 * */

// 确实不懂开车于是摆一个答案在这 QwQ

public class Training5 {
    public static void main(String[] args) {
        AutoCar autoCar = new AutoCar(); //创建对象autoCar
        System.out.println("自动挡汽车有" + autoCar.pedalAuto + "块踏板。"); //控制台输出
        autoCar.stepOnGas(); //调用子类(AutoCar)中重写的stepOnGas()方法
        autoCar.stepOnBrake(); //调用子类(AutoCar)中重写的stepOnBrake()方法
    }
}

class Car2 //创建一个Car类
{
    public int pedalAuto = 2; //定义一个用public修饰的成员变量“自动挡汽车的踏板数”，并初始化
    public int pedalHand = 3; //定义一个用public修饰的成员变量“手动挡汽车的踏板数”，并初始化

    public void stepOnGas() //创建一个普通的方法stepOnGas()
    {
        System.out.println("油门踏板"); //控制台输出
    }

    public void stepOnBrake() //创建一个普通的方法stepOnBrake()
    {
        System.out.println("刹车踏板"); //控制台输出
    }
}

class HandCar extends Car2 //创建一个HandCar类继承Car
{
    @Override
    public void stepOnGas() //重写父类Car的stepOnGas()方法（踩油门）
    {
        System.out.println("右脚踩油门踏板！"); //控制台输出
    }
    @Override
    public void stepOnBrake() //重写父类Car的stepOnBrake()方法（踩刹车）
    {
        System.out.println("右脚踩刹车踏板！"); //控制台输出
    }

    public void stepOnClutch() //创建一个普通的stepOnClutch()方法（踩离合）
    {
        System.out.println("左脚踩离合器踏板！"); //控制台输出
    }
}

class AutoCar extends Car2 //创建一个AutoCar类继承Car
{
    @Override
    public void stepOnGas() //重写父类Car的stepOnGas()方法
    {
        System.out.println("右脚踩油门踏板！"); //控制台输出
    }
    @Override
    public void stepOnBrake() //重写父类Car的stepOnBrake()方法
    {
        System.out.println("右脚踩刹车踏板！"); //控制台输出
    }
}
