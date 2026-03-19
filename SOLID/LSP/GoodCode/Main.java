package GoodCode;

public class Main {
    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.eat();
        Bird bird2=new Ostrich();
        bird2.eat();
        
        // bird2.play();
        Ostrich ostrich=new Ostrich();
        ostrich.eat();
        
        ostrich.play();
        FlyingBird bird3=new Sparrow();
        bird3.fly();
    }
    
}
