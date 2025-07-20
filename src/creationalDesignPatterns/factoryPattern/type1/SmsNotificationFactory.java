package creationalDesignPatterns.factoryPattern.type1;

/**
 * {@code SmsNotificationFactory} is a concrete factory class that creates instances of {@link SmsNotification}.
 * <p>
 * This class implements the {@link NotificationFactory} interface and encapsulates the logic
 * for instantiating SMS-based notifications.
 * @author Surya
 * @see NotificationFactory
 * @see SmsNotification
 * </p>
 */
public class SmsNotificationFactory implements NotificationFactory {

    /**
     * Creates and returns a new {@link SmsNotification} instance.
     *
     * @return a {@link Notification} object that represents an SMS notification
     */
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
