package GoodCode;


public class EmailService implements NotificationChannel{
    @Override
    public void send(String msg){
        System.out.println("Email is Sent:"+msg);
    }
}
