package NotificationSystem.Core;

public abstract class NotificationFactory {
    private final Notification notification = createNotificationMode();

    public abstract Notification createNotificationMode();

    public void sendNotification(){
        notification.notifyUser();
    }
}
