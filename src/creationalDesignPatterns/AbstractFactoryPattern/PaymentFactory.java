package creationalDesignPatterns.AbstractFactoryPattern;

/**
 * Abstract PaymentFactory Interface
 */
public interface PaymentFactory {
   public Payment createPayment();
   public PaymentApp createPaymentApp();
}
