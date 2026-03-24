package GoodCode;


public class SmsService implements NotificationChannel{
    @Override
    public void send(String msg){
        System.out.println("SMS is Sent:"+msg);
    }
}
