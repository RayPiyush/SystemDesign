package GoodCode;

import GoodCode.PaymentMethod;

public class DebitCard implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Pay through Debit Card"+amount);
    }
}
