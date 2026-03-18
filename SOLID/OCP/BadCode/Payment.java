package BadCode;

public class Payment {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor=new PaymentProcessor();
        paymentProcessor.processPayment("CreditCard");
        paymentProcessor.processPayment("UPI");



    }
}
