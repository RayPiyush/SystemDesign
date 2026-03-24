package BadCode;

import BadCode.EmailService;

public class NotificationService {

    public static void main(String[] args) {
        EmailService emailService=new EmailService();
        emailService.send();

        SmsService smsService=new SmsService();
        smsService.send();
    }
    
}
