package payment.solution;

public class PaypalPayment implements PaymentMethod{
    @Override
    public  void processPayment(double amount){
        System.out.println("Processing paypal: "+amount+" FCFA");
    }
}
