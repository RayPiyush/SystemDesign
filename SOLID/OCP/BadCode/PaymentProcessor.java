package BadCode;

public class PaymentProcessor {
    public void processPayment(String paymentMethod){
        if(paymentMethod.equalsIgnoreCase("CreditCard")){
            System.out.println("Pay through credit card");
        }
        else if(paymentMethod.equalsIgnoreCase("DebitCard")){
            System.out.println("Pay through Debit card");
        }
        else if(paymentMethod.equalsIgnoreCase("UPI")){
            System.out.println("Pay through UPI");
        }
        else{
            throw new IllegalArgumentException("Unsupported Payment Method"+paymentMethod);
        }
        //Suppose I need to add any another payment method then I have to modified this code
        //that means we are violating OCP
        //thats why it is bad code
    }
}
