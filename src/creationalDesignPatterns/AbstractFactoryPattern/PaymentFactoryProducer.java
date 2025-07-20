package creationalDesignPatterns.AbstractFactoryPattern;

/**
 * Factories of Factories
 */
public class PaymentFactoryProducer {
    /**
     * getFactory Provides instances of Factories
     * @param paymentMode
     * @return PaymentFactory
     */
    public static PaymentFactory getFactory(PaymentMode paymentMode){
        return switch (paymentMode) {
            case UPI -> new UpiPaymentFactory();
            case CREDIT_CARD -> new CreditCardPaymentFactory();
        };
    }
}
