package creationalDesignPatterns.factoryPattern.type1;

public class Main {
    public static void main(String[] args) {
        NotificationClient smsFactory = new NotificationClient(new SmsNotificationFactory());
        Notification smsNotification = smsFactory.getNotification();
        System.out.println(smsNotification.sendNotification("Surya"));

        NotificationClient emailFactory = new NotificationClient(new EmailNotificationFactory());
        Notification emailNotification = emailFactory.getNotification();
        System.out.println(emailNotification.sendNotification("Josh"));
        EmailNotificationFactory fact = new EmailNotificationFactory();
        Notification email = fact.createNotification();
        System.out.println(email.sendNotification("Mani"));
    }
}
