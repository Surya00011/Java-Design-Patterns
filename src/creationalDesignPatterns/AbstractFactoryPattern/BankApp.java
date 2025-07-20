package creationalDesignPatterns.AbstractFactoryPattern;

/**
 *  {@code BankApp} is a concrete Product class implements {@link PaymentApp}
 */
public class BankApp implements PaymentApp{

    @Override
    public void showPaymentApp() {
        System.out.println("App used: Native Banking App");
    }
}
