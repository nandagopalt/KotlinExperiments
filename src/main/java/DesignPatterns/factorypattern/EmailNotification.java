package DesignPatterns.factorypattern;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email Notification !");
    }
}
