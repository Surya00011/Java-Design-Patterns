package creationalDesignPatterns.factoryPattern.type1;

/**
 * {@code Notification} is the product interface in the Factory Design Pattern.
 * <p>
 * It defines a contract for sending notifications to users. Concrete implementations
 * such as {@link EmailNotification} and {@link SmsNotification} provide specific behaviors
 * for sending different types of notifications.
 * </p>
 *
 * @author Surya
 * @see EmailNotification
 * @see SmsNotification
 */
public interface Notification {

    /**
     * Sends a notification to the specified user.
     *
     * @param userName the name of the user to receive the notification
     * @return a message confirming that the notification was sent
     */
    String sendNotification(String userName);
}
