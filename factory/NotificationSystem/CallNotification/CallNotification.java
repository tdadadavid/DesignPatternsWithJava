package NotificationSystem.CallNotification;

import NotificationSystem.Core.Notification;
import NotificationSystem.Core.NotificationFactory;

public class CallNotification extends NotificationFactory {
    @Override
    public Notification createNotificationMode() {
        return new CallNotificationService();
    }
}
