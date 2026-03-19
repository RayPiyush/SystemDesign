package BadCode;

public class Bird {
    void fly(){
        System.out.println("Bird can fly");
    }
    
}
class Sparrow extends Bird{
    void fly(){
        System.out.println("Sparrow can fly");
    }
}

class Ostrich extends Bird{
    void fly(){
        throw new RuntimeException("Cant Fly");
    }
}
