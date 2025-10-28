package payment.solution;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCartPayment();
        PaymentProcessor2 processor1 = new PaymentProcessor2(creditCard);
        processor1.processPayment(10000);


        PaymentMethod paypal = new PaypalPayment();
        PaymentProcessor2 processor2 = new PaymentProcessor2(paypal);
        processor2.processPayment(5000);
    }
}
