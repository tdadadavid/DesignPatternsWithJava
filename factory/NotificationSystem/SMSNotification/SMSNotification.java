package NotificationSystem.SMSNotification;

import NotificationSystem.Core.Notification;
import NotificationSystem.Core.NotificationFactory;

public class SMSNotification extends NotificationFactory {
    @Override
    public Notification createNotificationMode() {
        return new SMSNotificationService();
    }
}
