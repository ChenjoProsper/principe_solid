package payment.solution;

public class CreditCartPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card: "+amount + " FCFA");
    }
}
