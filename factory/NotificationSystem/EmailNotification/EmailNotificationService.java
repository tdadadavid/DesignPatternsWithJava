package NotificationSystem.EmailNotification;

import NotificationSystem.Core.Notification;

public class EmailNotificationService implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User notified via email");
    }
}
