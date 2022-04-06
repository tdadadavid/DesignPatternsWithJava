package NotificationSystem.CallNotification;

import NotificationSystem.Core.Notification;

public class CallNotificationService implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User notified via customer care call service");
    }
}
