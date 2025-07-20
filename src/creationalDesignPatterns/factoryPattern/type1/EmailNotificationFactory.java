package creationalDesignPatterns.factoryPattern.type1;

/**
 * {@code EmailNotificationFactory} is a concrete factory class responsible for creating
 * instances of {@link EmailNotification}.
 * <p>
 * This class implements the {@link NotificationFactory} interface and provides the
 * creation logic for email-based notifications.
 * </p>
 *
 * @author Surya
 * @see NotificationFactory
 * @see EmailNotification
 */
public class EmailNotificationFactory implements NotificationFactory {

    /**
     * Creates and returns a new {@link EmailNotification} instance.
     *
     * @return a {@link Notification} object that represents an email notification
     */
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
