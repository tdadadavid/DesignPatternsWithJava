package NotificationSystem;

import NotificationSystem.EmailNotification.EmailNotification;

public class Demo {
    public static void main(String[] args) {
        sendNotificationNow();
    }

    public static void sendNotificationNow(){
        var notifier = new EmailNotification();
        notifier.sendNotification();
    }
}
