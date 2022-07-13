package train7;

/*
 * 让猫狗是同类
 * 重写 equals()方法，进而得到一个荒唐的结果：猪和狗是同类。
 * */
public class Training4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Pig pig = new Pig();
        System.out.println(dog.equals(pig));
    }
}

class Animal {
    public boolean equals(Animal obj) {
        if (this == obj) {
            return true;
        } else if (this instanceof Pig && obj instanceof Dog) {
            return true;
        } else return this instanceof Dog && obj instanceof Pig;
    }
}

class Pig extends Animal {
}

class Dog extends Animal {
}

