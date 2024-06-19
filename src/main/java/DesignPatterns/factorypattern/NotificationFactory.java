package DesignPatterns.factorypattern;

public class NotificationFactory {
    private static Notification notification;

    public static Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        if (channel.equals("SMS")) {
            notification = new SMSNotification();
        } else if (channel.equals("Email")) {
            notification = new EmailNotification();
        } else if (channel.equals("Push")) {
            notification = new PushNotification();
        }
        return notification;
    }
}
