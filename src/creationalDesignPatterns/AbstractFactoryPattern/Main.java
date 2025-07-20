package creationalDesignPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        // Using UPI Payment
        PaymentFactory factory1 = PaymentFactoryProducer.getFactory(PaymentMode.UPI);
        Payment payment1 = factory1.createPayment();
        PaymentApp app1 = factory1.createPaymentApp();
        app1.showPaymentApp();
        payment1.makePayment();

        System.out.println();

        // Using Credit Card Payment
        PaymentFactory factory2 = PaymentFactoryProducer.getFactory(PaymentMode.CREDIT_CARD);
        Payment payment2 = factory2.createPayment();
        PaymentApp app2 = factory2.createPaymentApp();
        app2.showPaymentApp();
        payment2.makePayment();
    }
}
