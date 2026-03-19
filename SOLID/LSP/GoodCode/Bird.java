package GoodCode;

public class Bird {
    void eat(){
        System.out.println("Bird is eating");
    }
}
class FlyingBird extends Bird{
    void fly(){
        System.out.println("Can Fly");
    }
}

class Sparrow extends FlyingBird{
    void fly(){
        System.out.println("Sparrow can fly");
    }
}

class Ostrich extends Bird{
    void eat(){
        System.out.println("Ostrich Bird is eating");
    }
    void play(){
        System.out.println("Can play");
    }
}
