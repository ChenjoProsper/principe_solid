package payment.erroner;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("mobil_pay", 100.0);
        processor.processPayment("credit_card", 250.0);
        processor.processPayment("paypal", 75.5);
        processor.processPayment("crypto", 300.0);
    }
}
