package creationalDesignPatterns.factoryPattern.type2;

public class EmailNotification implements Notification {
    @Override
    public String sendNotification(String userName) {
        return "Hi "+userName+" from EmailNotification service";
    }
}
