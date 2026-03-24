package GoodCode;



public class Main {
    public static void main(String[] args) {
        NotificationService emailService=new NotificationService(new EmailService());
        emailService.notify("Email Notify");

        NotificationService smsService=new NotificationService(new SmsService());
        smsService.notify("SMS notify");
    }
}
