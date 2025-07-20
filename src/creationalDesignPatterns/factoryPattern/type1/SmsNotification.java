package creationalDesignPatterns.factoryPattern.type1;

/**
 * Represents an SMS-based notification.
 * <p>
 * This class is a concrete implementation of the {@link Notification} interface
 * and defines the behavior for sending SMS notifications to users.
 * </p>
 */
public class SmsNotification implements Notification{

    /**
     * Sends an SMS notification to the specified user.
     *
     * @param userName the name of the user to whom the notification is sent
     * @return a message confirming the SMS notification
     */
    @Override
    public String sendNotification(String userName) {
        return "Hi "+userName+" from SMS Notification service";
    }
}
