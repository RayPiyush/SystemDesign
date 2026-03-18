package BadCode;

public class Invoice {
    private int amount;

    public Invoice(int amount){
        this.amount=amount;
    }

    public void generateBill(){
        System.out.println("Your Bill is amount:"+amount);
    }

    public void saveToDB(){
        System.out.println("Save Bill To Database");
    }

    public void sendEmailNotification(){
        System.out.println("Email notification sent");
    }
}
