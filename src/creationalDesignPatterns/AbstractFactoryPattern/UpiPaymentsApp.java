package creationalDesignPatterns.AbstractFactoryPattern;
/**
 *  {@code UpiPaymentsApp} is a concrete Product class implements {@link PaymentApp}
 */
public class UpiPaymentsApp implements PaymentApp{

    @Override
    public void showPaymentApp() {
        System.out.println("App used: UPI-App");
    }
}
