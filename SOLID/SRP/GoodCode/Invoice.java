package GoodCode;

public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount=amount;
    }

    public void generateBill(){
        System.out.println("Your Bill Amount is: "+amount);
    }
}
