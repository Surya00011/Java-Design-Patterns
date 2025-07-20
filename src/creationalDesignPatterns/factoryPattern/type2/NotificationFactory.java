package creationalDesignPatterns.factoryPattern.type2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {
    private static final Map<String, Supplier<Notification>> registry = new HashMap<>();

    static {
        registry.put("email", EmailNotification::new);
        registry.put("sms", SmsNotification::new);
    }

    public static Notification create(String type) {
        Supplier<Notification> supplier = registry.get(type.toLowerCase());
        if (supplier == null)
            throw new IllegalArgumentException("Unknown type: " + type);
        return supplier.get();
    }

}
