package payment.erroner;

public class PaymentProcessor{
    public void processPayment(String paymentType, double amount){
        if(paymentType.equals("mobil_pay")){
            System.out.println("Processing mobile payment: "+amount);
        }else if(paymentType.equals("credit_card")){
            System.out.println("Processing credit_card: "+amount);
        }else if(paymentType.equals("paypal")){
            System.out.println("Processing paypal: "+amount);
        }else if(paymentType.equals("crypto")){
            System.out.println("Processing crypto: "+amount);
        } 
    }
}