package NotificationSystem.Core;

public abstract class NotificationFactory {
    private final Notification notification = createNotificationMode();

    public void sendNotification(){
        notification.notifyUser();
    }

    // Factory method pattern
    public abstract Notification createNotificationMode();
}
