package id.lmnzr.teaching.designpattern.payment.factory;

public class CreditCardPayment extends Payment {

    @Override
    public void requestPaymentData() {
        System.out.println("Pay with credit card !");
        System.out.println("Input name, date, number, cvv !");
    }
}
