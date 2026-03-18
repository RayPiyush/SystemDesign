package GoodCode;

//import GoodCode.Creditcard;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor=new PaymentProcessor();
        Creditcard creditcard=new Creditcard();
        paymentProcessor.processPayment(creditcard, 10000);
    }
}
