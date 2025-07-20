package creationalDesignPatterns.AbstractFactoryPattern;

/**
 *  {@code CreditCardPaymentFactory} is a concrete factory class responsible for creating
 *  * instances of {@link CreditCardPayment}. and
 *  * instances of {@link BankApp}
 */
class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
    @Override
    public PaymentApp createPaymentApp() {
        return new BankApp();
    }
}