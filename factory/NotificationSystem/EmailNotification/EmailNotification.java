package NotificationSystem.EmailNotification;

import NotificationSystem.Core.Notification;
import NotificationSystem.Core.NotificationFactory;

public class EmailNotification extends NotificationFactory {
    @Override
    public Notification createNotificationMode() {
        return new EmailNotificationService();
    }
}
