package creationalDesignPatterns.factoryPattern.type2;

public class Main {
    public static void main(String[] args) {
        Notification emailNotification = NotificationFactory.create("email");
        System.out.println(emailNotification.sendNotification("Surya"));
        Notification smsNotification = NotificationFactory.create("sms");
        System.out.println(smsNotification.sendNotification("Lenin"));
    }
}
