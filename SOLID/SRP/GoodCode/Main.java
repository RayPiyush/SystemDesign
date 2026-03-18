package GoodCode;

public class Main {
    public static void main(String[] args) {
        Invoice invoice=new Invoice(100.5);
        invoice.generateBill();

        InvoiceRepository invoiceRepository=new InvoiceRepository();
        invoiceRepository.saveToDB();

        EmailNotification emailNotification=new EmailNotification();
        emailNotification.sendEmailNotification();
    }
    
}
