package designpatterns.factorypattern;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification !");
    }
}
