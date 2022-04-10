package NotificationSystem;

import NotificationSystem.EmailNotification.EmailNotification;;

public class UserNotificationController extends EmailNotification {
    public void sendNow(){
        sendNotification();
    }
}
