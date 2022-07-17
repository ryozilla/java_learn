package train7;

/*
 * 交通信号灯
 * 编写交通类，把表示遵守交通规则的方法设为 final 方法，
 * 不管是行人、非机动车，还是机动车，要遵守的交通规则都是一样的。
 * 在行至有交通信号灯的路口时，要遵守“红灯停、绿灯行”的交通规则。
 * */
public class Training12 {
    public static void main(String[] args) {
        Pedestrian ped = new Pedestrian();
        ped.rule();
        MotorVehicle mot = new MotorVehicle();
        mot.rule();
        NoMotorVehicle nom = new NoMotorVehicle();
        nom.rule();
    }
}

class Traffic {
    protected final void rule() {
        System.out.println("无论是行人、机动车还是非机动车，都要遵守\"红灯停，绿灯行\"的规则。");
    }
}

class Pedestrian extends Traffic {
    //行人类
}

class MotorVehicle extends Traffic {
    //机动车类
}

class NoMotorVehicle extends Traffic {
    //非机动车类
}



