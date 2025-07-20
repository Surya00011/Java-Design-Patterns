package creationalDesignPatterns.factoryPattern.type1;

/**
 * Represents an email-based notification.
 * <p>
 * This class is a concrete implementation of the {@link Notification} interface
 * and defines the behavior for sending email notifications to users.
 * </p>
 */
public class EmailNotification implements Notification {

    /**
     * Sends an email notification to the specified user.
     *
     * @param userName the name of the user to whom the notification is sent
     * @return a message confirming the email notification
     */
    @Override
    public String sendNotification(String userName) {
        return "Hi "+userName+" from EmailNotification service";
    }
}
