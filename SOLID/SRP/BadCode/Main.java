package BadCode;
public class Main {
    public static void main(String[] args) {
        Invoice invoice=new Invoice(50);
        invoice.generateBill();
        invoice.saveToDB();
        invoice.sendEmailNotification();
    }
    
}
