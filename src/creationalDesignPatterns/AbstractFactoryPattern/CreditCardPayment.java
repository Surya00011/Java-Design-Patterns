package creationalDesignPatterns.AbstractFactoryPattern;

/**
 *  {@code CreditCardPayment} is a concrete Product class implements {@link Payment}
 */
class CreditCardPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment Done via CreditCard");
    }
}