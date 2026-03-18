package GoodCode;

import GoodCode.PaymentMethod;

public class Creditcard implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Pay through Credit Card:"+amount);
    }
}
