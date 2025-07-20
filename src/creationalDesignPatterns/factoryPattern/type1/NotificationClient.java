package creationalDesignPatterns.factoryPattern.type1;

/**
 * {@code NotificationClient} is the client class in the Factory Design Pattern.
 * <p>
 * It depends on the {@link NotificationFactory} interface to create a {@link Notification}
 * instance without knowing the specific type (e.g., email or SMS). This promotes
 * loose coupling and supports the Open/Closed Principle.
 * </p>
 *
 * <p>
 * The client retrieves the notification instance using {@link #getNotification()} and can
 * then use it to send messages.
 * </p>
 *
 * @author Surya
 * @see Notification
 * @see NotificationFactory
 * @see EmailNotificationFactory
 * @see SmsNotificationFactory
 */
public class NotificationClient {

    private final Notification notification;

    /**
     * Constructs a {@code NotificationClient} with the given factory.
     *
     * @param notificationFactory the factory used to create the notification instance
     */
    public NotificationClient(NotificationFactory notificationFactory) {
        this.notification = notificationFactory.createNotification();
    }

    /**
     * Returns the notification instance created by the factory.
     *
     * @return a {@link Notification} instance
     */
    public Notification getNotification() {
        return notification;
    }
}
