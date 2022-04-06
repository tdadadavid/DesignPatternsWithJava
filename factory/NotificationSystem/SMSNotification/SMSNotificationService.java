package NotificationSystem.SMSNotification;

import NotificationSystem.Core.Notification;

public class SMSNotificationService implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User notified via SMS");
    }
}
