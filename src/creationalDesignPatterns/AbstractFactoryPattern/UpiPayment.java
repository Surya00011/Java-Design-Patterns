package creationalDesignPatterns.AbstractFactoryPattern;
/**
 *  {@code UpiPayment} is a concrete Product class implements {@link Payment}
 */
class UpiPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment Done via UPI");
    }
}