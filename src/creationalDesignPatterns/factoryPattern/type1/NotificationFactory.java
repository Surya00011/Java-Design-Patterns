package creationalDesignPatterns.factoryPattern.type1;

/**
 * {@code NotificationFactory} is an interface that defines the factory method
 * for creating {@link Notification} objects.
 * <p>
 * Concrete implementations of this interface encapsulate the logic
 * for instantiating specific types of notifications such as email or SMS.
 * </p>
 *
 * @author Surya
 * @see Notification
 * @see EmailNotificationFactory
 * @see SmsNotificationFactory
 */
public interface NotificationFactory {

    /**
     * Creates and returns an instance of a {@link Notification}.
     *
     * @return a {@link Notification} implementation
     */
    Notification createNotification();
}
