package designpatterns.factorypattern;

public class NotificationService {
    public static void main(String args[]) {
        // Let subclass decide which object to be created based on the input parameter passed to the factory method
        Notification notificationService;
        notificationService = NotificationFactory.createNotification("SMS");
        notificationService.notifyUser();
        notificationService = NotificationFactory.createNotification("Email");
        notificationService.notifyUser();
        notificationService = NotificationFactory.createNotification("Push");
        notificationService.notifyUser();
        notificationService = NotificationFactory.createNotification("");
        if (notificationService != null) notificationService.notifyUser();
        notificationService = NotificationFactory.createNotification(null);
        if (notificationService != null) notificationService.notifyUser();
    }
}
