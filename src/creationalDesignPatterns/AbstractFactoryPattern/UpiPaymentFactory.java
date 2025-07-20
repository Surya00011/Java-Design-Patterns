package creationalDesignPatterns.AbstractFactoryPattern;
/**
 *  {@code UpiPaymentFactory} is a concrete factory class responsible for creating
 *  * instances of {@link UpiPayment}. and
 *  * instances of {@link UpiPaymentsApp}
 */
class UpiPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new UpiPayment();
    }

    @Override
    public PaymentApp createPaymentApp() {
        return new UpiPaymentsApp();
    }
}
