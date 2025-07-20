package creationalDesignPatterns.factoryPattern.type2;

public class SmsNotification implements Notification {
    @Override
    public String sendNotification(String userName) {
        return "Hi "+userName+" from SMS Notification service";
    }
}
